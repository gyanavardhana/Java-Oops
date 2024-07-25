package Task5;
import java.util.*;
class Book {
    private String title;
    private String author;
    private int ISBN;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Book(String title, String author, int iSBN) {
        this.title = title;
        this.author = author;
        ISBN = iSBN;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public void show(){
        System.out.println("Book Title: "+this.title+" Authour: "+this.author+" ISBN "+this.ISBN);
    }
    
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println("Book added to the Library");
    }

    public boolean removeBook(int ISBN) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getISBN() == ISBN) {
                iterator.remove();
                System.out.println("Book removed from the Library");
                return true;
            }
        }
        System.err.println("Book with ISBN " + ISBN + " not found in the Library");
        return false;
    }

    public void printBooks() {
        for (Book b : this.books) {
            b.show();
        }
    }
}

public class Lib {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Game of Thrones", "George R.R. Martin", 1));
        library.addBook(new Book("Berserk", "Kentaro Miura", 2));

        if (library.removeBook(1)) {
            System.out.println("Book removed");
        } else {
            System.err.println("Book not removed");
        }

        library.printBooks();
    }
}