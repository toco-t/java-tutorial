import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {

        Animal animal;
        Scanner scan = new Scanner(System.in);

        System.out.print("Would you line a cat or a dog? ");
        String answer = scan.nextLine().toLowerCase();

        animal = (answer.equals("cat")) ? new Cat() : new Dog();
        animal.speak();
    }
}
