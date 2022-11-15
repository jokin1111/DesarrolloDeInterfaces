package Ejemplos;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;

public class Ejemplo10 extends JFrame implements ChangeListener {

    private JCheckBox checkBoxEs, checkBoxEn, checkBoxDe;
    private JLabel label1;

    public Ejemplo10(){
        //Añado los checkbox y sus listeners
        checkBoxEs = new JCheckBox("Español");
        checkBoxEs.setRolloverEnabled(false);
        checkBoxEs.setBounds(10,10,150,30);
        checkBoxEs.addChangeListener(this);
        add(checkBoxEs);

        checkBoxEn = new JCheckBox("Inglés");
        checkBoxEn.setRolloverEnabled(false);
        checkBoxEn.setBounds(10,50,150,30);
        checkBoxEn.addChangeListener(this);
        add(checkBoxEn);

        checkBoxDe = new JCheckBox("Alemán");
        checkBoxDe.setRolloverEnabled(false);
        checkBoxDe.setBounds(10,90,150,30);
        checkBoxDe.addChangeListener(this);
        add(checkBoxDe);

        label1 = new JLabel("Idiomas: ninguno.");
        label1.setBounds(10,130,250,30);
        add(label1);


        initPantalla();
    }

    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("Ejemplo 10"); //Título del JFrame
        setSize(300, 200); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        boolean check = checkBoxEs.isSelected() || checkBoxEn.isSelected() || checkBoxDe.isSelected();
        String texto1 = "Idiomas: ";
        if(checkBoxEs.isSelected() ) {
            texto1 += "Español, ";
        }
        if(checkBoxEn.isSelected())
            texto1 += "Ingles, ";
        if(checkBoxDe.isSelected())
            texto1 += "Alemán, ";
        texto1 = texto1.substring(0, texto1.length() - 2) + ".";
        label1.setText(check ? texto1 : "Idiomas: ninguno.");

        //TODO 1: Al pasar por un checkbox no tiene que cambiar el texto
        //TODO 2: Sí hay más de un idioma, el último debería ser " y Alemán"
        //TODO 3: El texto debe acabar con un punto
        //TODO 4: Si solo hay un idioma, no debe poner idiomas
    }

    public static void main(String[] args) {
        new Ejemplo10();
    }

}
