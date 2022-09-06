import java.util.ArrayList;

public class FootballClub {

    private final String name;
    private final ArrayList <Footballer> club = new ArrayList<>();

    FootballClub(String name) {
        this.name = name;
    }

    // getter methods
    public String getName() {
        return this.name;
    }

    public ArrayList<Footballer> getClub() {
        return this.club;
    }

    void sign(Footballer player) {
        club.add(player);
        System.out.printf("Announcement - %s has signed for %s.\n", player.getName(), this.name);
        System.out.println(club);
    }
}
