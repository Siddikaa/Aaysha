/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aaysha.constructor;

/**
 *
 * @author admin
 */
public class Student {
    
    int studentId = 100;
    String studentName = "Aaysha";
    
    public Student(int studentId , String studentName){
    
   this.studentId = studentId;// i can use same overiable refrence using ths keyword
    this.studentName =studentName;            
        
    }
    public void getDta(){
        System.out.println(studentId);
        System.out.println(studentName);
        
    }
    
    public static void main(String[] args){
        
        Student st1 = new  Student(10 ,"aaysha");
        Student st2 = new Student(20 , "Shipha");
        
    }
    
}
