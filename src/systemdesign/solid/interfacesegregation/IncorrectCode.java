package systemdesign.solid.interfacesegregation;

//says applies only to interfaces, that segregate interfaces based on their functionality,
// create client-specific interfaces so that clients only need to know about the methods that are of interest to them,
// rather than being forced to depend on methods they do not use. This leads to a more modular and maintainable codebase.
public class IncorrectCode {
    interface Machine{
        void print();
        void scan();
        void fax();
    }

    static class AllInOnePrinter implements Machine{
        @Override
        public void print() {
            System.out.println("Printing document");
        }

        @Override
        public void scan() {
            System.out.println("Scanning document");
        }

        @Override
        public void fax() {
            System.out.println("Faxing document");
        }
    }

    class BasicPrinter implements Machine{
        @Override
        public void print() {
            System.out.println("Printing document");
        }

        @Override
        public void scan() {
            throw new UnsupportedOperationException("Scan not supported");
        }

        @Override
        public void fax() {
            throw new UnsupportedOperationException("Fax not supported");
        }
    }

    public static void main(String[] args) {
        Machine printer = new AllInOnePrinter();
        printer.print();
        printer.scan();
        printer.fax();

        Machine basicPrinter = new IncorrectCode().new BasicPrinter();
        basicPrinter.print();
        // The following lines would throw exceptions, violating ISP
        basicPrinter.scan();
        basicPrinter.fax();
    }

    //BasicPrinter is forced to implement methods it does not use(scan and fax), leading to incorrect code violating ISP
}
