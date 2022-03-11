// clase para guardar y abrir los proyectos que se realicen en jgrafos
package Ventana;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Grafos.Nodo;
import Grafos.Grafos;
import Grafos.Linea;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.JOptionPane;


public class Guardado implements Serializable{
    ObjectOutputStream salida;
    
    public Guardado(){
        
    }
    
    public void GuardarNodos(ArrayList<Nodo> auxiliar1, String nombre) throws IOException{
        try{
            salida = new ObjectOutputStream(new FileOutputStream("C:\\Users\\EfraíndeJesús\\Desktop\\"+nombre + ".JG"));
            salida.writeObject(auxiliar1);
            salida.flush();
        }catch(FileNotFoundException error){
            JOptionPane.showMessageDialog(null, "fichero corrupto o no existente");
        }catch(IOException err){
            JOptionPane.showMessageDialog(null, "Error al crear el archivo");
        }finally{
            salida.close();
            System.out.println("archivo creado...");
        }
    }
    
}
