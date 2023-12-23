package _5HomeWork;

public class Human {
    String name;
    BankAccount2 bank;

    Student2 student;

    Human(String name_, double balance_, byte math_, byte econ_, byte engl_ ){
        bank = new BankAccount2();
        student = new Student2();
        name = bank.name = student.name = name_;
        bank.balance = balance_;
        student.mathAverage = math_;
        student.economicAverage = econ_;
        student.englishAverage =engl_;
    }

    void humanInfo(){
        System.out.println(name + " Balance " + bank.balance + " RUB "+ " Average Rating " + student.averageRating());
    }

}
