package Gray;

public class Anime {

    String title;
    int year;
    String genre1[];
    String studioName;
    int numOfEpisodes;
    String language;
    String status;

    //overloading methods - same method name but diff parameters

    public Anime() {

    }

    public Anime(String title) {
        this.title = title;
    }

    public Anime(String title, int year, int numOfEpisodes) { //method definition containing the parameter list
        this.title = title;
        this.year = year;
        this.numOfEpisodes = numOfEpisodes;
    }
}