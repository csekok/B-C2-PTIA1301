package register;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class XmlReaderTest {
    //TODO Before doing a task remove "/*" and "*/" in its test class (Shortcut: Ctrl + Shift + /).

    /*
    @Test
    public void testReadUsersFromXml() {
        String xmlFilepath = "src/test/resources/users.xml";
        ArrayList<User> users = XmlReader.readUsersFromXml(xmlFilepath);

        assertEquals(2, users.size());

        User user = users.get(0);
        assertEquals("Peter Parker", user.getName());
        assertEquals(2001, user.getBirthYear());
        assertEquals("20 Ingram Street, New York", user.getAddress());
        assertEquals(EyeColor.HAZEL, user.getEyeColor());

        user = users.get(1);
        assertEquals("John Doe", user.getName());
        assertEquals(1988, user.getBirthYear());
        assertEquals("Unknown", user.getAddress());
        assertEquals(EyeColor.AMBER, user.getEyeColor());
    }

    @Test
    public void testNumberOfOccurrence() {
        String xmlFilepath = "src/test/resources/users.xml";

        assertEquals(2, XmlReader.numberOfOccurrence(xmlFilepath, "name"));
        assertEquals(2, XmlReader.numberOfOccurrence(xmlFilepath, "birthYear"));
        assertEquals(2, XmlReader.numberOfOccurrence(xmlFilepath, "address"));
        assertEquals(2, XmlReader.numberOfOccurrence(xmlFilepath, "eyeColor"));
        assertEquals(2, XmlReader.numberOfOccurrence(xmlFilepath, "user"));
        assertEquals(1, XmlReader.numberOfOccurrence(xmlFilepath, "users"));
        assertEquals(0, XmlReader.numberOfOccurrence(xmlFilepath, "blablabla"));
    }

    @Test
    public void testGetValuesOf() {
        String xmlFilepath = "src/test/resources/users.xml";

        assertEquals(XmlReader.getValuesOf(xmlFilepath, "name"), "Peter Parker\r\nJohn Doe\r\n");
        assertEquals(XmlReader.getValuesOf(xmlFilepath, "birthYear"), "2001\r\n1988\r\n");
        assertEquals(XmlReader.getValuesOf(xmlFilepath, "address"), "20 Ingram Street, New York\r\nUnknown\r\n");
        assertEquals(XmlReader.getValuesOf(xmlFilepath, "eyeColor"), "HAZEL\r\nAMBER\r\n");
        assertEquals(XmlReader.getValuesOf(xmlFilepath, "blablabla"),
                "blablabla tag does not occur in the file: " + xmlFilepath);
    }
    */
}