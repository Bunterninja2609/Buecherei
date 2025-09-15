import javax.swing.*;
import java.awt.event.*;

public class Window {
    private JButton lastButton;
    private JButton nextButton;
    private JPanel contentPane;
    private JLabel titleField;
    private JLabel authorField;
    private JLabel genreField;
    private JLabel currentBook;
    private JTextField searchBar;
    private JComboBox searchType;
    private JButton lastFilteredButton;
    private JButton nextFilteredButton;
    private JLabel searchResult;
    private int bookIndex = 0;
    private int shelfIndex = 0;
    private Library library;
    Book[] filteredBooks;
    private int filteredBookIndex = 0;

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
        showBookData();

        lastFilteredButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseFilterdBookIndex(-1);
            }
        });
        nextFilteredButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseFilterdBookIndex(1);
            }
        });
        searchBar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filter();
            }
        });
        searchBar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                filter();
            }
        });

        searchType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filter();
            }
        });

    }

    private void increaseBookIndex(int i) {
        bookIndex += i;
        shelfIndex = bookIndex/library.getShelfSize();
    }
    private void increaseFilterdBookIndex(int i) {
        filteredBookIndex += i;
        showFilteredBookData();
    }
    private void showBookData(){
        Book book = library.getBookshelf(shelfIndex).getBook(bookIndex%library.getShelfSize());
        this.titleField.setText(book.getTitle());
        this.authorField.setText(book.getAuthor());
        this.genreField.setText(book.getGenre());
        currentBook.setText("Book " + (bookIndex%library.getShelfSize() +1) + " in Shelf " + (shelfIndex+1));
    }
    private void showFilteredBookData(){
        Book book = filteredBooks[filteredBookIndex];
        this.titleField.setText(book.getTitle());
        this.authorField.setText(book.getAuthor());
        this.genreField.setText(book.getGenre());
        searchResult.setText((filteredBookIndex + 1) + " out of " + filteredBooks.length);
    }
    private void filter(){
        filteredBooks = library.findBook(searchBar.getText(), searchType.getSelectedItem().toString().toLowerCase());
        filteredBookIndex = 0;
        searchResult.setText(1 + " out of " + filteredBooks.length);
    }

    public JPanel getContentPane() {
        return contentPane;
    }
}
