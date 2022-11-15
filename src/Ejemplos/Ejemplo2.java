import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo2 extends JFrame implements ActionListener {

    JButton boton1, boton2, boton3 = new JButton();

    public Ejemplo2(){

        //Asignar layout absoluto
        setLayout(null);

        //Posición y Tamaño de la ventana
        setBounds(0, 0, 350, 200);

        //Título de la Aplicación
        setTitle("Ejemplo 2: Botones");

        //No redimensionable
        setResizable(false);

        //Cerrar el proceso al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //TODO creación de botones
        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
        boton3 = new JButton("Botón 3");

        //Posición y tamaño de botones
        boton1.setBounds(10, 100, 90, 30);
        boton2.setBounds(110, 100, 90, 30);
        boton3.setBounds(210, 100, 90, 30);

        //Añado los botones
        add(boton1);
        add(boton2);
        add(boton3);

        //Añadir ActionListener para los botones
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);

        //Muestro el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejemplo2();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(boton1))
            setTitle("Botón 1");
        else if (e.getSource().equals(boton2))
            setTitle("Botón 2");
        else if (e.getSource().equals(boton3))
            setTitle("Botón 3");
    }
}
