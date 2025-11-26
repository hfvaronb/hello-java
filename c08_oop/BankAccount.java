package c08_oop;

public class BankAccount {

    // Atributos
    double balance = 0;


    // Métodos
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Su saldo es: " + balance);
    }

}
