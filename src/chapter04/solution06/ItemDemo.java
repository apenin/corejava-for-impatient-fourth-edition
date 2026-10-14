package chapter04.solution06;

public class ItemDemo {
    public static void main(String[] args) {
        Item item1 = new Item("keyboard", 500);
        Item item2 = new Item("keyboard", 500);
        Item item3 = new Item("mouse", 500);
        Item item4 = new Item("keyboard", 750);

        System.out.println(item1.equals(item2)); // true
        System.out.println(item1.equals(item3)); // false
        System.out.println(item1.equals(item4)); // false

        System.out.println("====================");

        DiscountedItem discountedItem1 = new DiscountedItem("keyboard", 500, 100);
        DiscountedItem discountedItem2 = new DiscountedItem("keyboard", 500, 100);
        DiscountedItem discountedItem3 = new DiscountedItem("mouse", 500, 100);
        DiscountedItem discountedItem4 = new DiscountedItem("keyboard", 750, 100);
        DiscountedItem discountedItem5 = new DiscountedItem("keyboard", 500, 150);

        System.out.println(discountedItem1.equals(discountedItem2)); // true
        System.out.println(discountedItem1.equals(discountedItem3)); // false
        System.out.println(discountedItem1.equals(discountedItem4)); // false
        System.out.println(discountedItem1.equals(discountedItem5)); // false

        System.out.println("===== Symmetry =====");
        System.out.println(item1.equals(discountedItem1)); // true
        System.out.println(discountedItem1.equals(item1)); // true
        System.out.println(item1.equals(discountedItem3)); // false
        System.out.println(discountedItem3.equals(item1)); // false
        System.out.println(item1.equals(discountedItem4)); // false
        System.out.println(discountedItem4.equals(item1)); // false

        System.out.println("===== Nontransitive =====");
        System.out.println(discountedItem1.equals(item1)); // true
        System.out.println(item1.equals(discountedItem5)); // true
        System.out.println(discountedItem1.equals(discountedItem5)); // false
    }
}
