package _15hwile;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter number ");
        int s = st.nextInt();
        while (s<10){
            System.out.println("You entered a number less than ten ");
            s++;
        }
    }
}
