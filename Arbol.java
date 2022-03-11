/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.LinkedList;

/**
 *
 * @author knowledgeattic
 */
public class Arbol {
    
    //CREAMOS UNA VARIABLE GLOBAL Y LA INCIAMOS COMO NULL EN UN COSTRUCTOR DE LA CLASE ARBOL
    public Nodo raiz;
    public Arbol(){
        raiz = null;
    }
    
    //CREAMOS UN METODO PARA INSERTAR FRUTAS EN EL ARBOL
    public void insertar(int i, Object fruta){
        Nodo n = new Nodo(i);
        n.contenido=fruta;
        
        //SI LA RAIZ ES NULA SIGNIFICA QUE NO HA EMPEZADO A CRECER EL ARBOL
        if (raiz==null) {
            raiz=n;
        }else{
            // DE LO CONTRARIO CREAMO UN NO AUXILIAR ARA BUSCAR EN DONDE COLOCARLO, SI A LA DER O IZQ
            Nodo aux = raiz;
            //MIENTRAS EL AUXILIAR NO SEA NULO HAGAMOS QUE EL PADRE DEL NODO SEA EL AUXILIAR,
            //ASI VAMOS SUBIENDO EN EL ARBOL
            while(aux != null){
                
                n.padre = aux;
                //VALIDAMOS, SI EL INDICE ES MAYOR ENTONCES VA A LA DERECHA
                if (n.llave >= aux.llave) {
                    aux=aux.derecha;
                }else{
                    //SI NO VA A LA IZQUIERDA
                    aux=aux.izquierda;
                }
            }
            //si la llave del nodo actual es menor al indice del nodo padre entonces enlazo la direccion
            //dentro del arbol
            if (n.llave < n.padre.llave) {
                n.padre.izquierda = n;
            }else{
                n.padre.derecha=n;
            }
        }
    }
    
    //CREAREMOS UN METODO PRA RECORRER inorder LA RAMA IZQUIERDA Y LUEGO LA DERECHA PARA
    //PARA ORDENAR LOS INDICES DE CADA NODO
    
    public void recorrer(Nodo n){
        if (n != null) {
            recorrer(n.izquierda);
            System.out.println("Indice " +n.llave+" fruta " + n.contenido);
            recorrer(n.derecha);
        }
    }
    
  
    // CREAMOS UN CONSTRUCTOR
    private class Nodo{
    
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        public Object contenido;
        
        //CREAMOS UN CONSTRUCTOR QUE RECIBA UN INDICE PERO NO LOS DEMAS ATRIBUTOS
        public Nodo(int indice){
        llave = indice;
        derecha=null;
        izquierda=null;
        padre=null;
        contenido=null;
    }

    }
    
}
