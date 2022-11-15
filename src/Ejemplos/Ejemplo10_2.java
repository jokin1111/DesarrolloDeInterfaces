package Ejemplos;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ejemplo10_2 extends JFrame implements ChangeListener {

    private JCheckBox checkBoxEs, checkBoxEn, checkBoxDe;
    private JLabel label1;


    public Ejemplo10_2(){
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
        ArrayList<String> idiomas = new ArrayList<String>();
        if(checkBoxEs.isSelected())  idiomas.add("Español"); else idiomas.remove("Español");
        if(checkBoxEn.isSelected())  idiomas.add("Ingles"); else idiomas.remove("Ingles");
        if(checkBoxDe.isSelected())  idiomas.add("Alemán"); else idiomas.remove("Alemán");
        switch (idiomas.size()){
            case 0: label1.setText("Idiomas: ninguno"); break;
            case 1: label1.setText("Idioma: " +idiomas.get(0) + ".");break;
            default: label1.setText(setTexto(idiomas) + ".");
        }
    }

    public static void main(String[] args) {
        new Ejemplo10_2();
    }

    private String setTexto(ArrayList<String> idiomas){
        String texto = "Idiomas: ";
        texto += (idiomas.size() == 2) ? idiomas.get(0)+" y "+idiomas.get(1) :
                idiomas.get(0)+", "+idiomas.get(1) + " y "+idiomas.get(2);
        return texto;
    }

}
