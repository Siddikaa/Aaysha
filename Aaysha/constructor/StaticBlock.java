/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aaysha.constructor;

public class StaticBlock {
    
    // static block have should be static key word
  static  {
      System.out.println("i am static block");      
        
    }
  

      static int id=10;
      static String name = "Aaysha";
      { System.out.println("i am instance block");
  }
  //normal method
 static  void getTest(){
       
       System.out.println("Id = " + id);
       System.out.println("name = " + name);
   } 
   
   public StaticBlock(){
        this ("Aaysha " ,"Siddika");
   }
   //constructor
   public StaticBlock (String st ,String str ){
       System.out.println("Name  " +st +str);
       getTest();
   }
   
   public static void main(String[] args){
      new StaticBlock(); 
     //StaticBlock  obj = new StaticBlock();
      // obj1.getTest();
   }
}


