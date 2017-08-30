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

public class Database {
    private ArrayList<Bird> birdDatabase = new ArrayList<Bird>();
    
    public Database(Scanner scanner){
        while(true){
            System.out.print("? ");
            String inp = scanner.nextLine();
            String input = inp.trim().toUpperCase();
            if (input.equals("ADD")){
                this.add(scanner);
            } else if (input.equals("OBSERVATION")){
                this.observation(scanner);
            } else if (input.equals("STATISTICS")){
                this.statistics();
            } else if (input.equals("SHOW")){
                this.show(scanner);
            } else if (input.equals("QUIT")){
                break;
            }
        }
    }
    
    public void add(Scanner scanner){
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Latin Name: ");
        String latinName = scanner.nextLine();
        Bird newBird = new Bird(name, latinName);    
        this.birdDatabase.add(newBird);
    }
    
    public void observation(Scanner scanner){
        System.out.print("What was observed:? ");
        String name = scanner.nextLine();
        for (Bird bird: this.birdDatabase){
            if (bird.getName().contains(name)){
                bird.observed();
            } else {
                System.out.println("Is not a bird!");
            }
        }
    }
    
    public void statistics(){
        for (Bird bird: this.birdDatabase){
            bird.print();
        }
    }
    
    public void show(Scanner scanner){
        System.out.print("What? ");
        String name = scanner.nextLine();
        for (Bird bird : this.birdDatabase){
            if (bird.getName().equals(name)){
                bird.print();
            }
        }
    }
    
    
    
}
