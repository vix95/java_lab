public class javaMarkt {
    public static void main(String[] args) {
        // create cart and add products to cart
        Cart cart = new Cart();
        cart.addProduct(new Product("1", "Mleko", 5.49))
                .addProduct(new Product("2", "Pomarancze", 3.49))
                .addProduct(new Product("3", "Jajka", 2.59))
                .addProduct(new Product("4", "Chleb", 1.79))
                .addProduct(new Product("5", "Maslo", 2.69))
                .addProduct(new Product("6", "Ananas", 1.79))
                .addProduct(new Product("7", "Telewizor", 300));

        cart.sortCart(cart.getItems());
        cart.printCart();

        cart.printTheCheapest();
        cart.printTheMostExpensive();
        cart.printTheCheapestN(3);
        cart.printTheMostExpensiveN(3);
        // cart.setTotalPrice(cart.calcTotalPrice()); calculate total price in class

        System.out.println("Total cost w/o discount: " + cart.getTotalPrice());
        cart.orderSummary();
        System.out.println("Total cost with discount: " + cart.getTotalPrice());

        cart.printCart();
    }
}
