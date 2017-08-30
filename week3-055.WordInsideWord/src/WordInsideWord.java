
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String first = reader.nextLine();
        System.out.print("Type the second word: ");
        String second = reader.nextLine();
        
        if (first.indexOf(second) != -1){
            System.out.println("The word '" + second + "' is found in the word '" + first + "'.");
        } else {
            System.out.println("The word '" + second + "' is not found in the word '" + first + "'.");
        }
    }
}
