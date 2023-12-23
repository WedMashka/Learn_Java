package _5;

public class Car2 {

    String brand;
    String model;

    int speed;

    Car2(String b, String m, int s ){
        brand =b;
        model =m;
        speed =s;
    }
    void carIfo(){
        System.out.println(brand + " " + model +" " + " Speed: " + speed);
    }

    int acceleration( int acc){
        speed += acc;
        carIfo();
        return speed;
    }

    int brake(int br){
        speed -= br;
        carIfo();
        return speed;
    }


    public static class Tagaz2 {
        public static void main(String[] args) {
            Car2 tiger = new Car2("Tagaz", "Tiger", 60);
            tiger.acceleration(50);
        }
    }
}
