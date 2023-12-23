package _12Flow_Control;

public class Test_If {
    public static void main(String[] args) {
        int a = 11;
        if(a<20){
            System.out.println("a<20 " + "a" + " = " + a);
        }
        else {
            System.out.println("a>20 " + "a" + " = " + a);

        }

        Car toyota = new Car("V6", "Toyota");
        Car raw = new Car("V6", "Toyota");
        Car bmw = new Car("V6", "BMW");

        boolean z = toyota.equals(bmw);
        System.out.println(z);

        Car2 toyota2 = new Car2("V6", "Toyota");
        Car2 raw2 = new Car2("V6", "Toyota");
        Car2 bmw2 = new Car2("V6", "BMW");

        boolean z2 = toyota2.equals(toyota);
        System.out.println(z2);

    }
}

class Car{
    String engine;
    String brand;

    Car(String engine, String brand){
        this.brand = brand;
        this.engine = engine;
    }
    public boolean equals (Car a){
        if(this.engine == a.engine && this.brand == a.brand){
            return true;
        }
        else {
            return false;
        }
    }
}

class Car2{
    String engine;
    String brand;

    Car2(String engine, String brand){
        this.brand = brand;
        this.engine = engine;
    }

}
