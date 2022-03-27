package register;

public class Shopping extends Basket {
    /**
     * Task 6: Derive a Shopping class from Basket class. This class should have:
     *      - addGoods method to add a new Goods object to the list
     *      - updatePrice method to change the price of an element
     *      - removeGoods method to remove it from the list
     * Try these methods in main.
     */

    public void addGoods(String name, int price) {
        boolean contains = false;
        for (int i = 0; i < super.goodsList.size(); i++) {
            if (super.goodsList.get(i).getName().equals(name)) {
                contains = true;
            }
        }
        if (!contains) {
            super.goodsList.add(new Goods(name, price));
        }
    }

    public void addGoods(Goods goods) {
        boolean contains = false;
        for (int i = 0; i < super.goodsList.size(); i++) {
            if (super.goodsList.get(i).getName().equals(goods.getName())) {
                contains = true;
            }
        }
        if (!contains) {
            super.goodsList.add(new Goods(goods.getName(), goods.getPrice()));
        }
    }

    public void addGoods2(Goods goods) {
        boolean contains = false;
        for (int i = 0; i < super.goodsList.size(); i++) {
            if (super.goodsList.get(i) == goods) {
                contains = true;
            }
        }
        if (!contains) {
            super.goodsList.add(goods);
        }
    }
}
