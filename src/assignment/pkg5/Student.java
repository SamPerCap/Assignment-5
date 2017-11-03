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
    public ArrayList<GradeInfo> aGradeList = new ArrayList<>();
    
   public Student(int id, String name, String education) {
        super(id, name);
        this.education = education;
        
    }
    public List<GradeInfo> getGradeReport()
    {
        return aGradeList;
    }
    
    public String getEducation(){
    
    return education;
    }
    public double getAverageGrade() {
        double average = 0.0;
        double sum = 0.0;
        for (GradeInfo gradeInfo : aGradeList)
            {
             sum += gradeInfo.getGrade();
            }
            average = sum / aGradeList.size();
            return average;
    }
   public int getGrade(String subject){
        
        for (GradeInfo gradeInfo : aGradeList)
        {
            if (subject.equalsIgnoreCase(gradeInfo.getSubject()))
            {
                return gradeInfo.getGrade();
            }
        }
        return -1;
    }    
    public void addGrade(GradeInfo grade){
        aGradeList.add(grade);
           
    }

    
    
        
    @Override
    public String toString() {
        return super.toString() + education + "\t\t" + getAverageGrade(); //To change body of generated methods, choose Tools | Templates.
    }
}
