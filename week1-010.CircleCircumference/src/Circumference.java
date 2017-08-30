
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.print("Type the radius: ");
        int r = Integer.parseInt(reader.nextLine());
        double result = 2*Math.PI*r;
        System.out.print("Circumference of the circle: " + result);
    }
}
