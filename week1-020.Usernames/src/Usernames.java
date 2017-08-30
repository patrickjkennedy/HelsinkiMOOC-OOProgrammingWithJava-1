
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username: ");
        String username = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        
        String user1 = "alex";
        String pass1 = "mightyducks";
        
        String user2 = "emily";
        String pass2 = "cat";
        
        if ( username.equals(user1) && password.equals(pass1) ){
            System.out.println("You are now logged into the system!");
        } else if ( username.equals(user2) && password.equals(pass2) ){
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
        
    }
}
