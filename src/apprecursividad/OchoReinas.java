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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pablo
 */
public class OchoReinas {
    static int ejeX,ejeY;
    
    
    private final int N = 8; 
    private final int n = (N+1); 
    public int [] reinas = new int[n];
    private boolean solucion;
    
    
     
    
    
          
         
    
    
    
    
    
    
    
    
    
    
    
    public boolean solucionReinas() 
    {
        solucion = false;
        ponerReina(2);
        return solucion; 
    } 
    public void ponerReina(int i)
            { 
                int j;
             j = 0; // inicializa posibles movimientos
             do {
                 j++;
               reinas[i] = j; // prueba a colocar reina i en fila j,
               // a la vez queda anotado el movimiento  
               if (valido(i))   
                {    
                   if (i < N) // no completado el problema 
                    {    
                       
                   ponerReina(i+1);
                   // vuelta atrás
                   if (!solucion)
                       reinas[i] = 0;
               }
               else // todas las reinas colocadas
                   solucion = true;  
               }
             } while(!solucion && (j < 8));
            }
    private boolean valido(int i)
            { 
                /* Inspecciona si la reina de la columna i es atacada por
                alguna reina colocada anteriormente */ 
                int r;
                boolean libre;
                libre = true;
                for (r = 1; r <= i-1; r++) {
                    // no esté en la misma fila
                    libre = libre && (reinas[i] != reinas[r]);
                    // no esté en alguna de las dos diagonales
                    libre = libre && ((i + reinas[i]) != (r + reinas[r]));
                    libre = libre && ((i - reinas[i]) != (r - reinas[r]));
                }
                return libre;                   
            }
    
    public void imprimirVector(){
        
    for(int x=1;x<=8;x++){
        System.out.print( " ("+ x+ ","+ reinas[x]+" )" );

        }
    

    
    
    }
    }
    