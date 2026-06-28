import java.util.Random;

public class Bookshelf {
    private Book[] books;
    public Bookshelf(int size) {
        books = new Book[size];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
        }
    }
    public int getSize(){
        return books.length;
    }
    public Book getBook(int i){
        return books[i];
    }
    public Book[] getBooks(){
        return books;
    }
}
