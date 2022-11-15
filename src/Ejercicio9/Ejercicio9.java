package Ejercicio9;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio9 extends JFrame implements ChangeListener {
    JLabel label1, label2;
    JCheckBox checkBox1;
    JButton boton1;
    public Ejercicio9(){
        initJLabel();
        initJCheckbox();
        initJButton();
        initPantalla();
    }

    private void initJLabel(){
        label1 = new JLabel("¿Acepta las condiciones del servicio?");
        label1.setBounds(10, 10, 300, 50);
        add(label1);

        label2 = new JLabel("Has aceptado las condiciones");
        label2.setBounds(30, 150, 300, 50);
        label2.setVisible(false);
        add(label2);
    }
    private void initJCheckbox(){
        checkBox1 = new JCheckBox("Sí");
        checkBox1.setBounds(90, 45, 50, 50);
        checkBox1.addChangeListener(this);
        add(checkBox1);
    }
    private void initJButton(){
        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 100, 200, 40);
        boton1.setEnabled(false);
        add(boton1);
    }

    private void initPantalla() {
        setLayout(null); //Layout absoluto
        setTitle("Ejemplo 9"); //Título del JFrame
        setSize(270, 250); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame

    }

    public static void main(String[] args) {
        new Ejercicio9();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        boton1.setEnabled(checkBox1.isSelected());
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(boton1)){
                    label2.setVisible(true);
                }
            }
        });
    }
}
