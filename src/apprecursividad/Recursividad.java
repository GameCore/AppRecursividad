/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apprecursividad;

/**
 *
 * @author Pablo
 */
public class Recursividad {
    

    
    
    
    public Recursividad(){}
 


    
     long sumaNenteros (int n) { 
        if (n == 1) 
            return 1; 
        else  
            return n + sumaNenteros(n - 1); 
    }
     
    long fibonacci (long n) {
        
        if (n == 0 || n == 1)  
            return n;
        else  
            return fibonacci(n - 1) + fibonacci(n - 2); 
    }
    
    public void metodoA(char c) {  
        if (c > 'A')
             metodoB(c);   
        System.out.print(c);  }  
    public void metodoB(char c)  {   
        metodoA(--c);  
    }
    
   public void hanoi(char varinicial, char varcentral, char varfinal, int n) { 
        if ( n == 1)  System.out.println("Mover disco " + n + " desde varilla " +           varinicial + " a varilla " + varfinal);
     
else 
{  
    hanoi(varinicial, varfinal, varcentral, n-1);
  
System.out.println("Mover disco " + n + " desde varilla " +          varinicial + " a varilla" + varfinal);
hanoi(varcentral, varinicial, varfinal, n - 1); 
}     
}
   
   
   
  public int busquedaBR(double a[], double clave
           ,int inferior, int superior) 
   { 
       int central; 
if (inferior > superior) // no encontrado  
return -1; 
else  
{  
    central = (inferior + superior)/2;  
    if (a[central] == clave)       
        return central;  
    else if (a[central] < clave)   
            return busquedaBR(a, clave, central+1, superior);  
        else   
            return busquedaBR(a, clave, inferior, central-1); 
} 
}


}
  
  
