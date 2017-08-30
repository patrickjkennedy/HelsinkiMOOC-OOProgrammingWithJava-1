
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int wordPosition = text.length();
        String reverse = "";
        while ( wordPosition > 0 ){
            reverse += text.charAt(wordPosition-1);
            wordPosition--;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
