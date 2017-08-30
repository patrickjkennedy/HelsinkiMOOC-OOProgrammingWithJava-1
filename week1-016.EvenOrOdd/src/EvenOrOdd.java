
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        if ( n % 2 == 0 ){
            System.out.println("Number " + n + " is even.");
        } else {
            System.out.println("Number " + n + " is odd.");
        }

    }
}
