public class Test1 {
    public static void main(String[] args) {
        //1 & 2
        Order order1 = new Order();
        Order order2 = new Order();

        //3
        order1.addLineItem("Lord of the Rings", 30, 20.5);
        order1.addLineItem("Bible", 50, 5);
        order1.addLineItem("Lord of the Rings", 1, 22.5);
        order1.addLineItem("Harry Potter", 300, 10);
        order1.removeLineItem("Harry Potter");

        //4
        OrderPrinter orderPrinter = new OrderPrinter();

        //5
        orderPrinter.print(order1);

        //6
        orderPrinter.print(order2);
    }
}