
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Student> listOfStudents = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        
        
        while(true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if(name.isEmpty()){
                break;
            } else {
                System.out.print("studentnumber: ");
                String studentNumber = reader.nextLine();
                listOfStudents.add( new Student(name, studentNumber));
            }
        }
        
        for (Student std: listOfStudents){
            System.out.println(std);
        }
        
        System.out.print("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");
        for (Student std: listOfStudents){
            if(std.getName().contains(term)){
                System.out.println(std);
            }
        }
    }
}