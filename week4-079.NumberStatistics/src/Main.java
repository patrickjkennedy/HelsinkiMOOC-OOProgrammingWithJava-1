import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        NumberStatistics allNums = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        
        int n = Integer.parseInt(reader.nextLine());
        
        while (n != -1){
            
            allNums.addNumber(n);
            
            if (n % 2 == 0){
                even.addNumber(n);
            }
            
            else {
                odd.addNumber(n);
            }
            
            n = Integer.parseInt(reader.nextLine());
            
        }
        System.out.println("sum: " + allNums.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("Sum of odd: " + odd.sum());
    }
}
