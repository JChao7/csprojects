public class OrderPrinter {
    private String printHeader;
    private String LineItem;

    public void print(Order order) {
        System.out.print(this.printHeader);
        System.out.print(this.LineItem + " , ");
    }
}