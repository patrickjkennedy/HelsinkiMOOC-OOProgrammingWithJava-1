/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class BoundedCounter{
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.value = 0;
        if (upperLimit < 0){
            this.upperLimit = 0;
        }
        else this.upperLimit = upperLimit;
}
    
    public void next(){
        if (this.value < this.upperLimit){
            value++;
        }
        else this.value = 0;
    }
    
    public String toString(){
        if (this.value < 10){
            return "0"+ Integer.toString(this.value);
        }
        else return Integer.toString(this.value);
    }   
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int newValue){
        if (newValue >= 0 && newValue < this.upperLimit){
            this.value = newValue;
        }   
    }
    
    public int getUpperLimit(){
        return this.upperLimit;
    }
}
