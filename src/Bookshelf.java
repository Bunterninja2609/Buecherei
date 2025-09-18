import java.util.Random;

public class Bookshelf {
    private Book[] books;
    public Bookshelf(int size) {
        books = new Book[size];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(this);
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
    public int getBookIndex(Book book){
        for (int i = 0; i < books.length; i++) {
            if(book.equals(books[i])){
                return i;
            }
        }
        return -1;
    }

}
