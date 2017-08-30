import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BoundedCounter seconds = new BoundedCounter(60);
        BoundedCounter minutes = new BoundedCounter(60);
        BoundedCounter hours = new BoundedCounter(24);
        
        System.out.print("seconds: ");
        int s = 50;
        System.out.print("minutes: ");
        int m = 59;
        System.out.print("hours: ");
        int h = 23;

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        
        int i = 0;
        while (i < 5000){
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();
                if (seconds.getValue() == 60){
                    minutes.next();
                    seconds.setValue(0);
                    if (minutes.getValue() == 60){
                        hours.next();
                        minutes.setValue(0);
                } if (hours.getValue() == 24){
                    hours.setValue(0);
                }
            }
            i++;
        }
    }
}
