public class Book {
    private String title;
    private String author;
    private String genre;
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public Book() {
        this.title = Container.generateTitle();
        this.author = Container.generateAuthor();
        this.genre = Container.generateGenre();
        System.out.println("-------------------------");
        System.out.println(title);
        System.out.println("By " + author);
        System.out.println(genre);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}
