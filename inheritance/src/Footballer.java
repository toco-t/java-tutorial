public class Footballer extends Athlete{

    private String club;
    private int shirtNumber;

    Footballer(String name, int age, String sport, String club, int shirtNumber) {
        super(name, age, sport);
        this.setClub(club);
        this.setShirtNumber(shirtNumber);
    }

    // getter methods
    public String getClub() {
        return this.club;
    }

    public int getShirtNumber() {
        return this.shirtNumber;
    }

    // setter methods
    protected void setClub(String club) {
        this.club = club;
    }

    protected void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    @Override
    void train() {
        System.out.println(super.name + " is training...");
    }

    @Override
    public String toString() {
        return (super.toString() + this.club + "\n" + this.shirtNumber + "\n");
    }
}
