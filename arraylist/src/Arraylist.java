import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // ArrayList -> a resizable array that can only store reference data types

        // ArrayList <String> countries = new ArrayList<>();

        //countries.add("Canada");
        //countries.add("Germany");

        //countries.set(1, "Japan");
        //countries.remove(1);
        //countries.clear();

        //for (int i = 0; i < countries.size(); i++) {
        //    System.out.println(countries.get(i));
        //}

        ArrayList<Integer> forwards = new ArrayList<>();
        forwards.add(23);
        forwards.add(9);
        forwards.add(11);

        ArrayList<Integer> midfielders = new ArrayList<>();
        midfielders.add(6);
        midfielders.add(3);
        midfielders.add(14);

        ArrayList<Integer> defenders = new ArrayList<>();
        defenders.add(26);
        defenders.add(4);
        defenders.add(2);
        defenders.add(66);

        ArrayList<ArrayList<Integer>> liverpool = new ArrayList<>();
        liverpool.add(forwards);
        liverpool.add(midfielders);
        liverpool.add(defenders);

        System.out.println(liverpool.get(0).get(2));
    }
}
