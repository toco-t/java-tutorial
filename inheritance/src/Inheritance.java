public class Inheritance {
    public static void main(String[] args) {

        Footballer elliott = new Footballer("Elliott", 19, "Football","Liverpool FC", 19);
        Footballer jones = new Footballer("Jones", 21, "Football", "Liverpool FC", 17);

        System.out.println(elliott);
        System.out.println(jones);

        jones.train();
    }
}
