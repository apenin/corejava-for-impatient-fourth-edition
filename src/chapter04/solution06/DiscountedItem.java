package chapter04.solution06;

import java.util.Objects;

public class DiscountedItem extends Item {
    private final double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object otherObject) {
        return switch (otherObject) {
            case DiscountedItem discountedItem -> super.equals(discountedItem) &&
                    Double.compare(discount, discountedItem.discount) == 0;
            case Item item -> super.equals(item);
            case null, default -> false;
        };
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
