/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class Counter {
    private int value;
    private boolean check;
    
    public Counter (int startingValue, boolean check){
        this.value = startingValue;
        this.check = check;
    }
    
    public Counter (int startingValue){
        this.value = startingValue;
        this.check = false;
    }
    
    public Counter (boolean check){
        this.value = 0;
        this.check = check;
    }
    
    public Counter (){
        this.value = 0;
        this.check = false;
    }
    
    public int value(){
        return this.value;
    }
    
    public void increase(){
        this.increase(1);
    }
    
    public void decrease(){
        if (this.check == true && this.value >= 1){
                this.decrease(1);
        }
        else if (this.check == false){
            this.decrease(1);
        }
    }
    
    public void increase(int increaseAmount){
        if(increaseAmount > 0){
        this.value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount){
        if(decreaseAmount > 0){
            if (this.check == true && this.value >= decreaseAmount){
                this.value -= decreaseAmount;
            } else if (this.check && this.value < decreaseAmount){
                this.value = 0;
            }
            else if (this.check == false){
                this.value -= decreaseAmount;
            }
        }
    }
}