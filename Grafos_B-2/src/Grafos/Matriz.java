package Grafos;

public class Matriz {

    private int nodoUno;
    private int nodoDos;
    private int peso;
    private int aristaN;
    public Matriz(int n1, int n2, int p, int arista) {

        nodoUno = n1;
        nodoDos = n2;
        peso = p;
        aristaN = arista;

    }

    public int nodoUno() {
        return nodoUno;
    }

    public int nodoDos() {
        return nodoDos;
    }
    
    public void setPeso(int peso){
    this.peso = peso;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public int aristaN(){
        return aristaN;
    }

}
