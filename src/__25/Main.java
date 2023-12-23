package __25;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Teacher();
        Employee e2 = new Driver();
        Employee e3 = new Doctor();
//        e1.work();
//        e2.work();
//        e3.work();
//        e3.help();

//        Employee[] ar = {e1,e2,e3};
//
//        for (Employee k:ar) {
//            k.work();
//        }
//        System.out.println(e2 instanceof Employee);

//        Employee[] ar = {e1,e2,e3,e1,e2,e3,e1,e2,e3,e1,e2,e3};
//        ((Doctor)e3).help(); // кастинг
//        int i = 0;
//        int kl = 0;
//        for (Employee k: ar) {
//            if(k instanceof Driver){
//                System.out.println(((Driver)k).car);
//                System.out.println(i);
//                kl++;
//            }
//            i++;
//        }
//        System.out.println(kl);



    }
}

abstract class Employee {
    void  sleep(){
        System.out.println("Emloyee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee{

    void work() {
        System.out.println("Teacher is teach");
    }
}
class Driver extends Employee{
    StringBuilder car = new StringBuilder("BMW");
    void work() {
        System.out.println("Driver is teach");
    }
}
class Doctor extends Employee implements HelpAble{

    void work() {
        System.out.println("Doctor is teach");
    }


    public void help() {
        System.out.println("Doctor is helping");
    }
}

interface HelpAble{
    void help();
}

