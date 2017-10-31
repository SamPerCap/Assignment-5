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
abstract class Test {
        public static void main(String[] args) {
             
        
    ArrayList<Person> personList = new ArrayList<>();
    
   Student han = new Student(40, "Han","\t\t\t\tCS");
   han.setEmail("han@easv.dk");
    
    
    Student eo = new Student(69, "Eo","\t\t\t\tIT");
    eo.setEmail("eo@vsae.kd");
    
    Student lo = new Student(1, "Lo","\t\t\t\tSF");
    lo.setEmail("lo@psdq.mq");
    
    Teacher superteacher = new Teacher(9999 , "Over", "O");
    superteacher.setEmail("ITSOVER@9999.dk");
    superteacher.addSubject("Class");  
    superteacher.addSubject("Finally"); 
   
    
    Teacher teacher = new Teacher(412,"Lacu", "L");
    
    teacher.setEmail("byebye@easv.dk");
    //teacher.getSubject();
    teacher.addSubject("Medicine");
    teacher.addSubject("CoffeeMachine");
    teacher.addSubject("Become part-time Transformer");
    teacher.addSubject("Being DonkeyMonkey");
    
    personList.add(han);
    personList.add(eo);
    personList.add(lo);
    personList.add(teacher);
    personList.add(superteacher);
    
    
    System.out.println("ID\t"+"NAME\t"+"EMAIL\t\t"+"INITIALS\t"+"MAIN"+"\t\tEducation\t"+"Avg.Grade");
    
             for(Person person : personList) {
                 System.out.println(person);
             }
}
         
}