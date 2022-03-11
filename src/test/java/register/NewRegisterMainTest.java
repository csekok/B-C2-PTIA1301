package register;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NewRegisterMainTest {
    //TODO Before doing a task uncomment its tests.

    private static final String RESOURCE_PATH = "src/test/resources/";
    private static final String READ_PREFIX = "read_";
    private static final String WRITE_PREFIX = "write_";
    private static final String FILE_EXTENSION = ".csv";
    private static final String BOOKS = "books";
    private static final String BOOK_HEADER = "Author;Title;Isbn";
    private static final String NOTES = "notes";
    private static final String NOTE_HEADER = "Name;Topic;Text";
    private static final String SONGS = "songs";
    private static final String SONG_HEADER = "Band;Title;Length in minutes";
    private static final String USERS = "users";
    private static final String USER_HEADER = "Name;BirthYear;Address";

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    /** Task 3
     @Test
     public void testWriteUsersIntoFile() throws IOException {
     String filepath = RESOURCE_PATH + WRITE_PREFIX + USERS + FILE_EXTENSION;

     ArrayList<User> expected = generateTestUsersList();

     NewRegisterMain.writeUsersIntoFile(expected, filepath);

     List<String> actual = Files.readAllLines(Path.of(filepath));

     assertEquals(expected.size(), actual.size() - 1);
     assertEquals(actual.get(0), USER_HEADER);

     for (User user: expected) {
     assertEquals(actual.get(expected.indexOf(user) + 1),
     user.getName() + ";" + user.getBirthYear() + ";" + user.getAddress());
     }
     }
     */

    /** Task 4
     @Test
     public void testReadUsersFromFile() throws IOException {
     String filepath = RESOURCE_PATH + READ_PREFIX + USERS + FILE_EXTENSION;

     List<String> expected = Files.readAllLines(Path.of(filepath));

     ArrayList<User> actual = NewRegisterMain.readUsersFromFile(filepath);

     assertEquals(expected.size() - 1, actual.size());
     assertEquals(expected.get(0), USER_HEADER);

     for (User user: actual) {
     assertEquals(expected.get(actual.indexOf(user) + 1),
     user.getName() + ";" + user.getBirthYear() + ";" + user.getAddress());
     }
     }
     */

    /** Task 5
     @Test
     public void testWriteSongsIntoFile() throws IOException {
     String filepath = RESOURCE_PATH + WRITE_PREFIX + SONGS + FILE_EXTENSION;

     ArrayList<Song> expected = generateTestSongsList();

     NewRegisterMain.writeSongsIntoFile(expected, filepath);

     List<String> actual = Files.readAllLines(Path.of(filepath));

     assertEquals(expected.size(), actual.size() - 1);
     assertEquals(actual.get(0), SONG_HEADER);

     for (Song son: expected) {
     assertEquals(actual.get(expected.indexOf(son) + 1),
     son.getBand() + ";" + son.getTitle() + ";" + son.getLengthInMinutes());
     }
     }

     private static ArrayList<Song> generateTestSongsList() {
     ArrayList<Song> list = new ArrayList<>();
     Song song = new Song();
     song.setBand("Beethoven");
     list.add(song);

     song = new Song();
     song.setTitle("Third Symphony");
     list.add(song);

     song = new Song();
     song.setLengthInMinutes(65.5);
     list.add(song);

     song = new Song();
     song.setBand("Backstreet Boys");
     song.setTitle("I Want It That Way");
     song.setLengthInMinutes(3.55);
     list.add(song);

     song = new Song();
     song.setBand("Antonio Vivaldi");
     song.setTitle("The Four Seasons");
     list.add(song);

     return list;
     }

     @Test
     public void testReadSongsFromFile() throws IOException {
     String filepath = RESOURCE_PATH + READ_PREFIX + SONGS + FILE_EXTENSION;

     List<String> expected = Files.readAllLines(Path.of(filepath));

     ArrayList<Song> actual = NewRegisterMain.readSongsFromFile(filepath);

     assertEquals(expected.size() - 1, actual.size());
     assertEquals(expected.get(0), SONG_HEADER);

     for (Song song: actual) {
     assertEquals(expected.get(actual.indexOf(song) + 1),
     song.getBand() + ";" + song.getTitle() + ";" + song.getLengthInMinutes());
     }
     }*/

    /** Task 6
     @Test
     public void testWriteNotesIntoFile() throws IOException {
     String filepath = RESOURCE_PATH + WRITE_PREFIX + NOTES + FILE_EXTENSION;

     ArrayList<Note> expected = generateTestNotesList();

     NewRegisterMain.writeNotesIntoFile(expected, filepath);

     List<String> actual = Files.readAllLines(Path.of(filepath));

     assertEquals(expected.size(), actual.size() - 1);
     assertEquals(actual.get(0), NOTE_HEADER);

     for (Note note: expected) {
     assertEquals(actual.get(expected.indexOf(note) + 1),
     note.getName() + ";" + note.getTopic() + ";" + note.getText());
     }
     }

     private static ArrayList<Note> generateTestNotesList() {
     ArrayList<Note> list = new ArrayList<>();
     Note note = new Note();
     note.setName("Jane Doe");
     list.add(note);

     note = new Note();
     note.setTopic("Math");
     list.add(note);

     note = new Note();
     note.setText("We need a constructor");
     list.add(note);

     note = new Note();
     note.setName("Jane Doe");
     note.setTopic("Note");
     note.setText("We need a constructor");
     list.add(note);

     note = new Note();
     note.setName("John Doe");
     note.setTopic("Java");
     note.setText("");
     list.add(note);

     return list;
     }

     @Test
     public void testReadNotesFromFile() throws IOException {
     String filepath = RESOURCE_PATH + READ_PREFIX + NOTES + FILE_EXTENSION;

     List<String> expected = Files.readAllLines(Path.of(filepath));

     ArrayList<Note> actual = NewRegisterMain.readNotesFromFile(filepath);

     assertEquals(expected.size() - 1, actual.size());
     assertEquals(expected.get(0), NOTE_HEADER);

     for (Note note: actual) {
     assertEquals(expected.get(actual.indexOf(note) + 1),
     note.getName() + ";" + note.getTopic() + ";" + note.getText());
     }
     }
     */

    /** Task 7
     @Test
     public void testWriteBooksIntoFile() throws IOException {
     String filepath = RESOURCE_PATH + WRITE_PREFIX + BOOKS + FILE_EXTENSION;

     ArrayList<Book> expected = generateTestBooksList();

     NewRegisterMain.writeBooksIntoFile(expected, filepath);

     List<String> actual = Files.readAllLines(Path.of(filepath));

     assertEquals(expected.size(), actual.size() - 1);
     assertEquals(actual.get(0), BOOK_HEADER);

     for (Book book: expected) {
     assertEquals(actual.get(expected.indexOf(book) + 1),
     book.getAuthor() + ";" + book.getTitle() + ";" + book.getIsbn());
     }
     }

     private static ArrayList<Book> generateTestBooksList() {
     ArrayList<Book> list = new ArrayList<>();
     Book book;
     book = new Book("J. K. Rowling", "Harry Potter and the Philosopher's Stone");
     book.register("0-7475-3269-9");
     list.add(book);

     book = new Book("J. K. Rowling", "Harry Potter and the Chamber of Secrets");
     book.register("0-7475-3849-2");
     list.add(book);

     book = new Book("J. K. Rowling", "Harry Potter and the Prisoner of Azkaban");
     book.register("0-7475-4215-5");
     list.add(book);

     book = new Book("J. K. Rowling", "Harry Potter and the Goblet of Fire");
     book.register("0-7475-4624-X");
     list.add(book);

     book = new Book("J. K. Rowling", "Harry Potter and the Order of the Phoenix");
     book.register("0-7475-5100-6");
     list.add(book);

     book = new Book("J. K. Rowling", "Harry Potter and the Half-Blood Prince");
     book.register("0-7475-8108-8");
     list.add(book);

     book = new Book("J. K. Rowling", "Harry Potter and the Deathly Hallows");
     book.register("0-545-01022-5");
     list.add(book);

     return list;
     }

     @Test
     public void testReadBooksFromFile() throws IOException {
     String filepath = RESOURCE_PATH + READ_PREFIX + BOOKS + FILE_EXTENSION;

     List<String> expected = Files.readAllLines(Path.of(filepath));

     ArrayList<Book> actual = NewRegisterMain.readBooksFromFile(filepath);

     assertEquals(expected.size() - 1, actual.size());
     assertEquals(expected.get(0), BOOK_HEADER);

     for (Book book: actual) {
     assertEquals(expected.get(actual.indexOf(book) + 1),
     book.getAuthor() + ";" + book.getTitle() + ";" + book.getIsbn());
     }
     }
     */

    private static ArrayList<User> generateTestUsersList() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Bella Dyer",1933,"709 Vale Ave. Hixson, TN 37343"));
        list.add(new User("Alexandra Mitchell",2020,"40 S. Poplar Lane Kearny, NJ 07032"));
        list.add(new User("Ella Carr",1932,"11 Heritage Street Germantown, MD 20874"));
        list.add(new User("Stephen Mills",1996,"26 W. Cooper Dr. Pasadena, MD 21122"));
        list.add(new User("Frank Hemmings",1927,"298 Clay St. Bethel Park, PA 15102"));
        list.add(new User("Harry Sanderson",1964, "788 NE. Cherry Hill Street Fernandina Beach, FL 32034"));
        list.add(new User("Penelope MacDonald",2004,"505 Holly St. Hendersonville, NC 28792"));
        list.add(new User("Edward Davidson",2000,"7476 Warren Rd. Norwalk, CT 06851"));
        list.add(new User("Karen Sutherland",1967,"119 West Chestnut Dr. Adrian, MI 49221"));
        list.add(new User("Frank Murray",1946,"9247 Randall Mill St. Rolling Meadows, IL 60008"));
        return list;
    }

}