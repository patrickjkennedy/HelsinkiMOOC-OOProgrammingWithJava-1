
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        
        System.out.print("Type a number: ");
        float number1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        float number2 = Integer.parseInt(reader.nextLine());
        float result = number1/number2;
        
        System.out.print("Division: " + number1 + " / " + number2 + " = " + result);
    }
}
