package numbers;

public class NumbersMain {
    /**
     * Task 0: Update the project:
     *          - From menu: Git / "Update Project...", OR
     *          - In right upper corner: blue arrow, OR
     *          - Keyboard shortcut: Ctrl+T
     * In "Update the project" popup click on Ok button.
     */

    /**
     * Task 1: Create a main method into NumbersMain class.
     * Create new variables:
     *   - Name: a, type: int, value: 5
     *   - Name: b, type: Integer, value: 5
     *   - Name: c, type: Integer, value: variable a
     *   - Name: d, type: Integer, value: variable b
     *   - Name: e, type: Integer, value: new Integer object created with literal 5
     *   - Name: f, type: int, value: new Integer object created with literal 5
     *   - Name: g, type: int, value: new Integer object created with variable a
     *   - Name: h, type: int, value: new int value get by intValue method of variable c
     *   - Name: i, type: int, value: parsed from literal "5"
     *   - Name: j, type: Integer, value: parsed from literal "5"
     * Print these variables.
     * Convert literals and variables:
     *   - int (5 and 32768) to byte
     *   - int (5 and 32768) to short
     *   - int (5 and 32768) to long
     *   - long (22_000_000L) to int
     */
    public static void main(String[] args) {
        /*int a = 5;
        Integer b = 5;
        Integer c = a;
        Integer d = b;
        Integer e = Integer.valueOf(5);
        int f = Integer.valueOf(5);
        int g = Integer.valueOf(a);
        int h = c.intValue();
        int i = Integer.parseInt("5");
        Integer j = Integer.parseInt("5");

        System.out.println(a);*/

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        int num1 = 5;
        int num2 = 32768;
        byte byteNum = 5;
        byte byteNum1 = (byte) num1;
        byte byteNum2 = (byte) num2;
        System.out.println(byteNum1);
        System.out.println(byteNum2);
        short shortNum = 32767;
        short shortNum1 = (short) num1;
        short shortNum2 = (short) num2;
        System.out.println(shortNum1);
        System.out.println(shortNum2);
        long longNum1 = num1;
        long longNum2 = num2;
        long number = 22_000_000_000L;
        int intNumber = (int) number;

        double pi = Circle.PI;
    }

    /**
     * Task 2: Create Circle class in numbers package.
     * When we create a new Circle object we should give its radius.
     * Create new methods:
     *   - getRadius: return the radius of circle.
     *   - getArea: return the area of circle.
     *   - getPerimeter: return the perimeter of circle.
     * Hint: Create a quasi-constant PI value in Circle class. (Or you can import Math.PI.)
     */

    /**
     * Task 3: Create a public static int subtractFiveIfGreaterThanFive(int number)
     * method to return:
     *   - value of number minus 5 if it is greater than 5,
     *   - value of number in all other cases.
     */
    public static int subtractFiveIfGreaterThanFive(int number) {
        if (number > 5) {
            return number - 5;
        } else {
            return number;
        }
    }

    /**
     * Task 4: Create a static convertDoubleToDouble method, which does:
     *   1. Convert the double parameter to int.
     *   2. Convert the the int value to double. (Cut the real part.)
     *   3. Return the double value.
     */
    public static double convertDoubleToDouble(double number) {
        /*int intNumber = (int) number;
        double result = intNumber;
        return result;*/
        return (int) number;
    }

    /**
     * Task 5: Create a convertIntToByte method to convert int values to bytes.
     * If the value is greater than 127 or less than 0, then return with -1.
     */
    public static byte convertIntToByte(int number) {
        if (number < 0 || number > 127) {
            return -1;
        } else {
            return (byte) number;
        }
    }

    /**
     * Task 6: Create a getFirstDecimal method to get the first decimal of a real number.
     */
    public static int getFirstDecimal(double number) {
        int intPartOfNumber = (int) number;
        double realPart = number - intPartOfNumber;
        double realPartMultiplyTen = realPart * 10;
        return (int) realPartMultiplyTen;
    }
}
