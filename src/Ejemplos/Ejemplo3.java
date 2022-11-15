import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Font.PLAIN;

public class Ejemplo3 extends JFrame {

    JLabel display;
    JButton boton1, boton2, boton3, botonLimpiar;

    public Ejemplo3(){

        initDisplay();
        initBotones();
        initAcciones();
        initHovers();
        initPantalla();

    }

    private void initPantalla(){

        setTitle("Ejemplo3: Eventos");
        setSize(240, 390);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //cambio el color del fondo del JFrame
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);

    }

    private void initDisplay(){

        display = new JLabel(""); //Provisional
        display.setBounds(15, 15, 195, 60);
        display.setOpaque(true);//Los colores en java son transparentes por defecto
        display.setBackground(Color.BLACK);//color de fondo
        display.setForeground(Color.GREEN);//color de la fuente
        display.setBorder(new LineBorder(Color.DARK_GRAY));//Borde de la etiqueta
        display.setFont(new Font("MONOSPACED", PLAIN, 24));//Tipo de fuente
        display.setHorizontalAlignment(SwingConstants.RIGHT);//Alineo el texto a la derecha
        display.setFocusable(true);//Permito que tenga el foco para poder escribir con el teclado
        add(display); //Añado el display al JFrame

        display.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Obtengo el String correspondiente a la tecla pulsada
                String ch = String.valueOf(e.getKeyChar());
                //Si pulsa 1, 2, o 3
                if ("1".equals(ch) || "2".equals(ch) || "3".equals(ch)){
                    display.setText(display.getText() + ch);
                }
                else if ("c".equals(ch))
                    display.setText("");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

    private void initBotones(){
        
        boton1 = new JButton("Pulsa o teclea 1");
        boton1.setBounds(15,90, 195, 50);
        boton1.setFont(new Font("MONOSPACED", PLAIN, 16));
        boton1.setFocusPainted(false);
        boton1.setBackground(Color.DARK_GRAY);
        boton1.setBorder(new LineBorder(Color.DARK_GRAY));
        boton1.setForeground(Color.WHITE);
        add(boton1);

        boton2 = new JButton("Pulsa o teclea 2");
        boton2.setBounds(15,155, 195, 50);
        boton2.setFont(new Font("MONOSPACED", PLAIN, 16));
        boton2.setFocusPainted(false);
        boton2.setBackground(Color.DARK_GRAY);
        boton2.setBorder(new LineBorder(Color.DARK_GRAY));
        boton2.setForeground(Color.WHITE);
        add(boton2);

        boton3 = new JButton("Pulsa o teclea 3");
        boton3.setBounds(15,220, 195, 50);
        boton3.setFont(new Font("MONOSPACED", PLAIN, 16));
        boton3.setFocusPainted(false);
        boton3.setBackground(Color.DARK_GRAY);
        boton3.setBorder(new LineBorder(Color.DARK_GRAY));
        boton3.setForeground(Color.WHITE);
        add(boton3);

        botonLimpiar = new JButton("Pulsa o teclea 4");
        botonLimpiar.setBounds(15,285, 195, 50);
        botonLimpiar.setFont(new Font("MONOSPACED", PLAIN, 16));
        botonLimpiar.setFocusPainted(false);
        botonLimpiar.setBackground(Color.DARK_GRAY);
        botonLimpiar.setBorder(new LineBorder(Color.DARK_GRAY));
        botonLimpiar.setForeground(Color.WHITE);
        add(botonLimpiar);
        
    }

    private void initAcciones(){

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + 1);
                display.requestFocus();
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + 2);
                display.requestFocus();
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + 3);
                display.requestFocus();
            }
        });

        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                display.requestFocus();
            }
        });

    }

    private void initHovers(){
        boton1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                boton1.setBackground(Color.GREEN);
                boton1.setBorder(new LineBorder(Color.green));
                boton1.setForeground(Color.DARK_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton1.setBackground(Color.DARK_GRAY);
                boton1.setBorder(new LineBorder(Color.DARK_GRAY));
                boton1.setForeground(Color.WHITE);
            }
        });
        
        boton2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                boton2.setBackground(Color.GREEN);
                boton2.setBorder(new LineBorder(Color.green));
                boton2.setForeground(Color.DARK_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton2.setBackground(Color.DARK_GRAY);
                boton2.setBorder(new LineBorder(Color.DARK_GRAY));
                boton2.setForeground(Color.WHITE);
            }
        });

        boton3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                boton3.setBackground(Color.GREEN);
                boton3.setBorder(new LineBorder(Color.green));
                boton3.setForeground(Color.DARK_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton3.setBackground(Color.DARK_GRAY);
                boton3.setBorder(new LineBorder(Color.DARK_GRAY));
                boton3.setForeground(Color.WHITE);
            }
        });

        botonLimpiar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                botonLimpiar.setBackground(Color.GREEN);
                botonLimpiar.setBorder(new LineBorder(Color.green));
                botonLimpiar.setForeground(Color.DARK_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonLimpiar.setBackground(Color.DARK_GRAY);
                botonLimpiar.setBorder(new LineBorder(Color.DARK_GRAY));
                botonLimpiar.setForeground(Color.WHITE);
            }
        });
    }

    public static void main(String[] args) {
        new Ejemplo3();
    }
}
