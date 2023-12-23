package _4ClassAndObject;

public class BankAccount {

    int id;
    String name;
    double balanc;
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount mashaAccount = new BankAccount();
        BankAccount ivanAccount = new BankAccount();
        myAccount.id = 1;
        myAccount.name = "Jonah";
        myAccount.balanc = 70000.46;

        mashaAccount.id = 2;
        mashaAccount.name = "Masha";
        mashaAccount.balanc = 7000.46;

        ivanAccount.id = 1;
        ivanAccount.name = "Ivan";
        ivanAccount.balanc = 0.46;

        System.out.println(mashaAccount.name);
        System.out.println(mashaAccount.balanc);
        System.out.println(mashaAccount.id);
    }
}

class BankAccountTest{
    public static void main(String[] args) {

    }
}