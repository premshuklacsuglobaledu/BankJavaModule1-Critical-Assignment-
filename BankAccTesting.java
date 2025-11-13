public class BankAccountTest {
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount(0.02); 

        account1.setFirstName("Luke");
        account1.setLastName("Skywalker");
        account1.setAccountID(1001);

        account1.deposit(500);
        account1.processWithdrawal(200); 
        account1.processWithdrawal(400); 

        account1.displayAccount();
    }
}
