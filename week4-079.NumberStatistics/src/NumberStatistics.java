/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics(){
        amountOfNumbers = 0;
        
    }
    
    public void addNumber(int number){
        if (number != -1){
            this.amountOfNumbers++;
            this.sum += number;
        }
    }
    
    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        if (sum() != 0 && amountOfNumbers() != 0){
            return (double) sum() / (double) amountOfNumbers();
        }
        return 0;
    }
}
