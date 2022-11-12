package Gray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimeDemo {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of animes you wish to enter");
        int userinput = Integer.parseInt(reader.readLine());

        Anime animeArray[] = new Anime[userinput];

        for(int i = 0; i < animeArray.length; i++) {
            System.out.println("Enter the title, year and number of episodes: ");
            String title = reader.readLine();
            int year = Integer.parseInt(reader.readLine());
            int episodes = Integer.parseInt(reader.readLine());

            animeArray[i] = new Anime(title, year, episodes);
        }

        for(int i = 0; i < animeArray.length; i++) {
            System.out.print("Title: " + animeArray[i].title);
            System.out.print(" Year: " + animeArray[i].year);
            System.out.print(" Episodes: " + animeArray[i].numOfEpisodes);
            System.out.println();
        }

    }
}
