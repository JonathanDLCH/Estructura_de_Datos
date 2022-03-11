
package Ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Fondo extends javax.swing.JPanel {
    String Nombre = "JGrafos", completo = "v 2.0 Beta";
    JLabel icono;
    public Fondo(){
        setLayout(null);
    }
    
    public void paint(Graphics e){
        ImageIcon imagen = new ImageIcon(getClass().getResource("Fondo.jpg"));
        e.drawImage(imagen.getImage(),0,0,this.getWidth(),this.getHeight(),this);
        setOpaque(false);
        super.paintComponent(e);
        e.setColor(Color.WHITE);
        e.setFont(new Font("Arial", Font.BOLD, 100));
        e.drawString(Nombre, (this.getWidth()/2)+200, this.getHeight()/3);
        e.setColor(Color.white);
        e.setFont(new Font("Arial", Font.BOLD, 60));
        e.drawString(completo, (this.getWidth()/2)+200, (this.getHeight()/3)+100);
        ImageIcon Logo = new ImageIcon(getClass().getResource("Logo1.1.png"));
        e.drawImage(Logo.getImage(), (this.getWidth()/2)-50, (this.getHeight()/3)-100, 200, 200, this);
    }
}
