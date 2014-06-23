/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apprecursividad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 *
 * @author Pablo
 */
public class Tablero {
    
    public Tablero(){
        
        AppRecursividad imagen = new AppRecursividad();
    
    JFrame.setDefaultLookAndFeelDecorated(true); 
    JFrame frame = new JFrame("Las Reinas");
    frame.add(imagen);
    frame.setSize(700,720);
    frame.setVisible(true);
    frame.setResizable(false); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Hace que la ventana aparezca centrada en la pantalla
    frame.setLocationRelativeTo(null);
    
    //Cambia el icono de la taza de café (la imagen puede ser png,jpg,etc ...).
    frame.setIconImage(new ImageIcon(getClass().getResource("/imagenes/reina.png")).getImage());
    
    //frame.setUndecorated(true);
    //frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    }
    
    
    
    
}
    

