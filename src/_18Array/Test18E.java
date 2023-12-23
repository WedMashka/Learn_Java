package _18Array;

import java.util.Arrays;

public class Test18E {
    public static void main(String[] args) {
        int[] ar = {5,6,8,1,9};
        for (int i = 0;i< ar.length;i++){
            System.out.print(ar[i] +" ");
        }
        System.out.println("");
        for (int s:ar) {
            System.out.print(s + " ");
        }
        System.out.println("");

        Arrays.sort(ar);
        for (int s:ar) {
            System.out.print(s + " ");
        }
        System.out.println("");

        int ind = Arrays.binarySearch(ar, 9);
        System.out.println(ind);

        int[] h ={4,8,7,96,1,2,1,656};
        Arrays.sort(h);
        for (int f: h) {
            System.out.print(f + ", ");
        }
        System.out.println("");
        System.out.println(Arrays.binarySearch(h,5));
    }
}
