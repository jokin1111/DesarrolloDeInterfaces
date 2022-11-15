import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo2B extends JFrame implements ActionListener {

    JButton[] boton = new JButton[3];

    int x = 10;

    public Ejemplo2B(){

        //Asignar layout absoluto
        setLayout(null);

        //Posición y Tamaño de la ventana
        setBounds(0, 0, 350, 200);

        //Título de la Aplicación
        setTitle("Ejemplo 2B: Pulsa un botón");

        //No redimensionable
        setResizable(false);

        //Cerrar el proceso al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //TODO creación de botones
        for (int i = 0; i < boton.length; i++){
            //Crear el botón
            boton[i] = new JButton(String.valueOf(i + 1));
            //Dimensionar botón
            boton[i].setBounds(x, 100, 90, 30);
            x += 100;
            //Action listener
            boton[i].addActionListener(this);
            //Añadir botón
            add(boton[i]);
        }

        //Muestro el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejemplo2B();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < boton.length; i++){
            if (e.getSource().equals(boton[i]))
                setTitle(String.valueOf("Ejemplo 2B: Botón " + String.valueOf(i+1)));
                //setTitle(boton[i].getText());
        }
    }
}
