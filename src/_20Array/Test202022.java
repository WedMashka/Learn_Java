package _20Array;

import java.util.ArrayList;

public class Test202022 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> sb1 = new ArrayList<>();
       StringBuilder sb11 = new StringBuilder("apple");
       StringBuilder sb12 = new StringBuilder("pineapple");
       StringBuilder sb13 = new StringBuilder("peach");
       StringBuilder sb14 = new StringBuilder("cherry");
       StringBuilder sb15 = new StringBuilder("pear");
       sb1.add(sb11);
        sb1.add(sb12);
        sb1.add(sb13);
        sb1.add(sb14);
        sb1.add(sb15);
        for (int i =0; i<sb1.size(); i++){
            StringBuilder n = sb1.get(i);

            System.out.print(n + ", ");
            if (i +1 ==sb1.size()){
                System.out.println("");
            }
        }
         int h = sb1.indexOf(sb12);
        System.out.println(h);

        sb1.remove(2);
        for (int i =0; i<sb1.size(); i++){
            StringBuilder n = sb1.get(i);

            System.out.print(n + ", ");
            if (i +1 ==sb1.size()){
                System.out.println("");
            }
        }

        sb1.remove(sb11);
        for (int i =0; i<sb1.size(); i++){
            StringBuilder n = sb1.get(i);

            System.out.print(n + ", ");
            if (i +1 ==sb1.size()){
                System.out.println(" ");
            }
        }

        boolean bb = sb1.isEmpty();
        System.out.println(bb);

        sb1.clear();
        boolean bb2 = sb1.isEmpty();
        System.out.println(bb2);
        sb1.add(sb11);
        sb1.add(sb12);
        sb1.add(sb13);
        sb1.add(sb14);
        sb1.add(sb15);
        for (int i =0; i<sb1.size(); i++){
            StringBuilder n = sb1.get(i);

            System.out.print(n + ", ");
            if (i +1 ==sb1.size()){
                System.out.println(" ");
            }
        }

        boolean bb20 = sb1.contains(sb14);
        System.out.println(bb20);
        sb1.remove(3);
        bb20 = sb1.contains(sb14);
        System.out.println(bb20);
        for (int i =0; i<sb1.size(); i++){
            StringBuilder n = sb1.get(i);

            System.out.print(n + ", ");
            if (i +1 ==sb1.size()){
                System.out.println(" ");
            }
        }

    }
}
