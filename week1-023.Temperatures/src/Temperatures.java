
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        
        while(true){
            System.out.print("Please input a floating-point number: ");
            double number = Double.parseDouble(reader.nextLine());
            if (number >= -30 && number <= 40){
                Graph.addNumber(number);
            } else{
                continue;
            }
        }

        // Graph is used as follows:
        //Graph.addNumber(7);
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}