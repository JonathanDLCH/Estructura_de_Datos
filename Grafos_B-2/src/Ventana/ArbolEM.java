/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import Grafos.Grafos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
//import Ventana.ArbolEM;
/**
 *
 * @author Hacks_s
 */
public class ArbolEM extends JFrame  {
    
    private PanelExpancionMinima PanelGeneral;
    private JButton GenerarArbol;
    private JScrollPane ScrollVentana;
    Grafos principal;
    PanelExpancionMinima Panel;
    AlgoritmoPrim m;
    ArbolEM x;
    
    ArbolEM(Grafos principal){
        m=new AlgoritmoPrim(principal);
        this.principal=principal;
        //setLayout(null);
        //this.setExtendedState(MAXIMIZED_BOTH);
        setSize(1366,768);
        setTitle("Arbol de Expancion Minima");
        iniciarComponentes();
    
    }
    
    private void iniciarComponentes(){
        PanelGeneral=new PanelExpancionMinima(principal);
        PanelGeneral.setLayout(null);
        //PanelGeneral.setPreferredSize(getMaximumSize());
        
        ScrollVentana=new JScrollPane();
        ScrollVentana.setViewportView(PanelGeneral);
        PanelGeneral.setPreferredSize(new Dimension(1500,1500));
        add(ScrollVentana);
    }
}
