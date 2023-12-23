package _5HomeWork;

public class Jonah {
    public static void main(String[] args) {
        Human jonah = new Human("Jonah", (double) 55258.20, (byte) 9, (byte) 6, (byte)4);
        jonah.humanInfo();
        jonah.bank.cachWithdraval(30000);
        jonah.humanInfo();
    }
}
