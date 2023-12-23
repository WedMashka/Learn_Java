package _13Switch;

public class Test1 {
}

class Student{

    int grade;

    Student(int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(4);

        if(st1.grade == 2){
            System.out.println("Bad Student");
        } else if (st1.grade == 3) {
            System.out.println("midle Student");
        } else if (st1.grade == 4) {
            System.out.println("good Student");
        } else if (st1.grade == 5) {
            System.out.println("super Student");
        } else {
            System.out.println("garde is wrong");
        }

        switch (st1.grade){
            case 2: System.out.println("Bad Student"); break;
            case 3: System.out.println("midle Student"); break;
            case 4: System.out.println("good Student"); break;
            case 5: System.out.println("super Student"); break;
            default: System.out.println("garde is wrong");

        }

    }
}