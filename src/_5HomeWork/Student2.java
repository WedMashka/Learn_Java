package _5HomeWork;

public class Student2 {
    String name;
    byte mathAverage;
    byte economicAverage;
    byte englishAverage;

    double averageRate;


    Student2(){

    }

    double averageRating (){
        double averageRat = (double) (mathAverage + englishAverage + economicAverage) / 3;
        System.out.println("Average Rating : "  + averageRat);
        averageRate = averageRat;
        return  averageRate;
    }

}

