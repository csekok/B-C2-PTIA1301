package register;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingTest {
    //TODO Before doing a task remove "/*" and "*/" in its test class (Shortcut: Ctrl + Shift + /).

    /*
    private Shopping shopping = new Shopping();
    private Goods salt1 = new Goods("salt", 200);
    private Goods salt2 = new Goods("salt", 200);
    private Goods sugar = new Goods("sugar", 250);

    @Test
    public void testAddNewGoods() {
        shopping.addGoods(salt1);

        assertEquals(salt1.getPrice(), shopping.getTotalPrice());

        shopping.addGoods(sugar);

        assertEquals(salt1.getPrice() + sugar.getPrice(), shopping.getTotalPrice());
    }

    @Test
    public void testAddOldGoods() {
        shopping.addGoods(salt1);

        assertEquals(salt1.getPrice(), shopping.getTotalPrice());

        shopping.addGoods(salt2);

        assertEquals(salt1.getPrice() + salt2.getPrice(), shopping.getTotalPrice());
    }

    @Test
    public void testUpdateNonExistGoods() {
        shopping.updatePrice("non-exist goods", 200);

        assertEquals(0, shopping.getTotalPrice());
    }

    @Test
    public void testUpdateExistingGoods() {
        int expectedPrice = 1000;

        shopping.addGoods(salt1);

        assertEquals(salt1.getPrice(), shopping.getTotalPrice());

        shopping.updatePrice(salt1.getName(), expectedPrice);

        assertEquals(expectedPrice, shopping.getTotalPrice());
    }

    @Test
    public void testRemoveNonExistGoods() {
        shopping.removeGoods(sugar);

        assertEquals(0, shopping.getTotalPrice());
    }

    @Test
    public void testRemoveExistingGoods() {
        shopping.addGoods(salt1);

        assertEquals(salt1.getPrice(), shopping.getTotalPrice());

        shopping.removeGoods(salt1);

        assertEquals(0, shopping.getTotalPrice());
    }
    */
}