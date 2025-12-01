package systemdesign.solid.interfacesegregation;

public class CorrectCode {
    interface Printer {
        void print();
    }

    interface Scanner {
        void scan();
    }

    interface FaxMachine {
        void fax();
    }

    static class BasicPrinter implements Printer {
        @Override
        public void print() {
            System.out.println("Printing document...");
        }
    }

    static class AdvancedPrinter implements Printer, Scanner, FaxMachine {
        @Override
        public void print() {
            System.out.println("Printing document...");
        }

        @Override
        public void scan() {
            System.out.println("Scanning document...");
        }

        @Override
        public void fax() {
            System.out.println("Faxing document...");
        }
    }

    public static void main(String[] args) {
        Printer simplePrinter = new BasicPrinter();
        simplePrinter.print();

        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        advancedPrinter.print();
        advancedPrinter.scan();
        advancedPrinter.fax();

        // Now, BasicPrinter is not forced to implement scan and fax methods, adhering to ISP
        //separation of concerns, leading to correct code, making system more modular and maintainable and robust
    }
}
