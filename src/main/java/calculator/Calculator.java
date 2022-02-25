package calculator;

public class Calculator {
    public static String add(int a, int b) {
        int result = a + b;
        return "" + a + " + " + b + " = " + result;
    }

    public static String subtract(int a, int b) {
        int result = a - b;
        return "" + a + " - " + b + " = " + result;
    }

    public static String multiply(int a, int b) {
        int result = a * b;
        return "" + a + " * " + b + " = " + result;
    }

    public static String divide(int a, int b) {
        if (b == 0) {
            return "Cannot divide with 0.";
        } else {
            if (a % b == 0) {
                int result = a / b;
                return "" + a + " / " + b + " = " + result;
            } else {
                double result = (double) a / b;
                return "" + a + " / " + b + " = " + result;
            }
        }

    }
}
