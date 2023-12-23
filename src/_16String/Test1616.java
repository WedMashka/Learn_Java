package _16String;

public class Test1616 {
    public static void main(String[] args) {
        String a = new String("new");
        String a2 = new String("new");
        Boolean b1 = a == a2;
        Boolean b2 = a.equals(a2);
        System.out.println(b1);
        System.out.println(b2);

        String a3 = new String("New");
        String a4 = new String("new");
        Boolean b3 = a3 == a4;
        Boolean b4 = a3.equals(a4);
        Boolean b5 = a3.equalsIgnoreCase(a4);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

    }
}
