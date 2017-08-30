import java.util.*;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        int highest = list.get(0);
        
        for (int s = 1; s < list.size(); s++){
            int curValue = list.get(s);
            if (curValue > highest){
                highest = curValue;
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}