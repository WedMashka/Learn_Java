package _20Array;

import java.util.ArrayList;

public class Test2020 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("One");
        StringBuilder sb2 = new StringBuilder("two");
        StringBuilder sb3 = new StringBuilder("three");
        StringBuilder sb4 = new StringBuilder("four");
        StringBuilder sb5 = new StringBuilder("five");
        ArrayList<StringBuilder> sbList = new ArrayList<>();
        sbList.add(sb1);
        sbList.add(sb2);
        sbList.add(sb3);
        sbList.add(sb4);
        sbList.add(sb5);
        System.out.println(" ");
        for (int i = 0; i<sbList.size();i++){
            System.out.print(sbList.get(i) + ", ");
        }
        for (int i=0; i<sbList.size();i++){
            sbList.get(i).append(" September");
        }
        System.out.println(" ");

        for (int i = 0; i<sbList.size();i++){
            System.out.print(sbList.get(i) + ", ");
        }
        sbList.remove(2);
        System.out.println(" ");

        for (int i = 0; i<sbList.size();i++){
            System.out.print(sbList.get(i) + ", ");
        }
        sbList.remove(sb5);
        System.out.println(" ");

        for (int i = 0; i<sbList.size();i++){
            System.out.print(sbList.get(i) + ", ");
        }

        ArrayList<StringBuilder> sbList2 = new ArrayList<>();
        sbList2.add(sb1);
        sbList2.add(sb5);
        sbList.addAll(sbList2);
        System.out.println(" ");

        for (int i = 0; i<sbList.size();i++){
            System.out.print(sbList.get(i) + ", ");
        }

    }
}
