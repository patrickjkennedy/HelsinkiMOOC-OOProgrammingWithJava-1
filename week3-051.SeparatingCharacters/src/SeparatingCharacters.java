
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int length = name.length();
        int counter = 1;
        
        while (counter < length+1){
            System.out.println(counter + ". character: " + name.charAt(counter-1));
            counter++;
        }
    }
}
