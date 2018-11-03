public class javaMarkt {
    public static void main(String[] args) {
        // create cart and add products to cart
        Cart cart = new Cart();
        cart.addProduct(new Product("1", "Milk", 5.49))
                .addProduct(new Product("2", "Oranges", 3.49))
                .addProduct(new Product("3", "Eggs", 2.59))
                .addProduct(new Product("4", "Bread", 1.79))
                .addProduct(new Product("5", "Butter", 2.69))
                .addProduct(new Product("6", "Pineapple", 1.79))
                .addProduct(new Product("7", "Coffeemaker", 200));

        //cart.printTheCheapest();
        //cart.printTheMostExpensive();
        //cart.printTheCheapestN(3);
        //cart.printTheMostExpensiveN(3);

        //System.out.println("\nTotal cost w/o discount: " + cart.totalPriceOfProducts() +
        //        "\nTotal cost with discount: " + cart.totalPriceOfDiscountedProducts());

        cart.addPromotion(new FreeCup()).applyPromotions();
        cart.addPromotion(new FivePercentOff()).applyPromotions();
        cart.addPromotion(new FreeProduct()).applyPromotions();
        cart.removePromotion(new FreeCup()).applyPromotions();
        System.out.println(cart);
    }
}
