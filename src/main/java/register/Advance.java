package register;

import java.util.ArrayList;

public class Advance {
    /**
     * Task 0: Update the project:
     *          - From menu: Git / "Update Project...", OR
     *          - In right upper corner: blue arrow, OR
     *          - Keyboard shortcut: Ctrl+T
     * In "Update the project" popup click on Ok button.
     */

    /**
     * Task 1:
     * Create lists of integers and strings in main method.
     * Add values to lists.
     * Create a printAllElements(list) method to print all elements
     * of a list in separated rows.
     * Hint: Use generics: ArrayList<T>
     */

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(13);
        intList.add(7);
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("alma");
        stringList.add("korte");
        stringList.add("szilva");
        System.out.println("intList:");
        printAllElements(intList);
        System.out.println("\r\nstringList:");
        printAllElements(stringList);

        ArrayList<User> users = XmlReader.readUsersFromXml("src/main/resources/users.xml");
        int year = 1950;
        ArrayList<User> elders = new ArrayList<>();
        for (User user : users) {
            if (user.getBirthYear() < year) {
                elders.add(user);
            }
        }
        System.out.println(users);
        System.out.println(elders);

        ArrayList<User> eldersWithLambda = new ArrayList<>();
        users.stream().filter(user -> user.getBirthYear() < year)
                      .forEach(user -> eldersWithLambda.add(user));
        System.out.println(eldersWithLambda);

        ArrayList<Integer> eldersBirthYear = new ArrayList<>();
        users.stream().filter(user -> user.getBirthYear() < year)
                      .map(user -> user.getBirthYear())
                      .forEach(eldersBirthYear::add);
        System.out.println(eldersBirthYear);

        sayHello("Kinga");

        System.out.println(User.class.getAnnotations().length);
        System.out.println(User.class.getAnnotations()[0]);
        System.out.println(User.class.getAnnotation(ClassHistory.class).author());
        System.out.println(Employee.class.getAnnotations().length);
        System.out.println(Employee.class.getAnnotation(ClassHistory.class).author());
    }

    public static <T> void printAllElements(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element.toString());
        }
    }

    /**
     * Task 2:
     * In main method implement algorithm to separate users from a list,
     * who is born before a given year.
     * Hint: Use stream and lambda expression to filter users.
     */

    /**
     * Task 3:
     * Create a Greeting interface with greet and
     * greetSomeone(someone) methods to say hello.
     * Hint: To create a new interface you should use
     *       "public interface <name of interface>" structure.
     */

    /**
     * Task 4:
     * Create sayHello(name) method, where:
     *      - implement EnglishGreeting from Greeting
     *      - implement both methods of EnglishGreeting with "Hello"
     *      - create a Greeting variable with an EnglishGreeting object
     *      - create a Greeting variable with a new Greeting object,
     *        with Hungarian greeting "Szia"
     *      - call both method of these local variables
     * Call the sayHello method in main.
     * Hint: To implement an interface use implements keyword and
     *       the name of the interface.
     */

    public static void sayHello(String name) {
        class EnglishGreeting implements Greeting {
            public void greet() {
                greetSomeone("");
            }

            public void greetSomeone(String someone) {
                System.out.println("Hello " + someone);
            }
        }
        Greeting english = new EnglishGreeting();
        english.greet();
        english.greetSomeone(name);

        Greeting hungarian = new Greeting() {
            @Override
            public void greet() {
                greetSomeone("");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Szia " + someone);
            }
        };
        hungarian.greet();
        hungarian.greetSomeone(name);
    }

    /**
     * Task 5:
     * Create a new annotation named ClassHistory.
     * Define 3 elements in it:
     *       - author
     *       - createdOn
     *       - lastModifiedOn
     * Hint: To create a new annotation you should use @interface
     *       keyword.
     * Hint: You can define default values with default keyword;
     */

    /**
     * Task 6:
     * Add ClassHistory annotation to our previously created classes.
     * Hint: To add a new annotation to your class, you should insert
     *       an @ character and the name of your annotation before
     *       your class header row.
     * Hint: If there are elements in an annotation you can enter
     *       values to them in parenthesis, e.g.:
     *       @ClassHistory(author = "Anonymous")
     */

    /**
     * Task 7:
     * In main method get and print the values of the elements of
     * your annotation.
     * Hint: To get annotations of a class, methods, etc. you should
     *       use reflection: <classname>.class
     */

    /**
     * Task 8:
     * Create a MyCalculator interface with two method signature:
     *       - void add(int x, int y)
     *       - void sub(int x, int y)
     */

    /**
     * Task 9:
     * Implement the MyCalculator in MyCalculatorImp class.
     * Create a calcMe(x, y) method, where:
     *       - create a new MyCalculatorImp object and store
     *         in a MyCalculator variable
     *       - call its add and sub method with x and y
     */
}
