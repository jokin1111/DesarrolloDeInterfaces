import javax.swing.*;

public class Practica1_3 extends JFrame {

    JLabel etiqueta;

    JButton boton1, boton2;

    public Practica1_3(){

        setLayout(null);

        setBounds(0, 0, 350, 200);

        setTitle("Ejemplo 2: Botones");

        setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        etiqueta = new JLabel("hola");
        etiqueta.setBounds(0, 15, 50, 50);
        add(etiqueta);

        boton1 = new JButton("CARNE");
        boton1.setBounds(0, 0, 50, 50);
        add(boton1);

        boton2 = new JButton("CARNE");
        boton2.setBounds(30, 30, 50, 50);
        add(boton2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Practica1_3();
    }

}
