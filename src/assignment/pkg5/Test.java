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
    
   Person  han = new Person(40, "Han");
    han.setEmail("han@easv.dk"); 
    
    /*man.addSubject("Programming");
    man.addSubject("Medicine");
    man.addSubject("CoffeeMachine");
    man.addSubject("Become part-time Transformer");
    man.addSubject("Being DonkeyMonkey");*/
    
    Person eo = new Person(69, "Eo");
    eo.setEmail("eo@easv.dk");
    
    Person lo = new Person(1, "Lo");
    lo.setEmail("lo@easv.dk");
    
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
    
    
    System.out.println("ID\t"+"NAME\t"+"EMAIL\t\t"+"INITIALS\t"+"MAIN");
    
             for(Person person : personList) {
                 System.out.println(person);
             }
}
         
}