package register;

public class InheritanceMain {
    /**
     * Task 0: Update the project:
     *          - From menu: Git / "Update Project...", OR
     *          - In right upper corner: blue arrow, OR
     *          - Keyboard shortcut: Ctrl+T
     * In "Update the project" popup click on Ok button.
     */

    /**
     * Task 1: Add new attribute to User class to handle their eye colors: brown, blue, green, gray,
     * amber, hazel, red.
     * Hint: Create a new enum for eye colors (New / Java Class / Enum).
     * Hint: Human eye color does not change over years so you can define it as a final attribute.
     */

    /**
     * Task 2: Add getter method to eye color attribute in User class. Also create a new constructor,
     * where you can define all attribute of a user object.
     */

    /**
     * Task 3: Create an Employee class. Employees are users, who has a position and get salary.
     * Hint: To derive a class use this syntax: public class {derived class name} extends {base class name}
     * Create a main method and create some Employee object there.
     */

    /**
     * Task 4: Create a Goods class. Every goods has to have a name and a price.
     * Add constructor, getter and setter methods. Try these in main method.
     */

    /**
     * Task 5: Create a Basket class with list of goods. This class should have:
     *      - createReceipt method to generate a String with name and price of goods in separate rows
     *      - getTotalPrice method to return with the total price of the basket
     * Try these methods in main.
     */

    /**
     * Task 6: Derive a Shopping class from Basket class. This class should have:
     *      - addGoods method to add a new Goods object to the list
     *      - updatePrice method to change the price of an element
     *      - removeGoods method to remove it from the list
     * Try these methods in main.
     */

    /**
     * Task 7: Create a Coffee class with name and price attributes.
     * Coffee class should have only setters and getters of its attributes.
     * Derive a Cappuccino and an Espresso from this class. Their name and price should be set in a constructor:
     *      - Cappuccino: 450
     *      - Espresso: 320
     * Create Coffee, Cappuccino and Espresso objects and write their name and price in main.
     */

    /**
     * Task 8: Create a Fruit class with name and weight attributes.
     * Both attributes should have getters and setters.
     * Derive new classes from Fruit:
     *      - Grape: It should have a type attribute with getter and setter.
     *      - Apple: It should have a pieces and a color attribute with getter and setter.
     * Also create a Colour enum with RED and GREEN values.
     * Derive from Apple:
     *      - GrannySmith: Its color attribute should be GREEN. Add a getter, too.
     *      - Gala: Its color attribute should be RED. Add a getter, too.
     * Create new object of these classes in a main method. What methods are available to the object?
     */

    /**
     * Task 9: Create a PublicVehicle class. Public vehicles have a lineNumber and a length attribute.
     * There should be a getters and setters in the class.
     * You should derive from PublicVehicle:
     *      - Bus: Its new attribute is isElectric.
     *      - Tram: Its new attribute is numberOfTramcars.
     *      - Metro: Its new attribute is numberOfStations.
     * Both derived class should have its own constructor, getters and setters.
     * Create a PublicTransport class with a list of PublicVehicles. There should be a getter and
     * an addVehicle(PublicVehicle vehicle) method in the class.
     */
}
