package numbers;

import junit.framework.TestCase;

public class NumbersMainTest extends TestCase {
    //TODO Before doing a task remove "/*" and "*/" in its test class (Shortcut: Ctrl + Shift + /).


    public void testSubtractFiveIfGreaterThanFiveWithZero() {
        assertEquals(0, NumbersMain.subtractFiveIfGreaterThanFive(0));
    }

    public void testSubtractFiveIfGreaterThanFiveWithFive() {
        assertEquals(5, NumbersMain.subtractFiveIfGreaterThanFive(5));
    }

    public void testSubtractFiveIfGreaterThanFiveWithSix() {
        assertEquals(1, NumbersMain.subtractFiveIfGreaterThanFive(6));
    }

    public void testConvertDoubleToDoubleWithIntegerLiteral() {
        assertEquals(6.0, NumbersMain.convertDoubleToDouble(6));
    }

    public void testConvertDoubleToDoubleWithDoubleLiteral() {
        assertEquals(3.0, NumbersMain.convertDoubleToDouble(3.14));
    }

    public void testConvertIntToByte1() {
        assertEquals(-1, NumbersMain.convertIntToByte(-2));
    }

    public void testConvertIntToByte2() {
        assertEquals(0, NumbersMain.convertIntToByte(0));
    }

    public void testConvertIntToByte3() {
        assertEquals(1, NumbersMain.convertIntToByte(1));
    }

    public void testConvertIntToByte4() {
        assertEquals(127, NumbersMain.convertIntToByte(127));
    }

    public void testConvertIntToByte5() {
        assertEquals(-1, NumbersMain.convertIntToByte(128));
    }

    public void testGetFirstDecimal1() {
        assertEquals(0, NumbersMain.getFirstDecimal(0.0));
    }

    public void testGetFirstDecimal2() {
        assertEquals(1, NumbersMain.getFirstDecimal(0.1));
    }

    public void testGetFirstDecimal3() {
        assertEquals(0, NumbersMain.getFirstDecimal(0.01));
    }

    public void testGetFirstDecimal4() {
        assertEquals(1, NumbersMain.getFirstDecimal(3.14));
    }
}