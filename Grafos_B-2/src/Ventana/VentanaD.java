package Ventana;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import Grafos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaD extends javax.swing.JFrame implements ItemListener{
    JPanel panel, panel2;
    JLabel let1,let2;
    JButton b1,b2;
    JTextArea t1,t2;
    JComboBox<Integer> partida, llegada;
    Dijkstra AlgoritDijkstra;
    double [][] matriz;
    String ruta = "";
    Dijks dik;
    
    
    public VentanaD(){
        setLocationRelativeTo(null);
        setSize(600,250);
        setLayout(null);
        //setUndecorated(true);
        setBackground(new Color(52, 152, 219));
       AlgoritDijkstra = new Dijkstra();
       dik = new Dijks();
        partes();
    }

    
    private void partes(){
        //double [][]matriz = {{2,4,4},{6,6,9},{8,10,12}};
        
        b1 = new JButton("Comienza");
        b1.setBounds(80,120,150,30);
        add(b1);
        b1.addActionListener(new ActionListener(){
            
            
            @Override
            public void actionPerformed(ActionEvent e) {
                Grafos.matrizDeCostos();
                String w = "";
                matriz = dik.Dijk(Grafos.ConvierteArrayenMatriz(Grafos.ArrayL), (int)partida.getSelectedItem(), (int) llegada.getSelectedItem());
                t1.setText("");
                for(int i = 0; i< matriz.length; i++){
                    w = String.valueOf(matriz[(int)partida.getSelectedItem()][i]);
                    t1.append( w + "  ");
                    w = "";
                }
                
                //t1.append(ruta);
            }
            
        });
        t1 = new JTextArea();
        t1.setBounds(250, 10, 300, 90);
        add(t1);
       
        
        partida = new JComboBox();
        partida.setBounds(80,10,100,30);
        for(int i = 0; i < Grafos.nodo.size(); i++)
            partida.addItem(Grafos.nodo.get(i).getId());
        partida.addItemListener(this);
        partida.addActionListener(partida);
        add(partida);
        
        
        llegada = new JComboBox();
        llegada.setBounds(80,70,100,30);
        for(int i = 0; i < Grafos.nodo.size(); i++)
            llegada.addItem(Grafos.nodo.get(i).getId());
        llegada.addItemListener(this);
        llegada.addActionListener(llegada);
        add(llegada);
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //String s = (String)e.getItem();
        Integer s = (Integer )e.getItem();
    }
    
}