package _4ClassAndObject;

public class Students {
    public static void main(String[] args) {
        Student jonah = new Student();
        jonah.yearLearning = 2012;
        jonah.firstName = "Jonah";
        jonah.lastName = "smith";
        jonah.studentId = 154587;
        jonah.averageScoreInMathematics = 9;
        jonah.averageScoreInEconomy = 7;
        jonah.averageScoreInEnglish = 4;
        System.out.println(jonah.firstName + " " + "mathematics - " + jonah.averageScoreInMathematics);
        System.out.println("Economy - " + jonah.averageScoreInEconomy);
        System.out.println("English - " + jonah.averageScoreInEnglish);
        System.out.println( "check " +( jonah.averageScoreInMathematics + jonah.averageScoreInEconomy));

    }
}
