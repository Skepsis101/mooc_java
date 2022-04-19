
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

        Account kevinAccount = new Account("Kevin's account", 100.00);

        System.out.println("Initial balance");
        System.out.println(kevinAccount);

        kevinAccount.deposit(20);

        System.out.println("End state");
        System.out.println(kevinAccount);

    }
}
