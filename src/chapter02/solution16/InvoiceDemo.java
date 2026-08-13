package chapter02.solution16;

public class InvoiceDemo {
    public static void main(String[] args) {
        var myInvoice = new Invoice();

        var item1 = new Invoice.Item("Item1", 10, 12.34);
        var item2 = new Invoice.Item("Item2", 20, 8.56);
        var item3 = new Invoice.Item("Item3", 30, 4.55);

        myInvoice.addItem(item1);
        myInvoice.addItem(item2);
        myInvoice.addItem(item3);

        myInvoice.printInvoice();
    }
}
