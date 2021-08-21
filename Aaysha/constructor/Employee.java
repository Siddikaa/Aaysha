/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aaysha.constructor;

/**
 *
 * @author t
 */
public class Employee {
    
    int empNo;
    String empName;
    void getEmpInf(){
        
        System.out.println(empNo);
        System.out.println(empName);
    }
    public Employee(){ // constructor name should be same as clas name 
        //no need to return type .
         empNo = 10;
         empName  = "aaysha";
    }
    public static void main(String [] args){
    Employee emp = new Employee(); // direct constructor called 
    emp.getEmpInf();
    
    }
    
}
