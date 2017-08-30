
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate){
        int diff = 0;
        int comparedDateTotalDays = (comparedDate.year * 365) + (comparedDate.month * 12) + comparedDate.day;
        int thisTotalDays = (this.year * 365) + (this.month * 12) + this.day;
        
        diff = Math.abs(thisTotalDays - comparedDateTotalDays);
        diff /= 365;
        
        return diff;
    }
    
    public int differenceInDays(MyDate comparedDate){
        int diff = 0;
        int comparedDateTotalDays = (comparedDate.year * 365) + (comparedDate.month * 12) + comparedDate.day;
        int thisTotalDays = (this.year * 365) + (this.month * 12) + this.day;
        
        diff = Math.abs(thisTotalDays - comparedDateTotalDays);
        
        return diff;
    }

  
}