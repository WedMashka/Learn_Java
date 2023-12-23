package _16String;

import java.util.Scanner;


class Employee{
    double salary;
    boolean isManager;
    Employee(double salary, boolean isManager ){
        this.salary = salary;
        this.isManager = isManager;
    }

}

class Car{
    String color;
    String engine;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
}

class Test166{

}
public class Test16 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String trl = null;
        if(trl != null && trl.length()>0){
            System.out.println("Text is written");
        } else {
            System.out.println("Text is not written");
        }
//        final Car car = new Car("red", "V8");
//          car.color = "blue";
//
//        String s1 = new String("Text");
//        System.out.println(s1);
//        System.out.println(s1.length()); // show length
//        System.out.println(s1.charAt(3)); //show char on index
//        System.out.println(s1.indexOf('t')); //show index where this char position\
//
//        System.out.println("enter text");
//        Scanner tt =  new Scanner(System.in);
//        String t2 = "";
//        String t3 = "";

//
//        midle: while (t2.length()<1){
//            System.out.println("Please enter text");
//            t2 = tt.nextLine().trim();
//
//                while (t2.length()>0 && t3.length()<1){
//                    System.out.println("Please enter text again");
//                    t3 = tt.nextLine().trim();
//                }
//
//
//        }

//
//        String t4 = t2.concat(t3);
//        System.out.println(t4);

    }
}
