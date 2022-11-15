package Práctica1PyN;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import static java.awt.Font.PLAIN;
public class P1PyN extends JFrame {

    JLabel label1;
    JButton boton[] = new JButton[5];
    String texto[] = {"1", "2", "3", "4", "5"};
    int valores[] = {1, 2, 3, 4, 5};
    int coorx = 50;
    int valortu = 0;
    public P1PyN() {
        setLayout(null);
        setBounds(10,10,600,500);
        setTitle("Pares y Nones Principal");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        label1 = new JLabel("Escoge tu número");
        label1.setBounds(100,100,300,100);
        add(label1);
        for (int i = 0; i < boton.length; i++) {
            boton[i] = new JButton(texto[i]);
            boton[i].setBounds(coorx, 300, 50, 50);
            add(boton[i]);
            coorx += 100;
        }
        initAcciones();
        setVisible(true);
    }

    public void initAcciones() {
        for (int i = 0; i < boton.length; i++) {
            int j = i;
            P1PyN parent = this;
            boton[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == boton[j]) {
                        valortu = j+1;
                        P1PyN2 secundaria = new P1PyN2(parent,true, valortu);
                        secundaria.setVisible(true);
                    }
                }
            });
        }
    }

    public static void main(String[] args) {
        new P1PyN();
    }
}

