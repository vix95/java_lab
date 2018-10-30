public class Product {
    private String code;
    private String name;
    private double price;
    private double discountPrice;

    Product() {
    }

    // print product
    void printProduct() {
        System.out.println("code: " + code);
        System.out.println("name: " + name);
        System.out.println("price: " + price);
        System.out.println("discountPrice: " + discountPrice);
    }

    // print new product
    void printNewProduct() {
        System.out.println("Add new product [code: " + code + ", name: " + name + ", price: " + price + "]");
    }

    // print new product in one line
    void printProductInLine() {
        System.out.println("[code: " + code + ", name: " + name + ", price: " + price + "]");
    }

    Product(String code, String name, double price) {
        this();
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = 0;

        this.printNewProduct();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}
