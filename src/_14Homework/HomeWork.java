package _14Homework;

public class HomeWork {
    static void  getCloock(){
        clock:
        for(int h = 0; h<=6; h++){
            for (int m = 0; m<=59; m++ ){
                for (int s = 0; s<=59; s++){
                    System.out.println(h +" : " + m + " : " + s);
                    if(h==6){
                        break clock;
                    }
                }
            }
        }

    }
    static  void  getModifClock(){
        clock2:
        for (int h =0; h<=6; h++){
            miuts:
            for (int m = 0; m<60; m++){
                for (int s = 0; s<60; s++){
                    if(h*s>m){
                        continue miuts;
                    }
                    System.out.println(h +" : " + m + " : " + s);
                    if(h>1 && m%10 ==0 && m !=0) {
                        System.out.println("hours > 1 and min/10 is 0");
                        break clock2;
                    };

                }
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
       // HomeWork.getCloock();
        HomeWork.getModifClock();
    }
}
