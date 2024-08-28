package app;

class Main implements Printer {


    public static class Message {
        private final String text;  // Mark fields as final
        private final String sender;  // Mark fields as final

        // Constructor for all parameters
        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        // Getters only (Setters removed)
        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }
    }

    // Step 3: Implement the print method
    @Override
    public void print(Message message) {
        if (message.getSender() == null || message.getSender().isEmpty()) {
            if (message.getText() == null || message.getText().isEmpty()) {
                // Replace anonymous class with a lambda expression
                Printer anonymousPrinter = msg -> System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                anonymousPrinter.print(message);
            } else {
                System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
            }
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Main printer = new Main();

        // Test cases
        Message message1 = new Message("Привіт, світ!", "Іван");
        printer.print(message1);

        Message message2 = new Message("Привіт, світ!", "");
        printer.print(message2);

        Message message3 = new Message(null, null);
        printer.print(message3);
    }
}
