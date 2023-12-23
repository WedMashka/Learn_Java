package _20Array;

import java.util.ArrayList;

public class _20Test2 {
    public static void main(String[] args) {
        ArrayList<String> some_text = new ArrayList<>();
        some_text.add("one");
        some_text.add("two");
        some_text.add("three");
        some_text.add("four");
        some_text.add("five");
        for (String r:some_text) {
            System.out.print(r + ", ");
        }
        System.out.println("");
        some_text.add(2,"Move three");

        for (String r:some_text) {
            System.out.print(r +", ");
        }
        System.out.println("");

        ArrayList<Integer> int_number = new ArrayList<>();
        int_number.add(1);
        int_number.add(3);
        int_number.add(5);
        int_number.add(7);
        int_number.add(9);
        int_number.add(11);
        int_number.add(13);
        for (Integer r: int_number) {
            System.out.print(r +", ");
        }
        System.out.println("");

        int_number.set(3,44444);
        for (Integer r: int_number) {
            System.out.print(r +", ");
        }
        System.out.println("");





    }
}
