package __25;

public class Test2 {
    public static void main(String[] args) {
        Test30 h = new Test30();
        System.out.println(((Test20)h).a);
        ((Test10)h).abc();
    }
}

class Test10{
    int a =5;
    void abc(){
        System.out.println("ok Test10");
    }
}

class Test20 extends Test10{
    int a =20;
    void abc(){
        System.out.println("ok Test20");
    }
}

class Test30 extends Test20{
    int a =30;
    void abc(){
        System.out.println("ok Test30");

    }
}