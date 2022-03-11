package Grafos;

import javax.swing.*;
import java.awt.*;
import java.awt.Point.*;
import java.awt.event.MouseAdapter;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;

public class MatrizDeCostos extends JFrame {

   private JTable matriz;
    
    public MatrizDeCostos() {
        
        
        setSize(300, 500);
        //setResizable(false);
        setTitle("Matriz de Costos");
        setLayout(new GridLayout());


        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 400, 350);
        
        matriz = new JTable();
        
        
        

    }

}
