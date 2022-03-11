
package Ventana;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Grafos.Grafos;

public class Ventana extends JPanel implements ActionListener{
    Toolkit s = Toolkit.getDefaultToolkit();
    Dimension pantalla = s.getScreenSize();
    //VARIABLES INSTANCIADAS DE CLASES*****************************************
    JLabel l1;
    JButton b1,b2,b3,b4,b5,salir;
    JPanel b_lateral,b_inferior;
    Grafos principal;// renombrer con la nueva biblioteca
    //*************************************************************************
    Ventana(){
        setLocation(10,10);
        setSize(1200,700);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        //setUndecorated(true);
        Paneles();
        Botones();
    }
    
    private void Paneles(){
        b_lateral = new JPanel();
        b_inferior = new JPanel();
        principal = new Grafos();// cambiar por la nueva biblioteca
        
        b_lateral.setBounds(0, 0, 200, 700);
        b_lateral.setLayout(null);
        b_lateral.setBackground(new Color(33,97,140));
        //add(b_lateral);
        b_inferior.setBounds(200, 670, 1000, 30);
        b_inferior.setLayout(null);
        b_inferior.setBackground(new Color(26, 82, 118));// cambiar color
        add(b_inferior);
        principal.setBounds(0, 0, 1000, 670);
        //principal.setBackground(Color.WHITE);
        add(principal);
    }
    
    private void Botones(){
        b1 = new JButton("◀ Regresa");
        b2 = new JButton("Eliminar nodo");
        b3 = new JButton("Eliminar Todo");
        b4 = new JButton("Terminar");
        b5 = new JButton("Herramientas de Analisis");
        salir = new JButton("Opciones");
        
        b1.setBounds(0,60,200,40);
        b1.setBackground(new Color(33,97,140));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        //b_lateral.add(b1);
        b2.setBounds(0,100,200,40);
        b2.setBackground(new Color(33,97,140));
        b2.setForeground(Color.white);
        //b_lateral.add(b2);
        b3.setBounds(0,140,200,40);
        b3.setBackground(new Color(33,97,140));
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        //b_lateral.add(b3);
        salir.setBounds(0,180,200,40);
        salir.setBackground(new Color(33,97,140));
        salir.setForeground(Color.white);
        //b_lateral.add(salir);
    }//agregar acciones
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            JOptionPane.showMessageDialog(null, "Hola");
        }else{
            if(e.getSource() == b2){
                
            }else{
                if(e.getSource() == b3){
                    //principal.Eliminatodo();
                }else{
                    if(e.getSource() == b4){
                        
                    }else{
                        if(e.getSource() == b5){
                            
                        }else{
                            if(e.getSource() == salir){
                                
                            }
                        }
                    }
                }
            }
        }
    }
}
