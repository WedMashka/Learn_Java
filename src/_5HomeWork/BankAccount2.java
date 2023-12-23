package _5HomeWork;
public class BankAccount2 {
    String name;
    double balance;

    BankAccount2(){
    }

    void bancInfo(){
        System.out.println(name +  " Balance " + balance);
    }
    double reful(double replenishment){
        balance += replenishment;
        bancInfo();
        return  balance;
    }

    double cachWithdraval(double withdrawal){
        balance -= withdrawal;
        bancInfo();
        return balance;
    }

}
