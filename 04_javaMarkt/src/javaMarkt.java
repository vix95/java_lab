public class javaMarkt {
    public static void main(String[] args) {
        // create cart and add products to cart
        Cart cart = new Cart();
        cart.addProduct(new Product("1", "Mleko", 5.49))
                .addProduct(new Product("2", "Pomarancze", 3.49))
                .addProduct(new Product("3", "Jajka", 2.59))
                .addProduct(new Product("4", "Chleb", 1.79))
                .addProduct(new Product("5", "Maslo", 2.69))
                .addProduct(new Product("6", "Ananas", 1.79));

        cart.printCartItems();
        cart.sortASC(cart.getItems());

        System.out.println("after");
        cart.printCartItems();

        System.out.println("\n--- List of the cheapest product/products ---");

        System.out.println("\n--- List of the most expensive product/products ---");
    }
}
