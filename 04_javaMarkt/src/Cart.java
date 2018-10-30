import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cart {
    ArrayList<CartItem> items = new ArrayList<>(); // array of products in cart
    private double totalPrice; // total price of all products in cart
    private int qtyItems; // count of products in cart

    Cart() {
    }

    // print cart
    public void printCart() {
        System.out.println("Total cost: " + totalPrice);
        System.out.println("Items qty in cart: " + qtyItems);
    }

    // print cart items
    public void printCartItems() {
        for (CartItem item : items) {
            item.getProduct().printProductInLine();
        }
    }

    // add product to cart
    public Cart addProduct(Product product) {
        items.add(new CartItem(product));
        setQtyItems(getQtyItems() + 1);
        setTotalPrice(calcTotalPrice());
        return this;
    }

    // calculate total price
    public double calcTotalPrice() {
        double sum = 0;

        for (CartItem item : items) {
            sum += item.getProduct().getPrice();
        }

        return sum;
    }

    // sort ascending
    public ArrayList<CartItem> sortASC(ArrayList<CartItem> items) {
        Collections.sort(items, new Comparator<CartItem>() {
            public int compare(CartItem items1, CartItem items2) {
                if (items1.getProduct().getPrice() == items2.getProduct().getPrice()) {
                    int val = items1.getProduct().getName().compareTo(items2.getProduct().getName());
                    return val;
                } else if (items1.getProduct().getPrice() < items2.getProduct().getPrice()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return items;
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
}
