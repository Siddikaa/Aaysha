/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aaysha.siddika;



public class LocalVeriable {
    //Local veriable access only inside block method constructor
    //Constractor 
    
    public void Local(){
    int u=20;
    }
    
    //Block
    {
int j=12;
System.out.println("j" + j);
}
    
 //method   
    public void test(){
     int k=13; 
     System.out.println("k" + k);
    }
    //main method
    
    public static void main(String[]aegs){
        int v=555;
        System.out.println("v"  +v);
       
      LocalVeriable i = new LocalVeriable();
       i.test();    
      i.Local();
    }
}
