import java.util.Random;

public class Container {
    private static String[] firstName = {
            "Vladimir", "Helena", "Muhamed", "Jesus", "Heinz", "Günter", "Karl", "Jemans"
    };
    private static String[] lastName = {
            "Kachinski", "Hadupsi", "Abdul", "Christ", "Müller", "Ghünter", "Marx", "Niemans"
    };
    private static String[] genre = {"Horror", "Philosophy", "Action", "Adventure", "Comedy", "Drama"};

    private static String[] titleStart = {"", "Money", "Cars", "Memory", "Science", "Technology", "Fun", "Religion", "Tomfolery", "Love"};
    private static String[] titleEnd = {"Capital", "Downfall of Society", "Savior", "Solution", "Genocide", "Story", "Tragedy", "Joke", "Ignorance of people", "Dilemma", "Story in 2 Acts", "Analyzation of Society"};
    public static String generateAuthor() {
        int firstNameIndex = (int)(Math.random()* firstName.length);
        int lastNameIndex = (int)(Math.random()* lastName.length);
        return firstName[firstNameIndex] + " " + lastName[lastNameIndex];
    }
    public static String generateGenre() {
        int genreIndex = (int)(Math.random()* genre.length);
        return genre[genreIndex];
    }
    public static String generateTitle() {
        int titleStartIndex = (int)(Math.random()* titleStart.length);
        int titleEndIndex = (int)(Math.random()* titleEnd.length);
        return titleStart[titleStartIndex] + " the " + titleEnd[titleEndIndex];
    }
}
