
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int i = 0;
        int result = 0;
        
        while(i < n+1){
            result += Math.pow(2,i);
            i++;
        }
        System.out.println("The result is " + result);
    }
}
