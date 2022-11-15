import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Font.PLAIN;

public class Ejemplo3B extends JFrame {

    JLabel display;
    JButton[] botones = new JButton[4];
    String[] nombre_botones = {"Pulsa o teclea 1", "Pulsa o teclea 2", "Pulsa o teclea 3", "Limpiar display" };

    String[] valores = {"1", "2", "3", "c"};

    int y = 90;
    public Ejemplo3B(){
        initBotones();
        initDisplay();
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

        for (int i = 0; i < botones.length; i++){
            botones[i] = new JButton(nombre_botones[i]);
            botones[i].setBounds(15, y, 195, 50);
            y += 65;
            botones[i].setFont(new Font("MONOSPACED", PLAIN, 16));
            botones[i].setOpaque(true);
            botones[i].setFocusPainted(false);
            botones[i].setBackground(Color.DARK_GRAY);
            botones[i].setBorder(new LineBorder(Color.DARK_GRAY));
            botones[i].setForeground(Color.WHITE);
            add(botones[i]);
            initAccion(botones[i],i);
            initHover(botones[i]);

        }

    }

    private void initAccion(JButton botones, int indice){
        botones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("c".equals(valores[indice])){
                    display.setText("");
                }
                else{
                    display.setText(display.getText() + valores[indice]);
                }
                display.requestFocus(); //Le devuelve el foco al display (por si escribe con el teclado)
            }
        });
    }

    private void initHover(JButton botones){
        botones.addMouseListener(new MouseListener() {
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
                botones.setBackground(Color.GREEN);
                botones.setBorder(new LineBorder(Color.green));
                botones.setForeground(Color.DARK_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botones.setBackground(Color.DARK_GRAY);
                botones.setBorder(new LineBorder(Color.DARK_GRAY));
                botones.setForeground(Color.WHITE);
            }
        });
    }


    public static void main(String[] args) {
        new Ejemplo3B();
    }

}
