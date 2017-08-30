
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        String numbers = "";
        for (int i = 0; i < array.length - 1; i++){
            numbers += array[i] + ", ";
        } for (int j = array.length - 1; j < array.length; j++ ){
            numbers += array[j];
        }
        System.out.println(numbers);
    }
   
}
