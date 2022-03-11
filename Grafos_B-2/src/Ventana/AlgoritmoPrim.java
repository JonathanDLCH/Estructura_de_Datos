/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Grafos.Grafos;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import Grafos.Grafos;

/**
 *
 * @author Hacks_s
 */
public class AlgoritmoPrim extends JFrame implements ActionListener{

    JButton Prim,Arbol;
	Grafos principal;
        ArrayList<ArrayList<Double>> ArraydeListas;
	private JMenuBar barra;
	private JMenu menu_opciones;
	//private PanelBotones botones;
	private JMenuItem MenuItem_Ayuda;
        private final JTextArea areaTextoMatriz;
        private JTextArea areaTextoAlgoritmos;
        private final JScrollPane panel;
        private  JScrollPane panel2;
        private JLabel etiqueta,etiqueta2;
        private String AlgoritmoResul;
        Floyd AlgoritmoFloyd;
        AlgoritmoPrim m;
    
    
        
        
        
        
    public AlgoritmoPrim(Grafos principal){
                
                ArraydeListas = new ArrayList<ArrayList<Double>>();
                AlgoritmoFloyd = new Floyd(Grafos.ArrayL);
                setLayout(null); 
                setSize(600,400);
                setLocationRelativeTo(null);
                //this.setExtendedState(MAXIMIZED_BOTH);
               
		this.principal = principal;
                etiqueta=new JLabel("ALGORITMO DE PRIM ");
                etiqueta.setBounds(30, 10, 200, 10);
               
                areaTextoMatriz=new JTextArea();
                areaTextoMatriz.setEditable(false);
                areaTextoMatriz.setBounds(10,80, 400,400);
                getPreferredSize();
                add(areaTextoMatriz);
                panel=new JScrollPane(areaTextoMatriz);
                panel.setBounds(150, 40, 300, 300);
                
                areaTextoAlgoritmos=new JTextArea();
                areaTextoAlgoritmos.setEditable(false);
                areaTextoAlgoritmos.setBounds(450,80, 800,600);
                getPreferredSize();
//                add(areaTextoAlgoritmos);
//                panel2=new JScrollPane(areaTextoAlgoritmos);
//                panel2.setBounds(450, 80, 800, 600);
//                add(panel2);
                add(panel);
                //add(etiqueta);
		setLayout( null );
		setVisible( true );
		setTitle( "Algoritmo de Prim " );
		
		Prim = new JButton("Aplicar Algoritmo Prim");
		Prim.setBounds( 50,10, 200, 20 );
		Prim.addActionListener( this );
		Prim.setActionCommand( "Prim" );
		add( Prim );
                Arbol=new JButton("Generar Arbol de Expancion Minima");
                Arbol.setBounds( 270,10, 250, 20 );
                Arbol.addActionListener( this );
                Arbol.setActionCommand( "Arbol" );
                add(Arbol);
    }
    
//    public int Tam(){
//        JOptionPane.showMessageDialog(null,"LLamanste a tamaño");
//        int T=ArraydeListas.size()*ArraydeListas.size();
//         JOptionPane.showMessageDialog(null,"se asigno tamaño");
//        return T;
//         
//    }
//     public double[][] funcion(){
//         JOptionPane.showMessageDialog(null,"Tamaño de array de listas "+ArraydeListas.size());
//        int finalll=ArraydeListas.size()*ArraydeListas.size();
//                                 double[][] Mq=new double[finalll][finalll];
//                                 String[][] array=new String[finalll][finalll];
//                        Mq=principal.AlgPrim(imprimir());// es la matriz que ya tiene los valores actualizados 
//                         for(int i = 0; i < ArraydeListas.size(); i++){
//                                    for(int j = 0; j < ArraydeListas.get(i).size(); j++){
//                                            if(Double.isInfinite(Mq[i][j])){
//                                                
//                                            }
//                                            System.out.print(Mq[i][j]+"  ");
//                                            System.out.println("∞");
//                                            
//                                    }
//                                        System.out.println();
//                                } 
//                        for(int c=0;c<ArraydeListas.size();c++){
//                                    for(int h=0;h<ArraydeListas.size();h++){
//                                        if(Double.isInfinite(Mq[c][h]) != true){
//                                            areaTextoMatriz.append("["+Mq[c][h]+"]"+"   ");
//                                        }else{
//                                            areaTextoMatriz.append("[∞]"+"   ");
//                                        }
//                                        System.out.println("["+Mq[c][h]+"]"+"   ");
//                                    }
//                                   areaTextoMatriz.append("\n");
//                                    System.out.println("\n");
//
//                               }
//
//                   // break;
//                   return Mq;
//		}   
// 
    
    public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch( comando ) {
                        
                        case "Arbol":
                                ArbolEM VenatnaArbol = new ArbolEM(principal);
                                //VenatnaArbol.setLocationRelativeTo(null);
                                VenatnaArbol.setVisible(rootPaneCheckingEnabled);
                        break;
                    
                        case "Prim":
                           prim();
                        break;
		}
                
                 etiqueta2=new JLabel("Resultados de Algoritmo: ");
                etiqueta2.setBounds(50, 40, 250, 20);
                add(etiqueta2);//etiqueta2.paintImmediately(450, 40, 250, 20);
	}
    
    
    
    public void prim(){
    
     int finalll=ArraydeListas.size()*ArraydeListas.size();
                               
     double[][] Mq=new double[finalll][finalll];
     String[][] array=new String[finalll][finalll];
                        Mq=principal.AlgPrim(igualarmatriz());
                        for(int c=0;c<ArraydeListas.size();c++){
                                    for(int h=0;h<ArraydeListas.size();h++){
                                       areaTextoMatriz.append("["+Mq[c][h]+"]"+"   ");
                                        //System.out.println("["+Mq[c][h]+"]"+"   ");
                                    }
                                   areaTextoMatriz.append("\n");
                                    //System.out.println("\n");

                               }
    
    
    
    }
    
    public double[][] igualarmatriz(){
        Grafos.matrizDeCostos();
        ArraydeListas = Grafos.ArrayL;                            
        int finalll=ArraydeListas.size()*ArraydeListas.size();                            
                               
        double[][] MA=new double[finalll][finalll];
        double[][] MO=new double[finalll][finalll];
                                
                               
                                
                                for(int i = 0; i < ArraydeListas.size(); i++){
                                    for(int j = 0; j < ArraydeListas.get(i).size(); j++){
                                            MA[i][j]=ArraydeListas.get(i).get(j);
                                            
                                    }
                           
                                } 
                                for(int i = 0; i < ArraydeListas.size(); i++){
                                    for(int j = 0; j < ArraydeListas.get(i).size(); j++){
                                            MO[j][i]=ArraydeListas.get(i).get(j);
                                            
                                    }
                           
                                } 
                                 for(int i = 0; i < ArraydeListas.size(); i++){
                                    for(int j = 0; j < ArraydeListas.get(i).size(); j++){
                                            if(MA[i][j]==MO[i][j]){
                                            }else{
                                                if(MA[i][j]==0){
                                                    MA[i][j]=MO[i][j];
                                                }else{
                                                    if(MO[i][j]==0){
                                                        MO[i][j]=MA[i][j];
                                                    
                                                    }
                                                }
                                            
                                            }
                                          
                                    }
                                    
                                }
                                 
                                  
                                return MO;
 
 }
    
    
}


