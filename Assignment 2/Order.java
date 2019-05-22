import java.util.ArrayList;

public class Order {
    private ArrayList<LineItem> lineItems;
    private String productName;
    private long quantity;
    private double unitPrice;

    public Order() {
        lineItems = new ArrayList<LineItem>();
    }

    public void addLineItem(String productName, long quantity, double unitPrice) {
        if (this.productName == productName) {
            removeLineItem(productName);
            lineItems.
            lineItems.add(this.productName);
            this.lineItems.add(this.quantity);
            this.lineItems.add(this.unitPrice);
        }

        else {
            this.productName = productName;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
    }

    public void addLineItem(String productName, double unitPrice) {
        if (this.productName == productName) {
            removeLineItem(productName);
            this.lineItems.add(this.productName);
            this.lineItems.add(this.quantity(1));
            this.lineItems.add(this.unitPrice);
        }

        else {
            this.productName = productName;
            this.quantity = quantity(1);
            this.unitPrice = unitPrice;
        }
    }

    public void removeLineItem(String productName) {
        if(lineItems == this.productName) {
            this.lineItems.remove(this.productName);
            this.lineItems.remove(this.quantity);
            this.lineItems.remove(this.unitPrice);
        }
    }

    public LineItem[] getAllLineItems() {
        return this.lineItems;
    }
}