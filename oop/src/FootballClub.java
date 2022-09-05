import java.util.ArrayList;

public class FootballClub {

    String name;
    ArrayList <Footballer> club = new ArrayList<>();

    FootballClub(String name) {
        this.name = name;
    }

    void sign(Footballer player) {
        club.add(player);
        System.out.printf("Announcement - %s has signed for %s.\n", player.name, this.name);
        System.out.println(club);
    }
}
