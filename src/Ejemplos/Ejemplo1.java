import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo1 extends JFrame implements ActionListener{
JButton boton1;

    public Ejemplo1(){

        //Asignar layout absoluto
        setLayout(null);

        //Posición y Tamaño de la ventana
        setBounds(0, 0, 450, 350);

        //Título de la Aplicación
        setTitle("Ejemplo 1: Botón");

        //No redimensionable
        setResizable(false);

        //Cerrar el proceso al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Creación del botón
        boton1 = new JButton("Pulsa aquí para salir");

        //Dimensiones del botón
        boton1.setBounds(300, 250, 100, 30);

        //Añado el botón
        add(boton1);

        //Añado el ActionListener al botón
        boton1.addActionListener(this);

        //Muestro el JFrame
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Si he pulsado el botón
        //if (e.getSource().equals(boton1))
        if (e.getSource() == boton1)
            //Salgo de la aplicación
            System.exit(0);
    }

    public static void main(String[] args) {
        Ejemplo1 xd = new Ejemplo1();
    }
}
