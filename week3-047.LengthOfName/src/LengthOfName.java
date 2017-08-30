
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Number of characters " + calculateCharacters(name));
    }
    
    public static int calculateCharacters(String text){
        return text.length();
    }
    
}
