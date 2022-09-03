import java.util.Random;

public class ControlStatements {
    public static void main(String[] args) {
        Random random = new Random();

        int die = random.nextInt(6) + 1;

        /* if (die % 2 == 0) {
        *      System.out.printf("%d: Even!", die);
        *  }
        *  else {
        *      System.out.printf("%d: Odd!", die);
        *  }
        */

        switch (die) {
            case 1 -> System.out.println("You've got 1");
            case 2 -> System.out.println("You've got 2");
            case 3 -> System.out.println("You've got 3");
            case 4 -> System.out.println("You've got 4");
            case 5 -> System.out.println("You've got 5");
            case 6 -> System.out.println("You've got 6");
            default -> System.out.println(die);
        }
    }
}
