package register;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoodsTest {
    //TODO Before doing a task remove "/*" and "*/" in its test class (Shortcut: Ctrl + Shift + /).


    private static final String name1 = "chocolate";
    private static final String name2 = "candy";
    private static final int price1 = 400;
    private static final int price2 = 250;
    private Goods goods = new Goods(name1, price1);

    @Test
    public void testSetName() {
        assertEquals(name1, goods.getName());

        goods.setName(name2);

        assertEquals(name2, goods.getName());
    }

    @Test
    public void testSetPrice() {
        assertEquals(price1, goods.getPrice());

        goods.setPrice(price2);

        assertEquals(price2, goods.getPrice());
    }

}