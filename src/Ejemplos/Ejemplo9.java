package Ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo9 extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu menuOpciones, menuTamano, menuColor, salir;
    JMenuItem tamano1, tamano2, color1, color2;
    public Ejemplo9(){

        //Barra menú
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        //Crear menú de opciones
        menuOpciones = new JMenu("Opciones");
        menuBar.add(menuOpciones);

        //Creo menus de tamaño y color
        menuTamano = new JMenu("Tamaño");
        menuOpciones.add(menuTamano);
        menuColor = new JMenu("Color");
        menuOpciones.add(menuColor);
        //Añado items de menú
        tamano1 = new JMenuItem("640x680");
        menuTamano.add(tamano1);
        tamano1.addActionListener(this);
        tamano2 = new JMenuItem("1024x768");
        menuTamano.add(tamano2);
        tamano2.addActionListener(this);
        color1 = new JMenuItem("Rojo");
        menuColor.add(color1);
        color1.addActionListener(this);
        color2 = new JMenuItem("Verde");
        menuColor.add(color2);
        color2.addActionListener(this);

        //Accion salir
        salir = new JMenu("Salir");
        menuBar.add(salir);
        //Configurar y mostrar JFrame
        initPantalla();
    }

    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("Ejemplo 9"); //Título del JFrame
        setSize(300, 200); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    public static void main(String[] args) {
        new Ejemplo9();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //En función del item de menú ejecuto acción
        if(e.getSource().equals(tamano1)){
            setSize(640, 480);
        } else if (e.getSource().equals(tamano2)) {
            setSize(1024, 768);
        } else if (e.getSource().equals(color1)) {
            getContentPane().setBackground(Color.red);
        } else if (e.getSource().equals(color2)) {
            getContentPane().setBackground(Color.green);
        } else if (e.getSource().equals(salir)) {
            System.exit(0);
        }
    }
}
