public class Library {
    private Bookshelf[] bookshelfs;
    private int shelfSize = 10;
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
}
