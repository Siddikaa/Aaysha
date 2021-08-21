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
public class InstanceBlock {
    
    // instance block
    
    {
        System.out.println("i am in instance block");
        
    }
    
   
    
    public InstanceBlock(int a , int b ){ //constructor parameter
                int c=a+b;
        
        System.out.println("i am in constructor  = "  +c);
        
    }
    
    // 2nd instance block
     {
        System.out.println("i am in instance block1");
    }
    
     public static void main(String[] args){
         new InstanceBlock(10 , 20);
         
     }
}
