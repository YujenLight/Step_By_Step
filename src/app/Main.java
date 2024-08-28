package app;

public class Main {

    public static void main(String[] args) {
        PrinterImpl printer = new PrinterImpl();

        PrinterImpl.Message message1 = new PrinterImpl.Message("Привіт, світ!", "Іван");
        printer.print(message1);

        PrinterImpl.Message message2 = new PrinterImpl.Message("Привіт, світ!", "");
        printer.print(message2);

        PrinterImpl.Message message3 = new PrinterImpl.Message(null, null);
        printer.print(message3);
    }
}

