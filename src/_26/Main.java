package _26;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car  bmw = new Car("red","V6");
        Car  bmw2 = new Car("red","V6");
        Car  audi = new Car("blue","V8");
        Car  toyota = new Car("black","V4");
        Car  aud2 = new Car("blue","V8");

        System.out.println(bmw.equals(bmw2));
        System.out.println(bmw == bmw2);
        ArrayList<Car> l = new ArrayList<>();


        l.add(bmw);
        l.add(bmw2);
        l.add(audi);
        l.add(toyota);

        System.out.println(l.contains(aud2));

    }
}

class Car{
    String color;
    String engine;
    public Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    public boolean equals(Object obj){
        if(obj instanceof Car){
            Car c = (Car)obj;
            return (color.equals(c.color) && engine.equals(c.engine));
        }else {
            return false;
        }
    }
}