@SuppressWarnings("WeakerAccess")
public class CartItem {
    private Product product; // product as cart item
    private double discountPrice; // price after discount

    private CartItem() {
    }

    // print item added to cart
    public void printAddToCart() {
        System.out.println("Add to cart " + product);
    }

    CartItem(Product product) {
        this();
        this.product = product;
        this.discountPrice = product.getPrice();

        this.printAddToCart();
    }

    public Product getProduct() {
        return product;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "\nCartItem{" +
                "product=" + product +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
