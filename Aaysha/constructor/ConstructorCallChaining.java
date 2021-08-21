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
public class ConstructorCallChaining {
    
    public ConstructorCallChaining (){
        this("Aaysha" , 10);//   this keyword use for calling constructor
        
        System.out.println("i am no para constructor");
    }
    
    public ConstructorCallChaining(String str ,int i){
        
        System.out.println(str +""+ i);
     System.out.println("i am  para constructor");
        
    }
    
    public static void main(String[] args){
       new ConstructorCallChaining(); 
    }
}
