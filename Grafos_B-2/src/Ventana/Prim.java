// algoritmo de prim
package Ventana;

import java.util.ArrayList;


public class Prim {
    Double Matriz[][];
    int tama;
    public Prim(){
        
    }
    
    private void Genera(Double A[][], int n){
        Matriz = new Double [n][n];
        Matriz = A;
        tama = n;
    }
    
    private void PRIM(){
        int V[] = new int[tama];
        ArrayList<Integer> U = new ArrayList();
        ArrayList<Integer> V_U = new ArrayList();
        for(int i = 0; i < tama; i++){
            V[i] = i;
        }
        U.add(0);
        while(V.equals(V_U)){
//            for(){
//                for(){
//                    
//                }
//            }
        }
    }
}
