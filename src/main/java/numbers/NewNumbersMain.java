package numbers;

import java.util.ArrayList;
import java.util.Random;

public class NewNumbersMain {
    private static final Random RANDOM_GENERATOR = new Random(50);

    /**
     * Task 0: Update the project:
     *          - From menu: Git / "Update Project...", OR
     *          - In right upper corner: blue arrow, OR
     *          - Keyboard shortcut: Ctrl+T
     * In "Update the project" popup click on Ok button.
     */

    /**
     * Task 1: Create a main method.
     * Create a generateArray method to generate a 1-dimensional array: 1 2 3 4 5
     * Call this method and print the return value in main.
     */
    public static void main(String[] args) {
        /*int[] array = generateArray(true);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();

        for (int number : array) {
            System.out.println(number);
        }

        int[][] twoDimensionalArray = generateTwoDimensionalArray(false);

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.print(twoDimensionalArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }*/

        ArrayList<Integer> list = generateList(false, 8);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(15));
        print(list);
    }

    public static int[] generateArray() {
        return generateArray(false);
    }

    public static int[] generateArray(boolean random) {
        int[] result = {1, 2, 3, 4, 5};
        if (random) {
            for (int i = 0; i < result.length; i++) {
                result[i] = RANDOM_GENERATOR.nextInt(100) - 50;
            }
        }
        return result;
    }

    /**
     * Task 2: Add a random parameter to generateArray method:
     * - If the value of random parameter is true,
     *   then return with a 5 element array filled with random numbers.
     * - If the value of random parameter is false,
     *   then return with the same array as before.
     * Hint: You can generate random numbers with Random objects.
     * Hint: Use nextInt(bound) method to get integers between 0 and bound value.
     * Call the method with true and false parameters and print the results in main.
     */

    /**
     * Task 3: Create a generateTwoDimensionalArray(random) method to generate a 2-dimensional array:
     * - If the value of random parameter is true,
     *   then return with a 2x3 array filled with random numbers.
     * - If the value of random parameter is false, then return with array of this matrix:
     *     1 2 3
     *     4 5 6
     * Call this method and print the return value in main.
     */
    public static int[][] generateTwoDimensionalArray(boolean random) {
        int[][] result = {
                {1, 2, 3},
                {4, 5, 6}
        };
        if (random) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = RANDOM_GENERATOR.nextInt(100) - 50;
                }
            }
        }
        return result;
    }

    /**
     * Task 4: Create a generateList(random, length) method to generate
     * a 1-dimensional array with dynamic length.
     * - If the value of random parameter is true, then return with a list of random numbers.
     *   The length of this list has to match with length parameter.
     * - If the value of random parameter is false,
     *   then return with an array with the numbers from 1 to value of length parameter.
     * Hint: Use ArrayList.
     */
    public static ArrayList<Integer> generateList(boolean random, int length) {
        ArrayList<Integer> list = new ArrayList<>();
        if (random) {
            for (int i = 0; i < length; i++) {
                list.add(RANDOM_GENERATOR.nextInt());
                /*list.remove(0);
                list.size();
                list.get(0);
                list.contains(5);
                list.indexOf(10);*/
            }
        } else {
            for (int i = 1; i <= length; i++) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * Task 5: Create a print method to print all element of a list parameter to the console.
     * For example: [1, 2, 3, 4, 5]
     * Extra: Create similar method for 1- and 2-dimensional arrays.
     */
    public static void print(ArrayList<Integer> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Task 6: Create a selectEvenNumbers method, what return a subset of the list parameter.
     * The subset list has to contains all and only the even numbers.
     * Call this method in main and print a message with the length of subset list or
     * the static "There are no even number in the list" message.
     */
    public static ArrayList<Integer> selectEvenNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    /**
     * Task 7: Create an intersection method, what get 2 lists as parameters.
     * The method has to return with a list, what contains all and only those elements,
     * which is in both list parameters.
     * Extra: Create same method for 1- and 2-dimensional arrays.
     * Extra: Create same method for lists and arrays with double values.
     */
    public static ArrayList<Integer> intersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int number : list1) {
            if (list2.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }

    /**
     * Task 8: Create a separateEvenAndOdds method, what create 2 sublist of the list parameter.
     * First sublist has to contains all and only the even numbers, and the second one
     * has to contains all and only the odd numbers.
     * Print to console:
     *     - sublist of even numbers
     *     - sublist of odd numbers
     *     - length of sublist of even numbers
     *     - length of sublist of odd numbers
     *     - length of original list
     * Hint: This method should have no return value, because you should print the values.
     */

    /**
     * Task 9: Create a numberOfOdds(array) method to count how many odd value is in a list.
     * Extra: Create same method for 1- and 2-dimensional arrays.
     */

    /**
     * Task 10: Create a contains(array, value) method to decide the value is in a list or not.
     * Extra: Create same method for 1- and 2-dimensional arrays.
     * Extra: Create same method for lists and arrays with double values.
     */

    /**
     * Task 11: Create a sum(array) method to get the sum of values in a list.
     * Extra: Create same method for 1- and 2-dimensional arrays.
     * Extra: Create same method for lists and arrays with double values.
     */

    /**
     * Task 12: Create a indexOf(array, value) method to return the index of value in a list.
     * If the list does not contain the value, then return with -1.
     * Extra: Create same method for 1- and 2-dimensional arrays.
     * Extra: Create same method for lists and arrays with double values.
     */

    /**
     * Task 13: Create a union method, what get 2 lists as parameters.
     * The method has to return with a list, what contains all elements of list parameters,
     * but it has to contain all elements only 1 time (eliminate the duplications).
     * Extra: Create same method for 1- and 2-dimensional arrays.
     * Extra: Create same method for lists and arrays with double values.
     */
}
