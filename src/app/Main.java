package app;

class Main implements Printer {


    public record Message(String text, String sender) {
    }

    @Override
    public void print(Message message) {
        if (message.sender() == null || message.sender().isEmpty()) {
            if (message.text() == null || message.text().isEmpty()) {
                Printer anonymousPrinter = msg -> System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                anonymousPrinter.print(message);
            } else {
                System.out.println("Анонімний користувач відправив повідомлення: " + message.text());
            }
        } else {
            System.out.println("Користувач " + message.sender() + " відправив повідомлення: " + message.text());
        }
    }

    public static void main(String[] args) {
        Main printer = new Main();

        Message message1 = new Message("Привіт, світ!", "Іван");
        printer.print(message1);

        Message message2 = new Message("Привіт, світ!", "");
        printer.print(message2);

        Message message3 = new Message(null, null);
        printer.print(message3);
    }
}
