
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
        
        
    }

    public static int smallest(int[] array) {
    int smallest = array[0];
    for (int i = 0; i < array.length; i++){
        if (smallest > array[i]){
            smallest = array[i];
        }
    }
    return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){
    int smallest = array[0];
    int smallestIndex = 0;
    for (int i = 0; i < array.length; i++){
        if (smallest > array[i]){
            smallest = array[i];
            smallestIndex = i;
        }
    }
    return smallestIndex;       
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    int smallest = array[index];
    int smallestIndex = index;
    for (int i = index; i < array.length; i++){
        if (smallest > array[i]){
            smallest = array[i];
            smallestIndex = i;
        }
    }
    return smallestIndex;   
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int placeholder = array[index1];
        array[index1] = array[index2];
        array[index2] = placeholder;
        
    }
    
    public static void sort(int[] array) {
        
        System.out.println( Arrays.toString(array) );
        
        for (int i=0; i<array.length; i++){
            swap(array,indexOfTheSmallestStartingFrom(array, i), i);
            System.out.println( Arrays.toString(array) );
        }

    }

    
}
