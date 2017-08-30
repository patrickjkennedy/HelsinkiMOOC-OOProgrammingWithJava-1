
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account pkAccount = new Account("Patrick Kennedy", 100.0);
        pkAccount.deposit(20.0);
        System.out.println(pkAccount);
    }

}
