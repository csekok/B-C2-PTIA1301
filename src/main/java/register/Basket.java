package register;

import java.util.ArrayList;

public class Basket {
    /**
     * Task 5: Create a Basket class with list of goods. This class should have:
     *      - createReceipt method to generate a String with name and price of goods in separate rows
     *      - getTotalPrice method to return with the total price of the basket
     * Try these methods in main.
     */
    protected ArrayList<Goods> goodsList = new ArrayList<>();

    public String createReceipt() {
        //String receipt = "";
        StringBuilder builder = new StringBuilder();
        for (Goods goods : goodsList) {
            //receipt += goods.getName() + " " + goods.getPrice() + "\r\n";
            builder.append(goods.getName()).append(" ").append(goods.getPrice()).append("\r\n");
        }
        return builder.toString();
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Goods goods : goodsList) {
            totalPrice += goods.getPrice();
        }
        return totalPrice;
    }
}
