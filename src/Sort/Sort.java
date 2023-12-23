package Sort;
import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int[] example= {4,14,15,12,7,-1,1,8};
        show(sortirovka(example));


    }
    public static int[] sortirovka(int[]ar){
        int[]res = new int[ar.length];
        int min = ar[0];

        for (int r = 0;r<ar.length;r++){
            if(min>ar[r]){
                min = ar[r];
            }
        }

        for(int u=0;u<ar.length;u++){
            if(min == ar[u]){
                ar[u]=ar[0];
                ar[0]= min;
            }
        }

        for (int i =1;i< ar.length;i++){
            for (int k =1;k< ar.length;k++){
                if(ar[k-1]>ar[k]){
                    int o = ar[k];
                    ar[k]= ar[k-1];
                    ar[k-1] = o;
                }
            }
        }
        return ar;
    }
    public static void show(int[]p){
        for (int i=0;i<p.length;i++){
            System.out.print(p[i]+ ", ");
        }
        System.out.println();
    }
}
