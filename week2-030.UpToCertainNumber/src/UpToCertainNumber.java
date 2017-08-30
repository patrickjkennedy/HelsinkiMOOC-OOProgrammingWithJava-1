
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Up to what number? ");
        int input = Integer.parseInt(reader.nextLine()); 
        int i = 1;
        
        while (i <= input){
            System.out.println(i);
            i++;
        }
        
        
    }
}
