public class Demo07 {
    public static void main(String[] args) {
        Printer p = new BasicPrinter();
        p.print("Hello");

        AdvancedPrinter advPrint = new AdvancedPrinter();
        advPrint.print("Report");
        advPrint.scan("/tmp/out");
        advPrint.fax("123456");
    }
}
