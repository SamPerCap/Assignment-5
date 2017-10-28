/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class Teacher extends Person{
    private String initial;
    private double salary;
    
    public ArrayList<String> aSubjectList = new ArrayList<>();
    
    public Teacher(int id, String name, String initial) {
        super(id, name);
        this.initial = initial;
        
    }
    
    
    public String getSubject(){
    
        if(0 < aSubjectList.size()) {
            return aSubjectList.get(0);
            
        }
        return null;
       
    }
    public double getSalary() {
        return salary;
    }
    
    public String getInitial(){
    
    return initial;
    }
    public void addSubject(String subject){
        aSubjectList.add(subject);
        
    
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"\t" + initial +"\t"+"\t"+ getSubject(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
