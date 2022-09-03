public class Arrays {
    public static void main(String[] args) {

        String[] cars = {"Mustang", "Tesla", "Lamborghini"};
        cars[0] = "BMW";

        // for (int i = 0; i < cars.length; i++) { //<- use index
        for (String car : cars) { // <- enhanced version of for loop
            System.out.println(car);
        }

        // 2D array

        //String[][] players = new String[3][3];
        String[][] players = {
                {"Diaz", "Nunez", "Salah"},
                {"Thiago", "Fabinho", "Henderson"},
                {"Robertson", "Van Dijk", "TAA"}
        };

        for (String[] trio : players) {
            for (String player: trio) {
                System.out.print(player + "\t");
            }
            System.out.println();
        }
    }
}
