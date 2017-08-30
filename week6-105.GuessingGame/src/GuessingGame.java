import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);

    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int avg = 0;
        while (lowerLimit != upperLimit){
            System.out.println(lowerLimit + " " + upperLimit + " " + avg);
            avg = average(lowerLimit, upperLimit);
            boolean numberIsGreaterThanAverage = isGreaterThan(avg);
            if(numberIsGreaterThanAverage == true){
                lowerLimit = avg + 1;
            } else if(numberIsGreaterThanAverage == false){
                upperLimit = avg;
            }
        }
        int result = upperLimit;
        System.out.println("The number you're thinking of is " + result);
    }


    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    
    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than " + value + "?");
        String input = reader.nextLine();
        return input.equals("y");     
    }
    
    public int average(int firstNumber, int secondNumber){
        return (firstNumber + secondNumber)/2;
    }
    
}
