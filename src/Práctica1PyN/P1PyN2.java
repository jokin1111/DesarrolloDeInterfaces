package Práctica1PyN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class P1PyN2 extends JDialog implements ActionListener{
    private JButton boton2;
    private JLabel label2;

    String texto;
    int valoria = (int)(Math.random()*(5-1+1)+1), resultado = 0;
    String ganador = "";
    public P1PyN2(P1PyN parent, boolean modal, int valortu) {
        super(parent, modal);
        resultado = valortu + valoria;
        if(resultado%2==0){
            ganador="eres tú.";
        }
        else{
            ganador="es la máquina.";
        }
        String valortus = String.valueOf(Integer.parseInt(String.valueOf(valortu)));
        String valorias = String.valueOf(Integer.parseInt(String.valueOf(valoria)));
        texto = "Tu número es "+valortus+", el número de la máquina es "+valorias+", y el ganador es "+ganador;
        setLayout(null);
        setBounds(600,10,700,500);
        label2 = new JLabel(texto);
        label2.setBounds(100,150,500,100);
        add(label2);
        boton2 = new JButton("Volver");
        boton2.setBounds(150,300,200,100);
        add(boton2);
        boton2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton2) {
            setVisible(false);
        }
    }
}
