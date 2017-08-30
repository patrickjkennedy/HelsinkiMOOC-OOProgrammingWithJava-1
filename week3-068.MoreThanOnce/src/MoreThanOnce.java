import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {

    public static boolean moreThanOnce(ArrayList<Integer> list, int searched) {
        
        int check = 0;
        for (int i: list){
            if (i == searched){
                check++;
            }
        }
        
        if (check > 1){
            return true;
        }
        
        else return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(7);
        list.add(9);
        list.add(-1);
        list.add(13);
        list.add(8);
        list.add(-1);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }
    }
}