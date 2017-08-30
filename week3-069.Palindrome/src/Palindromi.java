import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        if (text.equals(reverse(text))){
            return true;
        }
        else return false;
    }
    
    public static String reverse(String text) {
        int wordPosition = text.length();
        String reverse = "";
        while ( wordPosition > 0 ){
            reverse += text.charAt(wordPosition-1);
            wordPosition--;
        }
        System.out.println(reverse);
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
