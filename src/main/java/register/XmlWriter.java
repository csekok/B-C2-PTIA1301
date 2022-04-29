package register;

// https://mkyong.com/java/how-to-create-xml-file-in-java-dom/

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String filepath = "src/main/resources/users.xml";
        ArrayList<User> users = XmlReader.readUsersFromXml(filepath);
        menuProcessing(users);
        saveUsersToXml(users, filepath);
    }

    private static void menuProcessing(ArrayList<User> users) {
        int choice = -1;
        while (choice != 0) {
            System.out.println("1 - List users\r\n2 - Add new user\r\n3 - Modify a user\r\n" +
                               "4 - Delete a user\r\n0 - Exit");
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Not valid option.");
            }
            scanner.nextLine();
            switch (choice) {
                case 1 -> listUsers(users);
                case 2 -> addNewUser(users);
                case 3 -> modifyUser(users);
                case 4 -> deleteUser(users);
            }
        }
    }

    private static void deleteUser(ArrayList<User> users) {
        System.out.print("Enter name of user, what you want to delete: ");
        try {
            users.remove(findUser(users, scanner.nextLine()));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void modifyUser(ArrayList<User> users) {
        System.out.print("Enter name of user, what you want to modify: ");
        try {
            User user = findUser(users, scanner.nextLine());
            users.set(users.indexOf(user), new User(user.getName(), inputBirthYear(),
                                                    inputAddress(), inputEyeColor()));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static User findUser(ArrayList<User> users, String name)
                        throws IllegalArgumentException {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        throw new IllegalArgumentException("Missing user with name: " + name);
    }

    private static void addNewUser(ArrayList<User> users) {
        users.add(new User(inputName(), inputBirthYear(), inputAddress(), inputEyeColor()));
    }

    private static String inputName() {
        System.out.print("Enter the name of user: ");
        return scanner.nextLine();
    }

    private static String inputAddress() {
        System.out.print("Enter the address of user: ");
        return scanner.nextLine();
    }

    private static int inputBirthYear() {
        int birthYear = 0;
        while (birthYear < 1900 || birthYear > 2022) {
            System.out.print("Enter the birth year of user: ");
            try {
                birthYear = scanner.nextInt();
                if (birthYear < 1900 || birthYear > 2022) {
                    System.out.println("Birth year must be an integer between 1900 and 2022.");
                }
            } catch (Exception e) {
                System.out.println("Birth year must be an integer.");
            }
            scanner.nextLine();
        }
        return birthYear;
    }

    private static EyeColor inputEyeColor() {
        EyeColor eyeColor = EyeColor.BLUE;
        String eyeColorString = "";
        while (eyeColorString.isEmpty()) {
            System.out.print("Enter eye color of user: ");
            eyeColorString = scanner.nextLine().toUpperCase();
            try {
                eyeColor = EyeColor.valueOf(eyeColorString);
            } catch (IllegalArgumentException e) {
                System.out.println("There is no eye color with this name.");
                eyeColorString = "";
            }
        }
        return eyeColor;
    }

    private static void listUsers(ArrayList<User> users) {
        System.out.println(users);
    }

    public static void saveUsersToXml(ArrayList<User> users, String filepath) {
        try {
            Document document = DocumentBuilderFactory.newInstance()
                                                      .newDocumentBuilder().newDocument();
            Element rootElement = document.createElement("users");
            document.appendChild(rootElement);

            for (User user : users) {
                Element userElement = document.createElement("user");
                rootElement.appendChild(userElement);
                createChildElement(document, userElement, "name", user.getName());
                createChildElement(document, userElement, "birthYear",
                                                          String.valueOf(user.getBirthYear()));
                createChildElement(document, userElement, "address", user.getAddress());
                createChildElement(document, userElement, "eyeColor",
                                                          user.getEyeColor().toString());
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new FileOutputStream(filepath));

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createChildElement(Document document, Element parent,
                                           String tagName, String text) {
        Element element = document.createElement(tagName);
        element.setTextContent(text);
        parent.appendChild(element);
    }

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
