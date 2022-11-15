/**import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo5_Secundaria extends JDialog implements ActionListener {

    JButton boton;
    JLabel label;

    /* El primer parámetro le dice quién es el padre y el segundo sí el modal es true o false
    /* El modal indica si puedo volver a la ventana padre sin cerrar la secundaria (false) o no (true)
    public Ejemplo5_Secundaria(Ejemplo5_Principal parent, boolean modal){

        //Invoca a la clase superior
        super(parent, modal);

        //Asignar layout absoluto
        setLayout(null);

        //Posición y Tamaño de la ventana
        setBounds(430, 10, 410, 210);

        //Título de la Aplicación
        setTitle("Ejemplo 5: Diálogos morales");

        //No redimensionable
        setResizable(false);

        //Etiqueta
        label = new JLabel("Esta es la ventana secundaria");
        label.setBounds(115, 60, 200, 30);
        add(label);

        //Botón
        boton = new JButton("Volver");
        boton.setBounds(105, 110, 200, 40);
        add(boton);

        boton.addActionListener(this);

        //Muestro el JDialog
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(boton)){
            setVisible(false);
            //dispose();
        }
    }
}
*/