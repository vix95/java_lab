@SuppressWarnings("WeakerAccess")
public class Product {
    private String code;
    private String name;
    private double price;
    private double discountPrice;

    private Product() {
    }

    // print new product
    private void printNewProduct() {
        System.out.println("Add new " + toString());
    }

    Product(String code, String name, double price) {
        this();
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = price;

        this.printNewProduct();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
