
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class Library {
    private ArrayList<Book> library = new ArrayList<Book>(); 
    
    public Library(){
        
    }
    
    public void addBook(Book newBook){
        this.library.add(newBook);
    }
    
    public void printBooks(){
        for (Book book : this.library){
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book : this.library){
            if (StringUtils.included(book.title(), title)){
                results.add(book);
            }
        }
        return results;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book : this.library){
            if (StringUtils.included(book.publisher(), publisher)){
                results.add(book);
            }
        }
        return results;
    }
    
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book : this.library){
            if (book.year() == year ){
                results.add(book);
            }
        }
        return results;
    }    
}
