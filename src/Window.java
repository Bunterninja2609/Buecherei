import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private JButton lastButton;
    private JButton nextButton;
    private JPanel contentPane;
    private JLabel titleField;
    private JLabel authorField;
    private JLabel genreField;
    private JLabel currentBook;
    private int bookIndex = 0;
    private int shelfIndex = 0;
    private Library library;

    public Window(Library library) {
        this.library = library;
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseBookIndex(1);
                showBookData();
            }
        });
        lastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseBookIndex(-1);
                showBookData();
            }
        });
    }

    private void increaseBookIndex(int i) {
        bookIndex += i;
        shelfIndex = bookIndex/library.getShelfSize();
    }
    private void showBookData(){
        Book book = library.getBookshelf(shelfIndex).getBook(bookIndex%library.getShelfSize());
        this.titleField.setText(book.getTitle());
        this.authorField.setText(book.getAuthor());
        this.genreField.setText(book.getGenre());
        currentBook.setText("Book " + (bookIndex%library.getShelfSize() +1) + " in Shelf " + (shelfIndex+1));
    }

    public JPanel getContentPane() {
        return contentPane;
    }
}
