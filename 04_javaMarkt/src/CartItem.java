public class CartItem {
    private Product product; // product as cart item
    private double discountPrice; // price after discount

    CartItem() {
    }

    // print cart
    void printCart() {
        System.out.println("Product: " + product);
        System.out.println("code: " + product.getCode());
        System.out.println("name: " + product.getName());
        System.out.println("price: " + product.getPrice());
        System.out.println("discountPrice: " + discountPrice);
    }

    // print item added to cart
    void printAddToCart() {
        System.out.println("Add product to cart [Product: " + product.getName() + "]");
    }

    // print item added to cart in one line
    void printCartInLine() {
        System.out.println("Product code: " + product.getCode() + " [name: " + product.getName() + ", price: " + product.getPrice() + ", discountPrice: " + discountPrice + "]");
    }

    CartItem(Product product) {
        this();
        this.product = product;
        this.discountPrice = 0;

        this.printAddToCart();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}
