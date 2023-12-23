package _6HomeWork;

public class Car {

    Car(String brand_, String model_, String color_, short dateOfManufacture_, short power_){
        brand = brand_;
        model = model_;
        color = color_;
        dateOfManufacture =dateOfManufacture_;
        power = power_;
        System.out.println(brand + " " + model + " " + dateOfManufacture);
    }

    Car(String brand_2, String model_2, short dateOfManufacture_2){
        this(brand_2, model_2, null, dateOfManufacture_2, (short) 0);
    }
    Car(String brand_3, short dateOfManufacture_3){
        this(brand_3, null, null, dateOfManufacture_3, (short) 0);
    }


    String brand;
    String model;
    String color;
    short dateOfManufacture;
    short power;

}
class Cars{
    public static void main(String[] args) {
        Car jonah = new Car("chevrolet", "lanos", "cherry", (short) 2006, (short) 83);
        Car pasha = new Car("Vas", "Westa", (short) 2019);
        Car lesha = new Car("Vas", (short) 2005);

    }
}


