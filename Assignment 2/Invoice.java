public class Invoice {

    private long totalNumberOfLineItems;
    private long totalQuantity;
    private double totalPrice;
    private double totalTax;
    private int lineItems;

    public Invoice(long totalNumberOfLineItems, long totalQuantity, 
    double totalPrice, double totalTax) {
        
    }

    public long getTotalOfLineItems() {
        return this.lineItems.totalNumberOfLineItems;
    }

    public long getTotalQuantity() {
        return this.lineItems.totalQuantity;
    }

    public long getTotalPrice() {
        return this.lineItems.totalPrice;
    }

    public double getTotalTax() {
        return this.lineItems.totalTax;
    }
}