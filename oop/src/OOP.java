public class OOP {
    public static void main(String[] args) {
        Footballer henderson = new Footballer("Henderson", 14, 'M');

        System.out.println(henderson); // using toString method implicitly

        System.out.println(); // line break
        henderson.register();
        henderson.score();
        henderson.tackle();

        // array of objects
        Footballer milner = new Footballer("Milner", 7, 'M');
        Footballer vandijk = new Footballer("Van Dijk", 4, 'D');

        Footballer[] skippers = {henderson, milner, vandijk};

        System.out.println(); // line break
        System.out.println(skippers[2]);

        // object passing
        FootballClub liverpool = new FootballClub("Liverpool FC");

        System.out.println(); // line break
        liverpool.sign(vandijk);

        // static keyword modifier
        System.out.println(); // line break
        Footballer.numberOfPlayers();

        // copy constructor
        System.out.println(); // line break
        milner.copy(vandijk);
        System.out.println(milner);
    }
}
