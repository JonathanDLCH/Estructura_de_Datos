/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

import javax.swing.JFrame;

/**
 *
 * @author Hacks_s
 */
import Ventana.Floyd;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//import Grafos.Grafos;

/**
 *
 * @author Hacks_s
 */
public class MostrarMatriz extends JFrame implements ActionListener{

    JButton Prim,Matriz;
	Grafos principal;
        //Floyd claseFloyd;
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
        public Floyd AlgoritmoFloyd;
        public ArrayList<ArrayList<Double>> ArraydeListas;
    
        
    
      
        
        
    public MostrarMatriz(Grafos principal){
            
                ArraydeListas = new ArrayList<ArrayList<Double>>();
                // AlgoritmoFloyd = new Floyd(Grafos.ArrayL);
                setLayout(null);
                //this.setLocationRelativeTo(null);
                //this.setExtendedState(MAXIMIZED_BOTH);
                setSize(700,500);
		this.principal = principal;
                etiqueta=new JLabel("Matriz Procesada de Grafo DIRIGIDO:");
                etiqueta.setBounds(30, 15, 300, 10);
               
                areaTextoMatriz=new JTextArea();
                areaTextoMatriz.setEditable(false);
                areaTextoMatriz.setBounds(10,80, 400,400);
                getPreferredSize();
                add(areaTextoMatriz);
                panel=new JScrollPane(areaTextoMatriz);
                panel.setBounds(10, 80, 300, 300);
                
                areaTextoAlgoritmos=new JTextArea();
                areaTextoAlgoritmos.setEditable(false);
                areaTextoAlgoritmos.setBounds(450,80, 800,600);
                getPreferredSize();
                add(areaTextoAlgoritmos);
                panel2=new JScrollPane(areaTextoAlgoritmos);
                panel2.setBounds(450, 80, 800, 600);
                //add(panel2);
                add(panel);
                add(etiqueta);
		setLayout( null );
		setVisible( true );
		setTitle( "Mostrar Matriz" );
		
		Prim = new JButton("Prim");
		Prim.setBounds( 10,10, 150, 20 );
		Prim.addActionListener( this );
		Prim.setActionCommand( "Prim" );
		//add( Prim );
                Matriz=new JButton("Generar Matriz");
                Matriz.setBounds( 250,10, 150, 20 );
                Matriz.addActionListener( this );
                Matriz.setActionCommand( "matriz" );
		add( Matriz );
                //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

 
    
    public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch( comando ) {
			
			
                        case "Prim":
                                AlgoritmoPrim();
                        break;
                        
                        case "matriz":
                                Grafos.matrizDeCostos();
                ArraydeListas = Grafos.ArrayL;
                //ArraydeListas = AlgoritmoFloyd.Floyd(ArraydeListas);
                areaTextoMatriz.setText(""); 
                for(int i = 0; i < ArraydeListas.size(); i++){
                    for(int j = 0; j < ArraydeListas.get(i).size(); j++){
                        areaTextoMatriz.append(ArraydeListas.get(i).get(j).toString() + "  ");
            }
            areaTextoMatriz.append("\n");
//            Double a = (Grafos.ArrayL.get(partida.getSelectedIndex()).get(llegada.getSelectedIndex()));
//            barra.setText(a.toString());
        }
                                
                        break;
		}
                
                //add(areaTexto);
                //add(panel);
                
                
                 etiqueta2=new JLabel("Matriz de Grafo Dirigido: ");
                etiqueta2.setBounds(30, 40, 300, 10);
                add(etiqueta2);
	}

    
    public void Matriz(){
        
         
    
    }
    public void AlgoritmoPrim(){
    
    
    }
}
