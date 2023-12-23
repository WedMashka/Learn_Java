package _19VarargForea;

public class Test19ForEach {
    private static  void student(String[] ...s){
        for (String n: s[0]) {
            for (String p:s[1]) {
                System.out.println(n + " " + p +" Good");
            }
        }
    }

    private static void  num(int[]...a){
        for (int[] t:a) {
            for (int b:t) {
                System.out.print(b + " ");
            }

        }
    }

    private static void revers1 (int ...x){
        int[] dubl = new int[x.length];
        for (int i =0; i<x.length; i++){
            if(i>=0){
                dubl[i]=x[x.length - i -1];
            }
        }
        for (int l =0; l<dubl.length; l++){
            x[l]= dubl[l];
        }
    }
    public static void main(String[] args) {
        int[] a = {1,1,2,3,5,8,13};

        for (int s: a) {
            System.out.print(s + " ");

        }
        System.out.println("");

        for (int s =0; s<a.length; s++){
            System.out.print(a[s] +" ");
        }
        System.out.println("");

        student(new String[]{"Smith","Ivanov","Mohova" }, new String[]{"Mathematics", "Filofofy"});

        int[][] x = {{1,3,5},{2,4},{6,7,8,9}};
        num(x);

        System.out.println(" ");
        int[] aa = {1,2,3,4,5,6,7,8,9};
        System.out.println(" ");
        for (int u:aa) {
            System.out.print(u + " ");

        }
        System.out.println(" ");

        revers1(aa);

        for (int u:aa) {
            System.out.print(u + " ");

        }
        System.out.println(" ");



    }
}
