package chapter02.solution16;

import java.util.ArrayList;

public class Invoice {
    public static class Item {
        private final String description;
        private final int quantity;
        private final double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public double price() {
            return quantity * unitPrice;
        }
    }

    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Item item : items) {
            sum += item.price();
        }
        return sum;
    }

    public void printInvoice() {
        for (Item item : items) {
            System.out.printf("Item: %s, price: %.2f%n", item.description, item.price());
        }
        System.out.printf("Total price: %.2f%n", getTotalPrice());
    }
}
