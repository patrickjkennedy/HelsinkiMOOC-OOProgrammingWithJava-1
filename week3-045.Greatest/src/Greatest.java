
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int max12 = Math.max(number1, number2);
        return Math.max(number3, max12);
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}