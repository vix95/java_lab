import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cart {
    ArrayList<CartItem> items = new ArrayList<>(); // array of products in cart
    private double totalPrice; // total amount of all products in cart
    private int qtyItems; // count of products in cart
    private boolean cup; // free cup if total amount is greater than 200 pln

    Cart() {
    }

    // print cart
    public void printCart() {
        System.out.println("Total cost: " + totalPrice);
        System.out.println("Items qty in cart: " + qtyItems);
        printCartItems();
    }

    // print cart items
    public void printCartItems() {
        for (CartItem item : items) {
            item.printCartInLine();
        }
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

    // sort ascending
    public ArrayList<CartItem> sortCart(ArrayList<CartItem> items) {
        Collections.sort(items, new Comparator<CartItem>() {
            public int compare(CartItem items1, CartItem items2) {
                if (items1.getProduct().getPrice() == items2.getProduct().getPrice()) {
                    int val = items1.getProduct().getName().compareTo(items2.getProduct().getName());
                    return val;
                } else if (items1.getProduct().getPrice() > items2.getProduct().getPrice()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return items;
    }

    // print the cheapest product from cart
    public void printTheCheapest() {
        System.out.println("The cheapest product is " + items.get(items.size() - 1).getProduct().getName());
    }

    // print the most expensive product from cart
    public void printTheMostExpensive() {
        System.out.println("The most expensive product is " + items.get(0).getProduct().getName());
    }

    // print n the cheapest products from cart
    public void printTheCheapestN(int n) {
        System.out.println("List of the cheapest " + n + " products");
        for (int i = 0; i < n; i++) System.out.println(items.get(items.size() - 1 - i).getProduct().getName());
    }

    // print n the most expensive products from cart
    public void printTheMostExpensiveN(int n) {
        System.out.println("List of the most expensive " + n + " products");
        for (int i = 0; i < n; i++) System.out.println(items.get(i).getProduct().getName());
    }

    // order summary
    void orderSummary() {
        checkMoreThan300();
        addGratisProducts();
        checkMoreThan200();
        setTotalPrice(calcTotalPrice()); // recalculate
    }

    // check if price is more than 300 pln
    void checkMoreThan300() {
        if (getTotalPrice() > 300) {
            addDiscountToProducts();
        }
    }

    // add discount to all products
    void addDiscountToProducts() {
        for (CartItem item : items) {
            item.setDiscountPrice(item.getProduct().getPrice() * .95);
        }

        System.out.println("Add promotion: 5% off");
    }

    // add gratis if customer buy 2 products
    void addGratisProducts() {
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

    void checkMoreThan200() {
        if (getTotalPrice() > 300) {
            addFreeCup();
            System.out.println("Add promotion: free cup");
        }
    }

    private void addFreeCup() {
        setCup(true);
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CartItem> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQtyItems() {
        return qtyItems;
    }

    public void setQtyItems(int qtyItems) {
        this.qtyItems = qtyItems;
    }

    public boolean isCup() {
        return cup;
    }

    public void setCup(boolean cup) {
        this.cup = cup;
    }
}
