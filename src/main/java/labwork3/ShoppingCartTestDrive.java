package labwork3;

public class ShoppingCartTestDrive {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addToCart("6-pack New Zealand Apple");
        cart.addToCart("Chicken");
        cart.addToCart("iPhone 6S 32GB");
        cart.addToCart("Condom");
        cart.removeFromCart("Chicken");

        System.out.println("Items to be purchased: " + cart.checkOut());
    }
}
