public class CheckingAccount extends BankAccount {
    private double interestRate;
    private final double OVERDRAFT_FEE = 30.0;

    public CheckingAccount(double interestRate) {
        super(); 
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("Something wrong, try again, withdrawal amount.");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            balance -= (amount + OVERDRAFT_FEE);
            System.out.println("Overdraft warning, More then balance withdrew.");
            System.out.println("It cost $30 to overdraft, fee has been applied.");
        }
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
