import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo5_Principal extends JFrame implements ActionListener {

    JButton boton;

    JLabel label;

    public Ejemplo5_Principal(){

        //Asignar layout absoluto
        setLayout(null);

        //Posición y Tamaño de la ventana
        setBounds(10, 10, 410, 210);

        //Título de la Aplicación
        setTitle("Ejemplo 5: Diálogos morales");

        //No redimensionable
        setResizable(false);

        //Cerrar el proceso al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Etiqueta
        label = new JLabel("Esta es la ventana principal");
        label.setBounds(115, 60, 200, 30);
        add(label);

        //Botón
        boton = new JButton("Haz click aquí");
        boton.setBounds(105, 110, 200, 40);
        add(boton);

        boton.addActionListener(this);

        //Muestro el JFrame
        setVisible(true);

    }

    public static void main(String[] args) {
        new Ejemplo5_Principal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(boton)){
            //new Ejemplo5_principal(this, true);

        }
    }
}
