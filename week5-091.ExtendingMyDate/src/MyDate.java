
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        this.day++;
        if (this.day == 31){
            this.month++;
            this.day = 1;
            if (this.month == 13){
                this.year++;
                this.month = 1;
            }
        }
    }
    
    public void advance(int numberOfDays){
        int i = 0;
        while (i < numberOfDays){
            this.advance();
            i++;
        }
    }
    
    public MyDate afterNumberOfDays(int days){
        
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        newMyDate.advance(days);
        return newMyDate;
    }
    
    public int differenceInYears(MyDate comparedDate){
        int diff = 0;
        if (comparedDate.earlier(this)){
            diff = this.year - comparedDate.year;
        }
        return diff;
    }

}