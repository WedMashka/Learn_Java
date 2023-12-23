package _8Final_Static;

public class Final {

    int a = 15;
   final int x = 19; //final ГОВОРИТ О ТОМ ЧТО ПЕРЕМЕКННУЮ НЕЛЬЗЯ ИЗМЕНИТЬ

    void apc(int a){
        int b = 15;
        System.out.println(a+b);
    }
}

class Test{
    public static void main(String[] args) {
        final Final z = new Final();
        z.a = 17;

       int c  = z.x * 2;

        System.out.println(z.a);

        System.out.println(c);

        z.apc(4);
    }
}