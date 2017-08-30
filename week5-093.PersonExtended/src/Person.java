import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name){
        int currentDay = Calendar.getInstance().get(Calendar.DATE);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        
        this.name = name;
        this.birthday = new MyDate(currentDay, currentMonth, currentYear);
    }
    
      
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows:
        int currentDay = Calendar.getInstance().get(Calendar.DATE);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        
        MyDate today = new MyDate(currentDay, currentMonth, currentYear);
        
        int age = this.birthday.differenceInYears(today);

        
        return age;
    }
    
    public int ageInDays(){
        
        int currentDay = Calendar.getInstance().get(Calendar.DATE);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        
        MyDate today = new MyDate(currentDay, currentMonth, currentYear);
        
        int age = this.birthday.differenceInDays(today);
        
        return age;
        
    }
    
    public boolean olderThan(Person compared) {
        if (this.ageInDays()> compared.ageInDays()){
            return true;
        }
        else {
            return false;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
