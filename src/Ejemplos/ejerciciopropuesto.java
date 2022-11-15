package Ejemplos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejerciciopropuesto extends JFrame implements ActionListener {

    JTextField tamano1, tamano2;

   public ejerciciopropuesto(){
       initJtext();
       initPantalla();
   }
   private void initJtext(){
       tamano1=new JTextField();
       tamano1.setBounds(120,10,150,20);
       add(tamano1);
       tamano2=new JTextField();
       tamano2.setBounds(120,40,150,20);
       add(tamano2);
   }
    private void initPantalla() {
        setLayout(null); //Layout absoluto
        setTitle("Ejemplo 9"); //Título del JFrame
        setSize(600, 700); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame

    }

    public static void main(String[] args) {
       new ejerciciopropuesto();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
