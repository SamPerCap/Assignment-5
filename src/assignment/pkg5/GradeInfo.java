/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class GradeInfo{
    String subject;
    int grade;
      
    
    public GradeInfo(String subject, int grade) {
        
        this.subject=subject;
        this.grade=grade;
    }
    public String getSubject(){
        
        
       return subject;
            
     }
    public int getGrade(){
             
        return grade;
    }
    
    
    @Override
    public String toString() {
        return "GradeInfo{" + "subject=" + subject + ", grade=" + grade + '}';  //To change body of generated methods, choose Tools | Templates.
    }
    
}
