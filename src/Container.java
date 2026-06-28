import java.util.Random;

public class Container {
    private static String[] firstName = {
            "Vladimir", "Helena", "Muhamed", "Jesus", "Heinz", "Günter", "Karl", "Jemans", "Tom", "Miot", "Joshua", "Bennet", "Viktoria", "Jonas", "Vika"
    };
    private static String[] lastName = {
            "Kachinski", "Hadupsi", "Abdul", "Christ", "Müller", "Ghünter", "Marx", "Niemans","Qadouri", "Stiefelenergie", "Schuhkraft", "Becker", "Draxler", "Gromov", "Koch"
    };
    private static String[] genre = {"Horror", "Philosophy", "Action", "Adventure", "Comedy", "Drama", "Cooking"};

    private static String[] titleStart = {"", "Money ", "Cars ", "Memory ", "Science ", "Technology ", "Fun ", "Religion ", "Tomfolery ", "Love ", "Joshi ", "Tom ", "David ", "Bennet ", "Elias ", "God ", "Lust ", "HELP ME ","Jonas ", "Vito "};
    private static String[] titleEnd = {"Capital", "Downfall of Society", "Savior", "Solution", "Genocide", "Story", "Tragedy", "Joke", "Ignorance of the people", "Dilemma", "Story in 2 Acts", "Analyzation of Society", "Socialist Worldrevolution", "Fool", "Whore", "Idiocy", "Movie", "Tutorial", "Life", "Sadness"};
    private static String[] titleArticle = {"The ", "A ", "Some ", "The One And Only ", "The Gay ", "The Worst ", "The Best ", "The Cutest "};
    private static String[] titleVerb = {"", ", ", "Was ", "Is ", "In ", "Without ", "And ", "With "};
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
        int titleArticleIndex = (int)(Math.random()* titleArticle.length);
        int titleVerbIndex = (int)(Math.random()* titleVerb.length);
        return titleStart[titleStartIndex] + titleVerb[titleVerbIndex] + titleArticle[titleArticleIndex] + titleEnd[titleEndIndex];
    }
}
