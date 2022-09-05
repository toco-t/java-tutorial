public class Footballer {

    String name;
    int shirtNumber;
    char position;
    static int numberOfPlayers;

    Footballer(String name, int shirtNumber, char position) {
        this.name = name;
        this.shirtNumber = shirtNumber;
        this.position = position;

        numberOfPlayers++;
    }

    // overwriting toString method
    public String toString() {
        return "Name: " + this.name + "\nNo: " + this.shirtNumber + "\nPosition: " + this.position;
    }

    void register() {
        System.out.printf("No.%d: %s\n", this.shirtNumber, this.name);
    }

    void score() {
        System.out.printf("%s scored!\n", this.name);
    }

    void tackle() {
        System.out.printf("%s tackled...\n", this.name);
    }

    static void numberOfPlayers() {
        System.out.printf("Total number of players instantiated: %d", numberOfPlayers);
    }
}
