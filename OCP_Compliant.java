// Base class or interface
interface DiscountStrategy {
    double applyDiscount(double price);
}

// Concrete implementations (extensions)
class ChristmasDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.8; // 20% discount
    }
}

class NewYearDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.9; // 10% discount
    }
}

// Client class
class Checkout {
    private DiscountStrategy discount;

    public Checkout(DiscountStrategy discount) {
        this.discount = discount;
    }

    public double getFinalPrice(double price) {
        return discount.applyDiscount(price);
    }
}
