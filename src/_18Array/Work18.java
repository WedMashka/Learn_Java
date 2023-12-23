package _18Array;

public class Work18 {
    int[] ars;
    Work18(int arr[]){
        this.ars = arr;
    }
    public void showMinMax(int ar[]){
        int max = 0;
        int min = 0;
        for (int i: ar ) {
            if(i>max){
                max = i;
            } else if (i<min) {
                min = i;
            }
        }

        System.out.println(("min = " +min)+ ", " +( "max = " + max));
    }

}

  class T18{
    public static void main(String[] args) {
        int[] jj ={1,8,9,2,4,51,4,-8,4,1,5,-7,-1,54};
        Work18 test = new Work18(jj);
        test.showMinMax(jj);
    }
}
