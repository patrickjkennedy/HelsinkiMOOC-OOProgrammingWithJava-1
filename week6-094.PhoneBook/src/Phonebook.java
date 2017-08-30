import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class Phonebook {
    
    private ArrayList<Person> phonebook = new ArrayList<Person>();
    
    public Phonebook(){
        
    }
    
    public void add(String name, String number){
        Person person = new Person(name, number);
        this.phonebook.add(person);
    }
    
    public void printAll(){
        for (Person p : this.phonebook){
            System.out.println(p);
        }
    }
    
    public String searchNumber(String name){
        for (Person p : this.phonebook){
            if (p.getName().equals(name)){
                 return p.getNumber();
            } 
        } return "number not known";
    }
    
}
