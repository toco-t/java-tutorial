public class Athlete {

    String name;
    int age;
    String sport;

    Athlete(String name, int age, String sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    @Override
    public String toString() {
        return (this.name + "\n" + this.age + "\n" + this.sport + "\n");
    }
}
