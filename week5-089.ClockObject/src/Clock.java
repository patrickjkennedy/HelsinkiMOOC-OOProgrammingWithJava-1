public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        
        this.seconds = new BoundedCounter(60);
        this.minutes = new BoundedCounter(60);
        this.hours = new BoundedCounter(24);
        
        seconds.setValue(secondsAtBeginning);
        minutes.setValue(minutesAtBeginning);
        hours.setValue(hoursAtBeginning);
        
    }
    
    public void tick() {
        // Clock advances by one second
               
            this.seconds.next();
            if (this.seconds.getValue() == 60){
                this.minutes.next();
                this.seconds.setValue(0);
                if (this.minutes.getValue() == 60){
                    this.hours.next();
                    this.minutes.setValue(0);
                } if (this.hours.getValue() == 24){
                    this.hours.setValue(0);
                }
            }
    }
    
    public String toString() {
        // returns the string representation
        return this.hours.toString() + ":" + this.minutes.toString() + ":" + this.seconds.toString();
    }
}
