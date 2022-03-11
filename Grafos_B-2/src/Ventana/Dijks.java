package Ventana;

import java.util.ArrayList;


public class Dijks {

    public ArrayList<Integer> arrayS;//guarda posiciones
    public ArrayList<Integer> arrayV_S;//guarda posiciones
    public int w = 0;
    public String new_ruta = "";
    public double[][]matriz;
    public Dijks(){
        arrayS = new ArrayList<Integer>();
        arrayV_S = new ArrayList<Integer>();
        matriz = null;
    }
    
    public double [][] Dijk(double[][]matriz, int nodo_ini, int nodo_fin){

        arrayS.clear();
        arrayV_S.clear();
        for(int i = 0; i < matriz.length; i++)
            for(int j = 0; j < matriz.length; j++)
                if(matriz[i][j] == 0 && i!= j)
                    matriz[i][j] = Double.POSITIVE_INFINITY;
        
        double[][]matriz_final = matriz;
        arrayS.add(nodo_ini);
        
        
        for(int j = 0; j < matriz_final.length; j++){
            if(j != nodo_ini)
                arrayV_S.add(j);
            
        }  
        
        for(int i = 0; i < matriz.length; i++){
            w = Elew( arrayS, arrayV_S,nodo_ini, matriz_final,  w);
            
            arrayS = As(arrayS, arrayV_S,nodo_ini, matriz_final, w);
            arrayV_S = minimo(arrayS, arrayV_S, nodo_ini, matriz_final, w);
             for(int j = 0; j < arrayV_S.size(); j++){
                    if(matriz_final[nodo_ini][arrayV_S.get(j)] > matriz_final[nodo_ini][w] + matriz_final[w][arrayV_S.get(j)])
                        matriz_final[nodo_ini][arrayV_S.get(j)] = matriz_final[nodo_ini][w] + matriz_final[w][arrayV_S.get(j)];
                }
            }
        imprimir(matriz_final);
        return matriz_final;
    }
    
    ///minimo de matriz
    public ArrayList<Integer> minimo(ArrayList<Integer> arrayS, ArrayList<Integer> arrayV_S,int nodo_ini, double[][]matriz, int w){
           
        for(int i = 0; i < arrayV_S.size(); i++)
            for(int j = 0; j < arrayS.size(); j++){
                if(arrayV_S.get(i) == arrayS.get(j)){
                    arrayV_S.remove(i); 
                }  
            }
        for(int i = 0; i< arrayV_S.size(); i++ )
            System.out.print(arrayV_S.get(i));
        System.out.println();
        
        return arrayV_S;
        
    }
    public ArrayList<Integer> As(ArrayList<Integer> arrayS, ArrayList<Integer> arrayV_S,int nodo_ini, double[][]matriz, int w){
        arrayS.add(w);

        return arrayS;
    }
    
    public int Elew(ArrayList<Integer> arrayS, ArrayList<Integer> arrayV_S,int nodo_ini, double[][]matriz, int w){
        double aux = Double.POSITIVE_INFINITY;
        for(int j = 0 ; j < arrayV_S.size(); j++){
            
            if(aux >= matriz[nodo_ini][arrayV_S.get(j)]){
                aux = matriz[nodo_ini][arrayV_S.get(j)];
                w = arrayV_S.get(j);
            }               
        }
        
        return w;
    }
    
    ///imrpimir matriz
    public void imprimir(double[][]matriz_final){
        for(int i = 0; i < matriz_final.length; i++){
            for(int j = 0; j < matriz_final.length; j++)
                System.out.print(matriz_final[i][j] + "   ");
            System.out.println();
        }
    }    
    
}
