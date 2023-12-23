package _14For;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        for(int x = 1; x<21; x++){
            for (int z = 1; z<21; z++){
                int y = x*z;
                System.out.println(x +" * " + z  +" = " + y);
            }
        }


//        for (int i = 1; i<15; i++){
//            if(i == 6 || i == 5 || i ==4) {
//                System.out.println("number 6 you will not see");
//                continue;
//            }
//
//            System.out.println(i);
//        }


       /* st:
        for (double i = 1; i<3; i = i +0.1){
            System.out.println(i);
            if(i == 2.7000000000000015) break st;
        }*/

//        Scanner in = new Scanner(System.in);
//        System.out.println("enter number");
//        int i = in.nextInt();
//        for (; i<6; ){
//            System.out.println(" enter other number");
//            i = in.nextInt();

      //  }
       // System.out.println(i);
    }
}
