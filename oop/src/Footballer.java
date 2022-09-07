public class Footballer {

    private String name;
    private int shirtNumber;
    private char position;
    static int numberOfPlayers;

    Footballer(String name, int shirtNumber, char position) {
        this.name = name;
        this.shirtNumber = shirtNumber;
        this.position = position;

        numberOfPlayers++;
    }

    // overloaded constructor
    Footballer(Footballer player) {
        this.copy(player);
    }

    // getter methods
    public String getName() {
        return this.name;
    }

    public int getShirtNumber() {
        return this.shirtNumber;
    }

    public char getPosition() {
        return this.position;
    }

    // setter methods
    protected void setName(String name) {
        this.name = name;
    }

    protected void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    protected void setPosition(char position) {
        this.position = position;
    }

    // overwriting toString method
    @Override
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
        System.out.printf("Total number of players instantiated: %d\n", numberOfPlayers);
    }

    // copy method
    public void copy(Footballer player) {
        this.setName(player.getName());
        this.setShirtNumber(player.getShirtNumber());
        this.setPosition(player.getPosition());
    }
}
