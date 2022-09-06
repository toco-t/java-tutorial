// abstract classes cannot be instantiated but can have subclasses
public abstract class Athlete {

    String name;
    int age;
    String sport;

    Athlete(String name, int age, String sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    //
    abstract void train();

    @Override
    public String toString() {
        return (this.name + "\n" + this.age + "\n" + this.sport + "\n");
    }
}
