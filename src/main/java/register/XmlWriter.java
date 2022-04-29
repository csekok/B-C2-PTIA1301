package register;

// https://mkyong.com/java/how-to-create-xml-file-in-java-dom/

public class XmlWriter {
    /**
     * Task 0: Update the project:
     *          - From menu: Git / "Update Project...", OR
     *          - In right upper corner: blue arrow, OR
     *          - Keyboard shortcut: Ctrl+T
     * In "Update the project" popup click on Ok button.
     */

    /**
     * Task 1:
     * Create a saveUsersToXml(users, filepath) method to store
     * the list of User objects in a given XML file.
     * Create a main method.
     * In main method:
     *       - create a list of User objects
     *       - call saveUsersToXml method with the list and
     *              "src/main/resources/users.xml" as parameters
     * Hint: Use the readUsersFromXml method from previous class to
     *       create list of User objects.
     * Hint: Use TransformerFactory.newInstance().newTransformer()
     *       method to write XML files.
     * Hint: Create method to add elements to the hierarchy.
     */

    /**
     * Task 2:
     * Create a console application in main method. When the application
     * starts read data of users from an XML file and build up a list of
     * User objects. Create a console menu with (1) list users and (0)
     * exit options. When your user enters 1, your application should
     * print all data of users. When your user enters 0, your application
     * should terminate.
     * Hint: Use the readUsersFromXml method from previous class to
     *       create list of User objects.
     */

    /**
     * Task 3:
     * Add new option to your applications: (2) add new user.
     * When your user chooses this option, your application
     * should ask and validate all data of a new user one by
     * one. Before your application terminates, you should
     * update the list of users in the XML file.
     * Hint: Use the saveUsersToXml method from Task 1.
     */

    /**
     * Task 4:
     * Add new option to your applications: (3) modify user.
     * When your user chooses this option, your application
     * should:
     *      - define the user with her/his name
     *      - ask and validate all data of the user one by one
     * Hint: Define an id attribute to User objects, so you can
     *       also support name modifications. Do not forget to
     *       add is to listing and XML file so your user will
     *       know it.
     */

    /**
     * Task 5:
     * Add new option to your applications: (4) delete user.
     * When your user chooses this option, your application
     * should define the user with her/his name and remove it.
     */

    /**
     * Homework:
     * Create similar register applications to Song, PublicVehicle,
     * Note, Goods, Fruit, Employee and Book objects.
     * Note: There is no test to this task.
     */
}
