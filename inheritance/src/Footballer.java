public class Footballer extends Athlete{

    String club;
    int shirtNumber;

    Footballer(String name, int age, String sport, String club, int shirtNumber) {
        super(name, age, sport);
        this.club = club;
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
