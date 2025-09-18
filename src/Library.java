import java.util.ArrayList;

public class Library {
    private Bookshelf[] bookshelfs;
    private int shelfSize = 100;
    public Library(int size) {
        bookshelfs = new Bookshelf[size];
        for (int i = 0; i < bookshelfs.length; i++) {
            bookshelfs[i] = new Bookshelf(shelfSize);
        }
    }
    public Bookshelf getBookshelf(int i) {
        return bookshelfs[i];
    }
    public int getShelfSize() {
        return shelfSize;
    }
    public Book[] findBook(String search, String searchType) {
        ArrayList<Book> books = new ArrayList<>();
        for (Bookshelf bookshelf : bookshelfs) {
            for (Book book : bookshelf.getBooks()) {
                switch (searchType){
                    case "title":
                        if (book.getTitle().toLowerCase().contains(search.toLowerCase())) {
                            books.add(book);
                        }
                        break;
                    case "author":
                        if (book.getAuthor().toLowerCase().contains(search.toLowerCase())) {
                            books.add(book);
                        }
                        break;
                    case "genre":
                        if (book.getGenre().toLowerCase().contains(search.toLowerCase())) {
                            books.add(book);
                        }
                        break;

                }
            }
        }
        //System.out.println(books.size());
        return books.toArray(new Book[books.size()]);
    }
    public int getBookshelfIndex(Bookshelf bookshelf) {
        for (int i = 0; i < bookshelfs.length; i++) {
            if (bookshelfs[i].equals(bookshelf)) {
                return i;
            }
        }
        return -1;
    }
}
