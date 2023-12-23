package _11Home_work;

public class Car {
    String color;
    String engine;

  public static   byte wheel;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

}

 class CarTest{
    public static void swapColor(Car a, Car b){
        String t;
        t = a.color;
        a.color = b.color;
        b.color = t;;
    }
    public static  void  valueWheel(byte x){
        Car.wheel = x;
    }

     public static void main(String[] args) {
         Car audi = new Car("purple", "v8");
         Car bmw = new Car("black", "v6");

         System.out.println(audi.color);
         System.out.println(bmw.color);

         swapColor(audi, bmw);

         System.out.println(audi.color);
         System.out.println(bmw.color);
         System.out.println(Car.wheel);
         valueWheel((byte) 6);
         System.out.println(Car.wheel);

     }
}

