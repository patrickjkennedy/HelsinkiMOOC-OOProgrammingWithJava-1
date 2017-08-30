
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // write testcode here
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
            
           
        }
    
    public static int[] copy(int[] array){
        
        int [] copy = new int[array.length];
        for (int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
        return copy;
        }
    
    public static int[] reverseCopy(int[] array){
        
        int [] reverseCopy = new int[array.length];
        
            for (int i = 0; i < array.length; i++){
                reverseCopy[i] = array[array.length - 1 - i];
            }
           
        return reverseCopy;
        
    }
    
    }
    

