package _8Final_Static;

public class Static {

    String name;
    int course;
   static int count = 0;

    Static(String name_, int course_){
        name = name_;
        course =course_;
        count++;

        System.out.println("Student № -" + count);
    }
}

class Student{
    public static void main(String[] args) {
        Static p = new Static("Jonah", 4);
        Static p2 = new Static("Jonah2", 4);
        Static p3 = new Static("Jonah3", 4);
        Static p4 = new Static("Jonah4", 4);
    }

}
