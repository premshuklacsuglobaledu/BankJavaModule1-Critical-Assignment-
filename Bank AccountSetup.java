public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    protected double balance;


    public BankAccount() {
        this.balance = 0.0;
    }

 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Something wrong, Try again, deposit amount.");
        }
    }


    public void withdrawal(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Something wrong with insert, try again, withdrawal amount.");
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void accountSummary() {
        System.out.println("Account ID: " + accountID);
        System.out.println("Account Holder: " + firstName + " " + lastName);
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
    }
}
