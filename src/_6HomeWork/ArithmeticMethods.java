package _6HomeWork;

public class ArithmeticMethods {
    void sum(){
        double s = 0.0;
        System.out.println(s);
    }
    void sum(double z) {
        double s = (double) z;
        System.out.println(s);
    }

    void sum(double z,double x){
            double s =  z + x;
            System.out.println(s);
    }
    void sum(double z,double x, double c){
            double s = z+x+c;
            System.out.println(s);
    }
    void sum(double z,double x, double c, double v){
        double s = z+x+c+v;
        System.out.println(s);
    }
    void sum(double z,double x, double c, double v, double b){
        double s = z+x+c+v+b;
        System.out.println(s);
    }

}

class Tsest{
    public static void main(String[] args) {
        ArithmeticMethods g = new ArithmeticMethods();
        g.sum(2,5,9.2,4);
    }
}
