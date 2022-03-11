
package Ventana;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import Grafos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.awt.event.ItemListener;

public class VentanaF extends javax.swing.JFrame implements ItemListener{
    JTextArea t1;
    JComboBox<Integer> partida, llegada;
    JButton accion;
    JLabel let1,let2,let3;
    JTextField barra;
    Floyd AlgoritmoFloyd;
    //Grafos g;
    
    //ArrayList<ArrayList<Integer>> Arreglo;
    int q,p;
    private ArrayList<ArrayList<Double>> ArraydeListas;
    
    public VentanaF(){
        setLocationRelativeTo(null);
        setSize(800,300);
        setLayout(null);
        //setUndecorated(true);
        setBackground(new Color(52, 152, 219));
        partes();
    }
    
    public void partes(){
        AlgoritmoFloyd = new Floyd(Grafos.ArrayL);
        ArraydeListas = new ArrayList<ArrayList<Double>>();
        let1 = new JLabel("partida");
        let1.setBounds(10, 10, 100, 30);
        add(let1);
        
        partida = new JComboBox();
        partida.setBounds(120,10,100,30);
        for(int i = 0; i < Grafos.nodo.size(); i++)
            partida.addItem(Grafos.nodo.get(i).getId());
        partida.addItemListener(this);
        partida.addActionListener(partida);
        add(partida);
        
        
        
        let2 = new JLabel("llegada");
        let2.setBounds(10, 50, 100, 30);
        add(let2);
        
        llegada = new JComboBox();
        llegada.setBounds(120,50,100,30);
        for(int i = 0; i < Grafos.nodo.size(); i++)
            llegada.addItem(Grafos.nodo.get(i).getId());
        llegada.addItemListener(this);
        llegada.addActionListener(llegada);
        add(llegada);
        /*System.out.println(partida.getSelectedItem().toString());
        System.out.println(llegada.getSelectedItem().toString());*/
        
        
        accion = new JButton("Calcula");
        accion.setBounds(250,25,100,30);
        add(accion);
        barra = new JTextField();
        barra.setBounds(360,25,1000,30);
        add(barra);

       // barra.setText(Grafos.ArrayL.get(partida.getItemListeners().toString()).get(llegada.getItemListeners().toString());
        
        let3 = new JLabel("matriz:");
        let3.setBounds(10, 100, 100, 30);
        add(let3);
        
        t1 = new JTextArea();
        t1.setBounds(10,140,780,350);
        add(t1);
        t1 = new JTextArea();
        t1.setBounds(10,140,780,350);
        add(t1);
       // int i = 0;
       // t1.setText("");

        accion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Grafos.matrizDeCostos();
                ArraydeListas = Grafos.ArrayL;
                ArraydeListas = AlgoritmoFloyd.Floyd(ArraydeListas);
                t1.setText(""); 
                for(int i = 0; i < ArraydeListas.size(); i++){
                    for(int j = 0; j < ArraydeListas.get(i).size(); j++){
                        t1.append(ArraydeListas.get(i).get(j).toString() + "  ");
            }
            t1.append("\n");
            Double a = (Grafos.ArrayL.get(partida.getSelectedIndex()).get(llegada.getSelectedIndex()));
            barra.setText(a.toString());
        }//ArraydeListas = null;
            }
            
        });
        
        
        barra = new JTextField();
        barra.setBounds(360,25,1000,30);
        add(barra);
       // barra.setText(Grafos.ArrayL.get().get(llegada.getItemCount()).toString());
        
        let3 = new JLabel("matriz:");
        let3.setBounds(10, 100, 100, 30);
        add(let3);
        
        t1 = new JTextArea();
        t1.setBounds(10,140,780,350);
        add(t1);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //String s = (String)e.getItem();
        Integer s = (Integer )e.getItem();
    }
    
    
}
