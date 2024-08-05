package com.bank.model;

public class SavingsAccount extends Account {
//    Final - esta classe SavingsAccount não pode ser herdada por outra

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }
    //Final - método não poderá ser sobreposto
}
