package register;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BookTest {
    //TODO Before doing a task remove "/*" and "*/" in its test class (Shortcut: Ctrl + Shift + /).

/*
    @Test
    public void testConstructorNulls() {
        Book book = new Book(null, null);
        assertNull(book.getAuthor());
        assertNull(book.getTitle());
    }

    @Test
    public void testConstructorNoAuthor() {
        String title = "Fairy Tales";
        Book book = new Book(null, title);
        assertNull(book.getAuthor());
        assertEquals(title, book.getTitle());
    }

    @Test
    public void testConstructorNoTitle() {
        String author = "Anonymous";
        Book book = new Book(author, null);
        assertEquals(author, book.getAuthor());
        assertNull(book.getTitle());
    }

    @Test
    public void testConstructorWithAuthorAndTitle() {
        String author = "Agatha Christie";
        String title = "The Mysterious Affair at Styles";
        Book book = new Book(author, title);
        assertEquals(author, book.getAuthor());
        assertEquals(title, book.getTitle());
    }

    @Test
    public void testSetAuthor() {
        String author = "Agatha Christie";
        String title = "The Murder on the Links";
        String expectedAuthor = "Agatha Mary Clarissa Miller";
        Book book = new Book(author, title);
        book.setAuthor(expectedAuthor);
        assertEquals(expectedAuthor, book.getAuthor());
    }

    @Test
    public void testSetTitle() {
        String author = "Agatha Christie";
        String title = "The Murder on the Links";
        String expectedTitle = "Murder on the Orient Express";
        Book book = new Book(author, title);
        book.setTitle(expectedTitle);
        assertEquals(expectedTitle, book.getTitle());
    }

    @Test
    public void testIsbnBeforeRegister() {
        Book book = new Book("Agatha Christie", "The Big Four");
        assertNull(book.getIsbn());
    }

    @Test
    public void testRegister() {
        String author = "Agatha Christie";
        String title = "Death On The Nile";
        String isbn = "9780061003691";
        Book book = new Book(author, title);
        book.register(isbn);
        assertEquals(isbn, book.getIsbn());
    }*/
}