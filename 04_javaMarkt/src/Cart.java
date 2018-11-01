import java.util.ArrayList;

@SuppressWarnings("WeakerAccess")
public class Cart {
    private ArrayList<CartItem> items = new ArrayList<>(); // array of products in cart
    private double totalPrice; // total amount of all products in cart
    private double totalDiscountPrice; // total discount price
    private int qtyItems; // count of products in cart
    private boolean cup; // free cup if total amount is greater than 200 amount
    private boolean discountCoupon; // free discount coupon 30% off for every shops

    Cart() {
    }

    // add product to cart
    public Cart addProduct(Product product) {
        items.add(new CartItem(product));
        setQtyItems(getQtyItems() + 1);
        setTotalPrice(getTotalPrice() + product.getDiscountPrice());
        return this;
    }

    // calculate total price
    public double calcTotalPrice() {
        double sum = 0;

        for (CartItem item : items) {
            sum += item.getDiscountPrice();
        }

        return sum;
    }

    // sort firstly by descending price, secondly by ascending name of product
    public void sortCart(ArrayList<CartItem> items) {
        items.sort((CartItem items1, CartItem items2) -> {
            if (items1.getProduct().getPrice() == items2.getProduct().getPrice()) {
                return items1.getProduct().getName().compareTo(items2.getProduct().getName());
            } else if (items1.getProduct().getPrice() > items2.getProduct().getPrice()) {
                return -1;
            } else {
                return 1;
            }
        });
    }

    // print the cheapest product from cart
    public void printTheCheapest() {
        System.out.println("\nThe cheapest product is " + items.get(items.size() - 1).getProduct().getName());
    }

    // print the most expensive product from cart
    public void printTheMostExpensive() {
        System.out.println("\nThe most expensive product is " + items.get(0).getProduct().getName());
    }

    // print n the cheapest products from cart
    public void printTheCheapestN(int n) {
        System.out.println("\nList of the cheapest " + n + " products");
        for (int i = 0; i < n; i++) System.out.println(items.get(items.size() - 1 - i).getProduct().getName());
    }

    // print n the most expensive products from cart
    public void printTheMostExpensiveN(int n) {
        System.out.println("\nList of the most expensive " + n + " products");
        for (int i = 0; i < n; i++) System.out.println(items.get(i).getProduct().getName());
    }

    // order summary
    void orderSummary() {
        System.out.println();
        checkMoreThan300();
        addGratisProducts();
        checkMoreThan200();
        addDiscountCoupon();
        setTotalDiscountPrice(calcTotalPrice()); // recalculate
    }

    // check if price is more than 300 amount
    private void checkMoreThan300() {
        if (getTotalPrice() > 300) {
            addDiscountToProducts();
        }
    }

    // add discount to all products
    private void addDiscountToProducts() {
        for (CartItem item : items) {
            item.setDiscountPrice(item.getProduct().getPrice() * .95);
        }

        System.out.println("Add promotion: 5% off");
    }

    // add gratis if customer buy 2 products
    private void addGratisProducts() {
        if (getQtyItems() > 2) {
            int gratisQty = getQtyItems() / 3;
            for (int i = 0; i < gratisQty; i++) {
                items.get(items.size() - 1 - i).setDiscountPrice(0);
            }

            if (gratisQty == 1) {
                System.out.println("Add promotion: " + gratisQty + " product for free");
            } else {
                System.out.println("Add promotion: " + gratisQty + " products for free");
            }
        }
    }

    // check if price is more than 200 amount
    private void checkMoreThan200() {
        if (getTotalPrice() > 300) {
            addFreeCup();
            System.out.println("Add promotion: free cup");
        }
    }

    // add discount coupon 30% off for every shops
    private void addDiscountCoupon() {
        setDiscountCoupon(true);
    }

    private void addFreeCup() {
        setCup(true);
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalDiscountPrice() {
        return totalDiscountPrice;
    }

    public void setTotalDiscountPrice(double totalDiscountPrice) {
        this.totalDiscountPrice = totalDiscountPrice;
    }

    public int getQtyItems() {
        return qtyItems;
    }

    public void setQtyItems(int qtyItems) {
        this.qtyItems = qtyItems;
    }

    public void setCup(boolean cup) {
        this.cup = cup;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    @Override
    public String toString() {
        return "\nList of products in Cart{" +
                "items=" + items +
                ", \ntotalPrice=" + totalPrice +
                ", totalDiscountPrice=" + totalDiscountPrice +
                ", qtyItems=" + qtyItems +
                ", cup=" + cup +
                ", discountCoupon=" + discountCoupon +
                '}';
    }
}