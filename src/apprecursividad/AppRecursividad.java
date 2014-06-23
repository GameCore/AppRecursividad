/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apprecursividad;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Pablo
 */
public class AppRecursividad extends JPanel{
   
    
  public static int distanciaLineas;
  
  
  
    @Override
    public  void paint(Graphics g){
        int ejeX,ejeY;
        int tamañoTablero = 8;
         AppRecursividad.distanciaLineas = 700/tamañoTablero;
        int reinaX,reinaY;
           Graphics2D g2d   = (Graphics2D) g;
           Dimension tamanio = getSize();
           ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/chess.jpg"));
           ImageIcon reinaImagen = new ImageIcon(getClass().getResource("/imagenes/reina.png"));           
           int auxEjes=AppRecursividad.distanciaLineas;
           
          //reinaX-=AppRecursividad.distanciaLineas;
      
         // reinaY-=AppRecursividad.distanciaLineas;
           g2d.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
           OchoReinas y = new OchoReinas();
           y.solucionReinas();
           
            for(int val=1;val<=8;val++){
                ejeX = val;
                reinaX = ejeX*auxEjes;
             reinaX-=AppRecursividad.distanciaLineas;
            ejeY = y.reinas[val];
            reinaY =ejeY*auxEjes;  
            reinaY-=AppRecursividad.distanciaLineas;
                   
           
           
           g2d.drawImage(reinaImagen.getImage(),reinaX,reinaY,AppRecursividad.distanciaLineas, AppRecursividad.distanciaLineas, null);
           
           }
           
           setOpaque(false);
           // le indicamos al panel que no dibuje su fondo por defecto (sino este taparía la imagen)
           super.paintComponent(g2d);
           // le indicamos al panel que continúe dibujando el resto de los componentes.
           g2d.setColor(Color.BLUE);
           int b =AppRecursividad.distanciaLineas;
         /*        
           for(int aux=b;aux<=700;aux+=b){           
           g2d.drawLine(aux , 0 , aux, 700);
           g2d.drawLine( 0 , aux , 700, aux);
           }*/
             }  
    
    
     
    
    
    
    
     

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double z[]= {10,30,40,50,60,70,80,90};
        
       
        // TODO code application logic here
        Recursividad n = new Recursividad();
         
    
        System.out.println(n.sumaNenteros(5));
        
        for(int x=1;x<=10;x++){
        System.out.println(n.fibonacci(x));
        }
        
        System.out.println();  n.metodoA('Z');  
        System.out.println();
        
        n.hanoi('A', 'B', 'C', 3);
        
       System.out.println( n.busquedaBR(z,100 , 0, 7));
       
       //Caballo
 int x, y;
  boolean solucion;
 BufferedReader entrada = new BufferedReader(
         new InputStreamReader(System.in));
       try {
           System.out.println("Posicion inicial del caballo. ");
       System.out.print(" x = ");
       x = Integer.parseInt(entrada.readLine());
       System.out.print(" y = "); 
       y = Integer.parseInt(entrada.readLine()); 
       CaballoSaltador miCaballo = new CaballoSaltador(x,y);
       solucion = miCaballo.resolverProblema();
       if (solucion)
           miCaballo.escribirTablero();
       }  
       catch (Exception m)
       {
           System.out.println("No se pudo probar el algoritmo, " + m);  
       }
       
       //Reinas
      OchoReinas p=new OchoReinas();
     p.solucionReinas();
     p.imprimirVector();
      
      Tablero tab = new Tablero();
  
   
       
       
    
        
    }
    
}
