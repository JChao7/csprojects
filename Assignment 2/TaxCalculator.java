public class TaxCalculator {
    private double taxRate;
    private int quantity;
    private double unitPrice;
    private double total;

    public TaxCalculator(double taxRate) {
        
    }

    public TaxCalculator() {
        this.taxRate = 0.2;
    }

    public double calculateTax(Order order) {
        if (order.LineItems > 6) {
            this.taxRate = 0;
            this.total = this.quantity * this.unitPrice;
        }

        else {
            this.total = this.quantity * this.unitPrice * this.taxRate;
        }
        return this.total;
    }
}