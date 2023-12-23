package _10_import;
import _10_1.B1; // импортирует один класс из пакета
// import _10_1.*; // импортирует все классы из пакета

import static  _10_1.B1.i;
public class A1 {

   static int i2 = i;
    public static void main(String[] args) {
        B1 bb = new B1(9);
        ii();
    }
    static void ii(){
        System.out.println(i2);
    }
}


