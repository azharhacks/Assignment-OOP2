class DiscountCalculator {
    public double applyDiscount(String type, double price) {
        if (type.equals("Christmas")) {
            return price * 0.8;
        } else if (type.equals("NewYear")) {
            return price * 0.9;
        } else {
            return price;
        }
    }
}
