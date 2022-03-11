
package Grafos;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Imagen extends javax.swing.JFrame{
    BufferedImage imagen;
    Graphics2D preimagen;
    File archivo;
    JPanel p1;
    
    
    public Imagen(Graphics2D dibujo, int x, int y){
        // para la imagen
        imagen = new BufferedImage(x,y,BufferedImage.TYPE_INT_RGB);
        preimagen = imagen.createGraphics();
        preimagen = dibujo;
        
        try{
            ImageIO.write(imagen, "png", new File("Imagen.png"));
        }catch(IOException error){
            System.out.println("Error de escritura");
        }
        // para la pantalla
        
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
    }
    
    private void Pane(){
        p1 = new JPanel();
        
        p1.setBounds(0, 0, 500, 500);
        add(p1);
        
    }
    
    
    
}
