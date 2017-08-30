import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            words.add(word);
            if (word.equals("")){
                break;
            }
        }
        
        System.out.println("You typed the following words: ");
        for (String word : words){
            System.out.println(word);
        }
    }
}
