/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Grafos.Grafos;
import java.awt.Dimension;
//import static Grafos.Grafos.nodo;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.ActiveEvent;
import java.awt.Color;
import java.awt.geom.Point2D;

/**
 *
 * @author Hacks_s
 */
public final class PanelExpancionMinima extends JPanel {
   
    //private ArrayList<Integer> numeroIDNodo;
    private Ellipse2D Elipse;
    Grafos principal;
    ArbolEM w;
    ArrayList<ArrayList<Double>> ArraydeListas;
    ArrayList<NodosArbolExpancionMinima> Nodos;
    ArrayList<ArrayList<NodosArbolExpancionMinima>> arrayNodos;
    JButton GenerarArbol,PintarNuevamente;
    int width=730;
    int high=1500;
    int NodosAdyacentes;
    int diametro=40;
    int posicionInicialNodoX=730;
    int constanteY=60;
    Point2D PuntoAux,PuntoAux2,PuntoAux3;
    
    PanelExpancionMinima(){}
    
    public PanelExpancionMinima(Grafos principal){
        
        
        this.principal=principal;
        Nodos=new ArrayList<>();
        
        
        GenerarArbol=new JButton("Generar Arbol");
        GenerarArbol.setBounds(690,20,140,20);
        add(GenerarArbol);
        GenerarArbol.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            ArraydeListas = Grafos.ArrayL;
                            //JOptionPane.showMessageDialog(null,"Tamaño de nodo="+Grafos.nodo.size());
                            double[][] MatrizTriangularSuperior=new double[ArraydeListas.size()][ArraydeListas.size()];
                            ArrayList<Integer> Array_de_X = new ArrayList<>();
                            ArrayList<Integer> Array_de_Y = new ArrayList<>();
                            MatrizTriangularSuperior=Operaciones();
                            
                            for(int i = 0; i < principal.Nodos().size(); i++){
                                for(int j = i; j < principal.Nodos().size(); j++){
                                    if(MatrizTriangularSuperior[i][j]!=0){
                                        int x1,x2,y1,y2,x3,y3,cadena;
                                        String cadenaAux;
                                        Graphics2D gr = (Graphics2D) getGraphics();
                                        PuntoAux=Grafos.nodo.get(i).getPunto();
                                        PuntoAux2=Grafos.nodo.get(j).getPunto();
                                        x1=(int)PuntoAux.getX();
                                        x2=(int)PuntoAux2.getX();
                                        y1=(int)PuntoAux.getY();
                                        y2=(int)PuntoAux2.getY();
                                        x3 = (x1+x2)/2;
                                        y3 = (y1+y2)/2;
                                        cadena=(int)MatrizTriangularSuperior[i][j];
                                        cadenaAux=Integer.toString(cadena);
                                        gr.setColor(Color.BLACK);
                                        gr.drawLine(x1+20,y1+20,x2+20,y2+20);
                                        gr.setColor(Color.RED);
                                        gr.drawString(cadenaAux, x3+20, y3+20);
                                    }
                                }
                                
                            }
                            for(int i = 0; i < Grafos.nodo.size(); i++){
                                int x,y;
                                Graphics2D gr = (Graphics2D) getGraphics();
                                PuntoAux3=Grafos.nodo.get(i).getPunto();
                                x=(int)PuntoAux3.getX();
                                y=(int)PuntoAux3.getY();
                                Elipse=new Ellipse2D.Double(x,y,diametro,diametro);
                                gr.setColor(Color.BLACK);
                                gr.drawString(Integer.toString(i), x-5, y-5);
                                gr.setColor(Color.BLUE);
                                gr.fill(Elipse);
                                
                            }
                        }
        });
        
     PintarNuevamente=new JButton("Repintar");
     PintarNuevamente.setBounds(850,20,140,20);
     add(PintarNuevamente);
     
     PintarNuevamente.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            repaint();
                        }
     });
    }
    
    
    public double[][] Conversion(ArrayList<ArrayList<Double>> ArraydeListas){
        int n = ArraydeListas.size();
        double [][]MatrizConvertida = new double [n][n];
        for(int i = 0; i < ArraydeListas.size(); i++){
            for(int j = 0; j < ArraydeListas.get(i).size(); j++){
               MatrizConvertida[i][j] = ArraydeListas.get(i).get(j);
            }
        } 
        return MatrizConvertida;
    }
    public double[][] Ma(double[][] matriz){
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
    public double[][] Operaciones(){
    
     ArraydeListas = Grafos.ArrayL;
     double[][] w=new double[ArraydeListas.size()][ArraydeListas.size()];
     double[][] wAux=new double[ArraydeListas.size()][ArraydeListas.size()];
     double[][] wAux2=new double[ArraydeListas.size()][ArraydeListas.size()];
     double[][] wAux3=new double[ArraydeListas.size()][ArraydeListas.size()];
     w=Conversion(ArraydeListas );
     wAux=Ma(w);
        for(int i = 0; i < ArraydeListas.size(); i++){
            for(int j = 0; j < ArraydeListas.get(i).size(); j++){
                System.out.print(wAux[i][j]+"  ");
                                                        
            }System.out.println();
        } 
     wAux2=principal.AlgPrim(wAux);
     System.out.println("MATRIZ RESULTADO");
     //JOptionPane.showMessageDialog(null, "El tamaño de la matriz sera"+principal.Nodos().size());
        for(int i = 0; i <principal.Nodos().size(); i++){
            for(int j = 0; j < principal.Nodos().size(); j++){
                System.out.print(wAux2[i][j]+"  ");
                
            }System.out.println();
        }
        for(int i = 0; i < principal.Nodos().size(); i++){
            for(int j = i; j < principal.Nodos().size(); j++){
                wAux3[i][j]=wAux2[i][j];
            }
        }
        
    return wAux3;
    }
    public ArrayList<Integer> retornarArraydeX(double [][]matriz){
        ArrayList<Integer> NumerosX = new ArrayList<>();
        for(int i = 0; i < principal.Nodos().size(); i++){
            for(int j = i; j < principal.Nodos().size(); j++){
                    if(matriz[i][j]!=0){
                        NumerosX.add(i);
                    }
            }
        }
        return NumerosX;
    }
    public ArrayList<Integer> retornarArraydeY(double [][]matriz){
        ArrayList<Integer> NumerosY = new ArrayList<>();
            for(int i = 0; i < principal.Nodos().size(); i++){
                for(int j = i; j < principal.Nodos().size(); j++){
                    if(matriz[i][j]!=0){
                        NumerosY.add(j);
                    }
            }
        }
        return NumerosY;
    }
    public int NumeroRepeticionesX(ArrayList<Integer> Array_de_X,int IDNodo){
        int cont=0;
            for(int j=0;j<Array_de_X.size();j++){
                if(IDNodo==Array_de_X.get(j)){cont++;}
            }
        return cont;
    }
    public void AlmacenarInformacion(ArrayList<Integer>Array_de_X){
         
        for(int i=0;i<Grafos.nodo.size();i++){
            for(int j=0;j<Array_de_X.size();j++){
                //Nodos.
            }
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Graphics2D grafo = (Graphics2D) g;
        
    
    }

   
}
