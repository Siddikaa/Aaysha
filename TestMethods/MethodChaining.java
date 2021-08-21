                            /*
 * To change this license header, choose Lic    ense Headers in Project Properties.
 * To change this template        f i   l    e , choose Tools | Tem plates
 * and open the template in the editor.
 */
package TestMethods;


public class MethodChaining {
    int i;
     public void m1(String i){
        
         m2();
         System.out.println("i am in m1" );
          System.out.println(i);
         
     }
      public void m2(){
          m3();
        
         System.out.println("i am in m2" );
         
    }
       public void m3(){
                   
         System.out.println("i am in m3" );
         
    }
    public static void main(String [] args)
    {
        
        MethodChaining obj =new  MethodChaining();
        obj.m1("sefu");

       
     }
}
