package register;

public class NewRegisterMain {
    /**
     * Task 0: Update the project:
     *          - From menu: Git / "Update Project...", OR
     *          - In right upper corner: blue arrow, OR
     *          - Keyboard shortcut: Ctrl+T
     * In "Update the project" popup click on Ok button.
     */

    /**
     * Task 1: Create a main method, where:
     *          - Create a new list of User objects.
     *          - Add 3 users to the list:
     *              - Tony Stark, 1970, 10880 Malibu Point, Malibu
     *              - Stephen Strange, 1930, 177A Bleecker Street, New York City
     *              - Steve Rogers, 1918, 569 Leaman Place, Brooklyn
     *          - Print the list
     *          - Remove Tony Stark from the list
     *          - Print the list
     *          - Add to the 2nd position a new user:
     *              - Peter Parker, 2001, 20 Ingram Street, New York
     *          - Print the list
     */

    /**
     * Task 2: Create a printList method to print the name of users in the list:
     * 1. Tony Stark
     * 2. Stephen Strange
     * 3. Steve Rogers
     * Use this method in main to print the list.
     */

    /**
     * Task 3: Create a writeUsersIntoFile method to save data of users into a file.
     * The method should get the list of users and the filepath.
     * Add a header to the file: Name;BirthYear;Address.
     * After the header write the name, year of birth and address data of users.
     * Each data of the same user should be separated by semicolon (';') character.
     * Data of users should be listed in separated rows.
     * Call the method with previously created list and "src/main/resources/users.csv" string as filepath.
     * Hint: Use BufferedWriter or FileOutputStream to write a file.
     * Hint: You should convert Strings to bytearrays with getBytes() method of String class.
     * Hint: Do not forget to add new line characters.
     * Hint: Create new method for repeating code snippets.
     */

    /**
     * Task 4: Create a readUsersFromFile method to read user's data from the file.
     * The method should return with the list of users.
     * Hint: Use BufferedReader or FileInputStream to read from a file.
     * Hint: Take care about the header row.
     */

    /**
     * Task 5: Create similar reader and writer methods to read and write Song objects.
     */

    /**
     * Task 6: Create similar reader and writer methods to read and write Note objects.
     */

    /**
     * Task 7: Create similar reader and writer methods to read and write Book objects.
     */
}
