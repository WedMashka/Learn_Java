package _19VarargForea;

public class Test19 {
    public static void main(String[] args) {

        Test19 s = new Test19();
        s. summArgs("Summa",2,76,1,6,51,66,52,3,5,24,5);

    }
    void summArgs(String t,double ...a){
        double summm = 0;

        for (double a1: a) {
            summm += a1;
        }
        System.out.println(t + " "+summm);
    }
}
