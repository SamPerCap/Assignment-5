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
public class Student extends Person {
    private String education;
    
    public ArrayList<String> aGradeList = new ArrayList<>();
    
   public Student(int id, String name, String education) {
        super(id, name);
        this.education = education;
        
    }
    
    
    public String getGradeReport(){
    
        if(0 < aGradeList.size()) {
            return aGradeList.get(0);
            
        }
        return null;
       
    }
   
    public String getEducation(){
    
    return education;
    }
    public void addGrade(String grade){
        aGradeList.add(grade);
        
    
    }

    public void getAverageGrade(double grade) {
        
    }
    public int getGrade(String subject){
        
        
        
        return 0;
    }
    public void addGrade(GradeInfo grade){
    
    }
        
    @Override
    public String toString() {
        return super.toString()+"\t" + education +"\t"+"\t"; //To change body of generated methods, choose Tools | Templates.
    }
}
