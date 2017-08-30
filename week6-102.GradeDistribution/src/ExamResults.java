/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
import java.util.*;

public class ExamResults {
    private ArrayList<Integer> results = new ArrayList<Integer>();
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    private int accepted;
    
    public ExamResults(Scanner scanner){
        System.out.println("Type exam scores, -1 completes:");
        while(true){
            int result = Integer.parseInt(scanner.nextLine());
            if (result == -1){
                break;
            } else if (result >= 0 && result <= 60){
                this.results.add(result);
            } else {
                    continue;
                    }
        }
    } 
    
    public int grade(int result){
        
        if ( result >= 0 && result <= 29 ){
            return 0;
        } else if ( result >= 30 && result <= 34 ){
            this.accepted++;
            return 1;
        } else if ( result >= 35 && result <= 39 ){
            this.accepted++;
            return 2;
        } else if ( result >= 40 && result <= 44 ){
            this.accepted++;
            return 3;
        } else if ( result >= 45 && result <= 49 ){
            this.accepted++;
            return 4;
        } else if ( result >= 50 && result <= 60 ){
            this.accepted++;
            return 5;
        } else return -1;
            
        }
    
    public ArrayList<Integer> calculateGrades(){
        for (int result : results){
            grades.add(grade(result));
        }
        return grades;
    }
    
    public void printGrades(){
        System.out.println("Grade distribution:");
        
        String zeroString = "0: ";
        String oneString = "1: ";
        String twoString = "2: ";
        String threeString = "3: ";
        String fourString = "4: ";
        String fiveString = "5: ";
        
        for (int grade : grades){
            switch (grade) {
                case 5:
                    fiveString += "*";
                    continue;
                case 4:
                    fourString += "*";
                    continue;
                case 3:
                    threeString += "*";
                    continue;
                case 2:
                    twoString += "*";
                    continue;
                case 1:
                    oneString += "*";
                    continue;
                case 0:
                    zeroString += "*";
            }
        }
        System.out.println(fiveString);
        System.out.println(fourString);
        System.out.println(threeString);
        System.out.println(twoString);
        System.out.println(oneString);
        System.out.println(zeroString);
    }
    
    public void printAcceptance(){
        double acceptance = (double) this.accepted/ (double) this.results.size();
        acceptance *= 100;
        System.out.print("Acceptance percentage: " + acceptance);
    }
    
}
    
    



