package _9_Area_of_Visibility;

public class Test {

    int a =1;
    static  int b =2;

    static void abc(final int a){
        System.out.println(a);
        //System.out.println(this.a);
        System.out.println(b);
        System.out.println(Test.b);
    }

    public static void main(String[] args) {
        Test as = new Test();
        as.abc(4);
    }

}
