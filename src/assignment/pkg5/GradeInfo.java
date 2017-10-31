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
public class GradeInfo extends Student {
    String subject;
    int grade;
    
    public ArrayList<String> aSubjectList = new ArrayList<>();
    int aGradeList[] = {1,8,2,2,0,4,9,6};
    
    
    public GradeInfo(String subject, int grade) {
        
        
        super(id, name, education);
    }
    public String getSubject(){
        
        
        if(0 < aSubjectList.size()) {
            return aSubjectList.get(0);
            
        }
        return null;}
    public int getGrade(){
             
        return aGradeList[1];
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"\t"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
