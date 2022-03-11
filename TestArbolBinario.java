import estructuras.Arbol;
import java.util.Scanner;

/**
 * 
 * @author Jonathan De La Cruz Huerta
 */
public class TestArbolBinario {
    public static void main(String[] args) {

        Arbol arbol = new Arbol();
        
        arbol.insertar (9,"Manzanas");
        arbol.insertar(3,"Peras");
        arbol.insertar(5,"Uvas");
        arbol.insertar(2,"Naranjas");
        
        arbol.recorrer(arbol.raiz);
        
        
    }
    /*
    public static void main(String args[]){
        int menu,dato;
        Scanner in = new Scanner(System.in);
        ArbolBinario a1= new ArbolBinario();
        a1.insertar(1);
        a1.insertar(4);
        a1.insertar(7);
        a1.insertar(8);
        a1.insertar(9);
        
        a1.inOrden(a1.getRaiz());
        /*
        do{
            System.out.println("Menu\n1)Agregar Nodo\n2)PreOrden\n3)inOrden\n3)PostOrden\n4)Numero de nodos");
            menu=in.nextInt();
            switch(menu){
                case 0:
                    in.nextLine();
                    System.out.println("Ingrese un dato: ");
                    dato=in.nextInt();
                    a1.insertar(dato);
                    break;
                case 1:
                    System.out.println(a1.preOrden(a1.getRaiz()));
                    break;
                case 2:
                    System.out.println(a1.inOrden(a1.getRaiz()));
                    break;
                case 3:
                    System.out.println(a1.postOrden(a1.getRaiz()));
                    break;
                case 4:
                    System.out.println(a1.getNumNodos());
                    break;
                default: System.out.println("Valor invalido");
            }
        }while(menu!=0);
    }*/
}
