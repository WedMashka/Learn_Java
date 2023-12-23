package _6This;

public class Employee {

//    Employee(short id_, String name_, byte age_){
//        id = id_;
//        name = name_;
//        age = age_;
//    }
//
//    Employee(short id_, String name_, byte age_, double salary_, String departments_){
//        id = id_;
//        name = name_;
//        age = age_;
//        salary = salary_;
//        departments = departments_;
//    }
//
//    Employee(String name_, byte age_){
//        name = name_;
//        age = age_;
//    }





    // Тоже самое что и выше только более коротким способом
//
//    Employee(String name_, byte age_){
//        name = name_;
//        age = age_;
//    }
//
//    Employee(short id_2, String name_2, byte age_2){
//        this(name_2, age_2);
//        id = id_2;
//    }
//
//    Employee(short id_3, String name_3, byte age_3, double salary_3, String departments_3){
//        this( id_3,  name_3, age_3);
//        salary = salary_3;
//        departments = departments_3;
//    }





    // Тоже самое что и выше только более коротким способом

        Employee(short id_, String name_, byte age_, double salary_, String departments_){
        id = id_;
        name = name_;
        age = age_;
        salary = salary_;
        departments = departments_;
        }
    Employee(short id_2, String name_2, byte age_2){
           this(id_2, name_2, age_2, 0.0, null) ;
    }

    Employee( String name_3, byte age_3){
            this((short) 0,name_3, age_3, 0.0, null);
    }



    short id;
    String name;
    byte age;
    double salary;
    String departments;

}

class Test{
    public static void main(String[] args) {
        Employee jonah = new Employee("Jona", (byte) 32);
        Employee mariya = new Employee((short) 95,"Mariya", (byte)34,(double) 40000, "Sale" );
        System.out.println(jonah);
    }
}