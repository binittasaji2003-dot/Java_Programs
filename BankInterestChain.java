class account3{
    protected double balance;
    protected final double MIN_BALANCE = 1000;

    account3(double balance){
        this.balance = balance;
    }

    public double calculateInterest(){
        return balance * 0.04;

    }

}

class savingsAccount extends account3{
    savingsAccount(double balance){
        super(balance);
    }

    @Override
    public double calculateInterest(){
        return balance * 0.06;

    }

}

class fixedDepositAccount extends savingsAccount{
    private double bonus;
    fixedDepositAccount(double balance, double bonus){
        super(balance);
        this.bonus = bonus;
    }

    @Override
    public double calculateInterest(){
        return super.calculateInterest() + bonus;

    }
}

public class BankInterestChain {
    public static void main(String[] args){
        fixedDepositAccount fd = new fixedDepositAccount(20000, 1000);

        System.out.println("Min balance: " + fd.MIN_BALANCE);
        System.out.println("Balance: " + fd.balance);
        System.out.println("Interest: " + fd.calculateInterest());



    }
}
