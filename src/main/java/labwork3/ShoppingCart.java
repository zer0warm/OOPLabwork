package labwork3;

import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<String> cartContent;

    public ShoppingCart() {
        this.cartContent = new ArrayList<>();
    }

    public void addToCart(String item) {
        this.cartContent.add(item);
    }

    public void removeFromCart(String item) {
        this.cartContent.remove(item);
    }

    public ArrayList<String> checkOut() {
        return this.cartContent;
    }
}
