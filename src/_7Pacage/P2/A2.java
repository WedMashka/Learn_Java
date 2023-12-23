package _7Pacage.P2;

public class A2 {

    public A2(double salary_){
        salary = salary_;
    }
   public double salary;

    public void x2(){                     //ВИДЕН ВЕЗДЕ
        System.out.println("New salary - " + (salary * 2));
    }

    private void x3(){                //ВИДЕН ТОЛЬКО ВНУТРИ КЛАССА
        System.out.println("Super salary - " + (salary * 3));
    }
    void x4(){                   //дЕФОЛТНЕЫЙ ВИДЕН ТОЛЬКО ВНУТРИ ПАКЕТА
        System.out.println("Super salary - " + (salary * 4));
    }

    protected void x5(){    //ВИДЕН ВО ВСЕМ ПАКЕТЕ КЛАССА  + В КЛАССАХ ДРУГИХ ПАКЕТОВ, КОТОРЫЕ ЯВЛЯЕЮТСЯ  ДЕТЬМИ
        System.out.println("Super salary - " + (salary * 5));
    }

    public static void main(String[] args) {
        A2 person = new A2(25000);
        person.x2();
        person.x3();
    }
}

