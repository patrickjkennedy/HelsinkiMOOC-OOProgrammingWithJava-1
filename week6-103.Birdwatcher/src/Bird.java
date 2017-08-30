/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class Bird {
    private String name;
    private String latinName;
    private int numberObserved;
 
    public Bird(String name, String latinName){
        this.numberObserved = 0;
        this.name = name;
        this.latinName = latinName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public void setLatinName(String latinName){
        this.latinName = latinName;
    }
    
    public void observed(){
        this.numberObserved++;
    }
    
    public int getObservations(){
        return this.numberObserved;
    }
    
    public void print(){
        System.out.println(this.name + " (" + this.latinName + ") : " + this.numberObserved + " observations");
    }
}
