import java.io.*;
import javax.swing.JOptionPane;

public class Archivo{
    File archivo= new File("NGrafos.bin");
	public void escribirGrafo(Grafo grafo) {
            try {
                ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(archivo));
                writer.writeObject(grafo);
                writer.close();
                JOptionPane.showConfirmDialog(null, "Se creo el archivo");
            }catch(IOException ex){
                System.out.println("Error al guardar el archivo!!! \n");
            }
	}
	
	@SuppressWarnings("unchecked")	
	public Grafo retornarDatosGrafo(){
            Grafo grafo = null;
            try{
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(new File("NGrafos.bin")));
                Object obj = reader.readObject();
                grafo = (Grafo) obj;
                reader.close();
                System.out.println(""+grafo);
            }catch(IOException | ClassNotFoundException ex){
                    System.out.println(ex.getMessage());
            }
            return grafo;
	}
}
