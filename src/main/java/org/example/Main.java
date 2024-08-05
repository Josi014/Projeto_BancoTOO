package org.example;

import com.bank.model.Account;
import com.bank.model.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        //Polimorfismo --> Poli = muitos; morfismo = forma / variáveis de mesmo tipo se comportando de diferentes formas

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance() + "\n" + y.getBalance());
    }
}