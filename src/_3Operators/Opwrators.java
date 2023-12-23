package _3Operators;

public class Opwrators {
    public static void main(String[] args){

        //АРИФМЕТИЧЕСКИЕ ОПЕРАТОРЫ
//
//        int a = 9, b =2, c = a + b, d = a -b, e = a * b;
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(c);
//
//
//        int a1 = 10;
//        int b1 = 3;
//        int c1 = a1/b1;
//        System.out.println("Дробная чать отсекается по этому 10/3=" + c1);
//
//        int a2 = 10;
//        int b2 =3;
//        double c2 = a2 /b2;
//
//        System.out.println("При делении инт на инт получается все равно инт по этому 10/3=" + c2);
//
//        double a3 = 10;
//        int b3 =3;
//        double c3 = a3 /b3;
//
//        System.out.println("дабл на инт и double c3 = a3 /b3; по этому 10/3=" + c3);
//
//        int a4 = 10;
//        double b4 =3;
//        double c4 = a4 /b4;
//
//        System.out.println("инт на дабл и double c4 = a4 /b4; по этому 10/3=" + c4);
//
//        double a5 = 10;
//        double b5 =3;
//        double c5 = a5 /b5;
//
//        System.out.println("даблы все по этому 10/3=" + c5);
//
//        double a6 = 10;
//        double b6 =3;
//        int c6 = (int) ((int)a6 /b6);
//
//        System.out.println("дабл на дабл и int c6 = (int) ((int)a6 /b6); по этому 10/3=" + c6);
//
//        int a7 = 10;
//        int b7 =3;
//        double c7 =(double) a7 /b7;
//
//        System.out.println("инт на инт и double c7 =(double) a7 /b7; 10/3=" + c7);
//
//        int a9 = 10;
//        int b9 = 3;
//        int c9 = a9 % b9;
//
//        System.out.println(c9);
//
//        int m1 = 5;
//        System.out.println(++m1);
//        System.out.println(m1);
//        System.out.println(m1++);
//        System.out.println(m1);
//
//        //ОПЕРАТОРЫ ПРИРАВНИВАНИЯ
//
//        int h1 =5;
//        System.out.println(h1+=3);
//        System.out.println(h1-=4);
//        System.out.println(h1*=3);
//        System.out.println(h1/=3);
//
//
//
//        //операторы сравнения
//
//        int g1 = 9;
//        int g2 = 7;
//        System.out.println( g1 < g2);
//        System.out.println( g1 > g2);
//        System.out.println( g1 == g2);
//        System.out.println( g1 <= g2);
//        System.out.println( g1 >= g2);
//        System.out.println( g1 != g2);


        //ЛОГИЧЕСКИЕ ОПЕРАТОРЫ

        //and  &&  a && d  вернет фолс при первом фолс и не будет продолжать проверку
        //or   ||  a || b  вернет тру пр первом тру и не будет продолжать проверку
        // отрицание  !  a = !d
        //and &  a & b  верет фолс при первом фолс но проверку выполнит доконца и работает с числами БИТВАЙСО ПЕРАТОР
        // or |  a | b  вернет фолс при первом фолс но проверку выполнит доконца и работает с числами БИТВАЙС ОПЕРАТОР
        // OR ^   a ^ b ^ c ^ d ветрнет тру тогда когда только одид из операндов тру. БИТВАЙ ЭКСКЛЮЗИВ ОР

//        int l1 = 5;
//        int l2 = 6;
//        int l3 = 7;
//        int l4 = 8;
//        boolean l5;
//        boolean l6;
//        boolean l7;
//        boolean l8;
//        int l9;
//        l5 = l1 > l2 && ++l3 < l4; //инкремет не будет т.к. фолс и оператор прекратит обработку выражения
//        l6 = l1 < l2 || ++l3 < l4; //инкремет не будет т.к. тру и оператор прекратит обработку выражения
//        l7 = l1 > l2 & ++l3 < l4;  //инкремет будет т.к. оператор бинарный и он продолжит выполнять выражение
//        l8 = l1 < l2 | ++l3 < l4;  //инкремет будет т.к. оператор бинарный и он продолжит выполнять выражение
//        l9 = l2 & l1; // выполнит бинарное сложение
//
//        System.out.println(l5);
//        System.out.println(l6);
//        System.out.println(l7);
//        System.out.println(l8);
//        System.out.println(l9);

//            char k = 'u';
//            int s = k;
//        System.out.println(k);
//        System.out.println(s);
//
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0.0;
        result = i2/d1 +d2 % i1 -l; // 2 + 1,3 -20 = -16,7

        System.out.println(result); // 16,7

        int a = 5; //4 3 4 5
        int a1 = a-- - --a + ++a + a++ + a;// 5 - 3 + 4 + 4 +5
        System.out.println(a1); // 15


        int b = 8; //9 10 11 10

        int b1 = ++b - b++ + ++b - --b;// 9 -9  11 -10
        System.out.println(b1);// 1








    }
}
