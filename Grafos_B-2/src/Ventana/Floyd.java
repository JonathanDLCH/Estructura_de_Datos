package Ventana;

import Grafos.Matriz;
import java.util.*;
public class Floyd {
    public ArrayList<ArrayList<Double>> ArraydeListas;
    public int matriz[][];
    

    Floyd(ArrayList<ArrayList<Double>> ArraydeListas) {
        this.ArraydeListas = ArraydeListas;
    }

    
    //funcion que recibe una matriz y lo convierte a arraylist
   public void LlenadoArraylist(double [][] matriz){
        int i, j;
        for(i = 0; i< matriz.length; i++){
            matriz[i][i] = 0;
            for(j = 0; j< matriz.length; j++)
                if(matriz[i][j] == 0 && i!= j)
                    matriz[i][j]= Double.POSITIVE_INFINITY;   
        }     
        
        for( i = 0; i < matriz.length; i++){
            
           ArraydeListas.add(new ArrayList<Double>());
            for( j = 0; j < matriz.length; j++){
      //              ArraydeListas.get(i).add(matriz[i][j]);
            }
        } 

    }
    
    //funcion que convierte el arraylist a matriz
    
    //funcion que convierte el arraylist a matriz retornando la matriz
    public double[][] ConvierteArrayenMatrizReturn(ArrayList<ArrayList<Double>> ArraydeListas){
        int n = ArraydeListas.size();
        double [][]MatrizConvertida = new double [n][n];
        for(int i = 0; i < ArraydeListas.size(); i++){
            for(int j = 0; j < ArraydeListas.get(i).size(); j++){
               MatrizConvertida[i][j] = ArraydeListas.get(i).get(j);
            }
        } 
        return MatrizConvertida;
    }
    
    
   //parte que funciona 
    public static ArrayList<ArrayList<Double>> Floyd( ArrayList<ArrayList<Double>> ArraydeListas){
       // int n = matriz.length;
        //int c [][]= matriz; 
        int i, k, j;
        i = k = j = 0;
        for(i = 0; i< ArraydeListas.size(); i++){
            ArraydeListas.get(i).set(i, 0.0);
            for(j = 0; j< ArraydeListas.get(i).size(); j++)
                if(ArraydeListas.get(i).get(j) == 0 && i!= j)
                    ArraydeListas.get(i).set(j, Double.POSITIVE_INFINITY);
        }     
        for(k = 0; k < ArraydeListas.size(); k++){
            for(i = 0; i < ArraydeListas.size(); i++)
                for(j = 0; j < ArraydeListas.get(i).size(); j++){
                    if(ArraydeListas.get(i).get(j) > ArraydeListas.get(i).get(k) + ArraydeListas.get(k).get(j))
                        ArraydeListas.get(i).set(j, ArraydeListas.get(i).get(k) + ArraydeListas.get(k).get(j));
                }
            
        }
        return ArraydeListas;
        //imprimir(ArraydeListas);
        
    }
    public void imprimir(ArrayList<ArrayList<Double>> ArraydeListas){
        //ArrayList<String> regreso = new ArrayList<String>();
        for(int i = 0; i < ArraydeListas.size(); i++){
            System.out.println();
            for(int j = 0; j < ArraydeListas.get(i).size(); j++)
                //regreso.add(ArraydeListas.get(i).toString());
                System.out.print( ArraydeListas.get(i).get(j) + "  ");
               // System.out.print(matriz[i][j]+ "  ");
                
        }
        //return regreso;
    }
    
   /* @Override
    public String toString(){
        ArrayList<ArrayList<Double>> matriz = ArraydeListas;
        String matirz = null;
        return matirz;
    }

   /* String imprimir(ArrayList<Matriz> matriz) {
        
    }*/

    
}

