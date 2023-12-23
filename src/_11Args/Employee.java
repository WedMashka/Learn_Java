package _11Args;

public class Employee {
    public String name;
    public double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double inc(double a){
        a = a*2;
        return a;
    }

    public double doublSalary(){
        this.salary = this.salary * 2;
        System.out.println(this.salary);
        return  this.salary;

    }
    public double doublSalary(double x){
        this.salary = this.salary * x;
        System.out.println(this.salary);
        return  this.salary;

    }

}


class Student{
    String name;
    byte course;

    int grade;

    Student(String name, byte course, int grade ){

        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public void swapS( Student a, Student b){
        System.out.println(" было " + a.name);
        System.out.println( "было " +b.name);

        Student x = a;

        a = b;
        b = x;

        System.out.println( "стало " +a.name);
        System.out.println( "ствло " +b.name);

    }



}



class EmployeeTest{
    public static void main(String[] args) {
        Employee it = new Employee("Jonah", 45000.50);
        var a = it.inc(it.salary);
        System.out.println(a);
        it.doublSalary();
        it.doublSalary(10);
        Student i = new Student("Jona", (byte) 2, 7);
        Student p = new Student("Pasha", (byte) 4, 8);
        i.swapS(i, p);


    }
}
