import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Práctica1_2 extends JFrame {

    JLabel[] etiquetas = new JLabel[3];

    String nombres[] = {"Pedro", "Pepito", "Juan"};

    int y = 90;

    public Práctica1_2(){

        setLayout(null);

        setBounds(0, 0, 1024, 800);

        setTitle("Ejercicio Practico 1");

        setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initEtiquetas();

        setVisible(true);
    }

    public void initEtiquetas(){
        for (int i = 0; i < etiquetas.length; i++){
            etiquetas[i] = new JLabel(nombres[i]);
            etiquetas[i].setBounds(350, y, 195, 50);
            y += 150;
            etiquetas[i].setBackground(Color.DARK_GRAY);
            etiquetas[i].setForeground(Color.magenta);
            etiquetas[i].setOpaque(true);
            etiquetas[i].setBorder(new LineBorder(Color.GREEN));
            add(etiquetas[i]);
        }
    }

    public static void main(String[] args) {
        Práctica1_2 p = new Práctica1_2();
    }

}
