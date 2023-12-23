package _5;

public class Car {
    String brand;
    String model;
    int speed;

    int gaz (int accseleration){
        speed += accseleration;
        desc();
        return speed;
    }

    int brake (int br){
        speed -= br;
        desc();
        return speed;
    }

    void desc(){
        System.out.println(brand + " " + model + " " + "Speed " + speed + " km/h");
    }

}

