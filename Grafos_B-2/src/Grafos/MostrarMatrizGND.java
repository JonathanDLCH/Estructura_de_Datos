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
import Grafos.Grafos;
import Ventana.Floyd;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import Grafos.Grafos;

/**
 *
 * @author Hacks_s
 */
public class MostrarMatrizGND extends JFrame implements ActionListener{

    JButton Prim,Matriz;
	Grafos principal;
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
        public ArrayList<ArrayList<Double>> ArraydeListasAux;
    
        
    
        
        
        
    public MostrarMatrizGND(Grafos principal){
            ArraydeListas = new ArrayList<ArrayList<Double>>();
             ArraydeListasAux = new ArrayList<ArrayList<Double>>();
                setLayout(null);
                //this.setLocationRelativeTo(null);
                //this.setExtendedState(MAXIMIZED_BOTH);
                setSize(700,500);
		this.principal = principal;
                etiqueta=new JLabel("Matriz Procesada de Grafo NO DIRIGIDO:");
                etiqueta.setBounds(30, 15, 320, 10);
               
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
                Matriz.setBounds( 300,10, 150, 20 );
                Matriz.addActionListener( this );
                Matriz.setActionCommand( "matriz" );
		add( Matriz );
                //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

 
    
    public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch( comando ) {
			
			
                       
                        
                        case "matriz":imprimir();
//                                Grafos.matrizDeCostos();
//                                ArraydeListas = Grafos.ArrayL;
//                                //ArraydeListas = AlgoritmoFloyd.Floyd(ArraydeListas);
//                                areaTextoMatriz.setText(""); 
//                                for(int i = 0; i < ArraydeListas.size(); i++){
//                                    for(int j = 0; j < ArraydeListas.get(i).size(); j++){
//                                        areaTextoMatriz.append(ArraydeListas.get(i).get(j).toString() + "  ");
//                            }
//                            areaTextoMatriz.append("\n");
//                //            Double a = (Grafos.ArrayL.get(partida.getSelectedIndex()).get(llegada.getSelectedIndex()));
//                //            barra.setText(a.toString());
//                        }
                                
                        break;
		}
                
                //add(areaTexto);
                //add(panel);
                
                
                 etiqueta2=new JLabel("Matriz de Grafo Dirigido: ");
                etiqueta2.setBounds(30, 40, 300, 10);
                add(etiqueta2);
	}

 public void imprimir(){
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
                                 
                                  for(int i = 0; i < ArraydeListas.size(); i++){
                                    for(int j = 0; j < ArraydeListas.get(i).size(); j++){
                                            System.out.print(MO[j][i]+"  ");
                                            
                                    }
                                        System.out.println();
                                } 
                                 
                                for(int i = 0; i < ArraydeListas.size(); i++){
                                    for(int j = 0; j < ArraydeListas.get(i).size(); j++){
                                        areaTextoMatriz.append(MO[i][j]+ "  ");
                            }
                            areaTextoMatriz.append("\n");
                //            Double a = (Grafos.ArrayL.get(partida.getSelectedIndex()).get(llegada.getSelectedIndex()));
                //            barra.setText(a.toString());
                        }
                                
//                                for(int i = 0; i < ArraydeListas.size(); i++){
//                                    for(int j = 0; j < ArraydeListas.get(i).size(); j++){
//                                       
//                                        if(ArraydeListas.get(i).get(j)!=0){
//                                             a[cont]=i;
//                                             b[cont]=j;
//                                        } cont++;
//                                    }
//                           
//                                }
//                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
 
 
 }
   
}
