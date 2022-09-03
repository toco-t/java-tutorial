import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registering a player...");
        System.out.println("Enter the player's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the shirt number :");
        int shirtNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the player's nationality: ");
        String nationality = scanner.nextLine();

        System.out.printf("%s: %s -> No.%d", name, nationality, shirtNumber);
    }
}
