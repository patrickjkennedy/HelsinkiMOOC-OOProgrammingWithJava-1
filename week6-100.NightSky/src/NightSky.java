/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine(){
        String str = "";
        for (int i = 0; i < this.width; i++){
             if (Math.random() > 1.0 - this.density){
                 str += "*";
                 this.starsInLastPrint++;
            } else {
                 str += " ";
             }
        }
        System.out.println(str);
    }
    
    public void print(){
        for (int i = 0; i < this.height; i++){
            this.printLine();
        }
    }

    public int starsInLastPrint(){
        int silp = this.starsInLastPrint;
        this.starsInLastPrint = 0;
        
        return silp;
        
    }
}
