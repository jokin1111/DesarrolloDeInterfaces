import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.FontRenderContext;

public class Ejercicio12 extends JFrame {

    JPanel panel;
    JTextField [] textos = new JTextField[4];
    JLabel [] etiquetas = new JLabel[4];
    JRadioButton [] botones = new JRadioButton[4];
    ButtonGroup grpBot = new ButtonGroup();
    int tp = 0;
    JButton gen;
    int valores [] = new int[4];
    public Ejercicio12(){
        initLabel();
        initTextos();
        initRadios();
        initGen();
        initPanel();
        initPantalla();
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;



        if (botones[0].isSelected()){

            for (int i = 0; i < valores.length; i++) {
                valores[i] = Integer.parseInt(textos[i].getText());
            }

            int suma = valores[0] + valores[1] + valores[2] + valores[3];
            int g1 = valores[0] * (360 / suma);
            int g2 = valores[1] * (360 / suma);
            int g3 = valores[2] * (360 / suma);
            int g4 = valores[3] * (360 / suma);
            g2d.setColor(Color.GREEN);
            g2d.fillArc(450, 200, 200, 200, 0, g1);

            g2d.setColor(Color.RED);
            g2d.fillArc(450, 200, 200, 200, g1, g2);

            g2d.setColor(Color.YELLOW);
            g2d.fillArc(450, 200, 200, 200, (g1+g2), g3);

            g2d.setColor(Color.MAGENTA);
            g2d.fillArc(450, 200, 200, 200, (g1+g2+g3), g4);

        }else if (botones[1].isSelected()){
//            valores = Integer.parseInt(textos[0].getText());
////            valores1 = Integer.parseInt(textos[1].getText());
////            valores2 = Integer.parseInt(textos[2].getText());
////            valores3 = Integer.parseInt(textos[3].getText());

            g2d.setColor(Color.GREEN);
            g2d.fillRect(450, 200, 200, 200);
        }else if (botones[2].isSelected()){
            g2d.setColor(Color.YELLOW);
            g2d.drawRect(400,50, 100, 30);
        }else if (botones[3].isSelected()){
            g2d.setColor(Color.BLUE);
            g2d.drawRect(400,50, 100, 30);
        }
    }
    public void initGen(){
        gen = new JButton("Generar");
        gen.setBounds(60, 525, 100, 30);
        add(gen);

        gen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
    }
    public void initRadios(){
        String [] nombres = {"Gráfico tarta", "Gráfico lineas", "Gráfico barras", "Gráfico barras %"};
        int xi = 280;
        for (int i = 0; i < botones.length; i++) {
            botones[i] = new JRadioButton(nombres[i]);
            botones[i].setBounds(50 , xi, 150, 30);
            add(botones[i]);
            grpBot.add(botones[i]);
            xi+=60;
//            botones[i].addChangeListener(new ChangeListener() {
//                @Override
//                public void stateChanged(ChangeEvent e) {
//                    if (botones[0].isSelected())
//                        tp = 1;
//                    else if (botones[1].isSelected())
//                        tp = 2;
//                    else if (botones[2].isSelected())
//                        tp = 3;
//                    else
//                        tp = 4;
//                }
//            });
        }

    }
    public void initPanel(){
        panel = new JPanel();
        panel.setBounds(350, 1, 400, 600); //Dimensiones del panel
        panel.setBackground(Color.BLACK);
        add(panel); //Añado el panel al JFrame
    }
    public void initTextos(){
        int xi = 60;
        for (int i = 0; i < textos.length; i++) {
            textos[i] = new JTextField();
            textos[i].setBounds(60, xi, 150, 30);
            add(textos[i]);
            xi+=60;
        }
    }
    public void initLabel(){
        String [] nombres = {"A", "B", "C", "D"};

        int xi = 30;
        for (int i = 0; i < etiquetas.length; i++) {
            etiquetas[i] = new JLabel(nombres[i]);
            etiquetas[i].setBounds(60, xi, 30, 30);
            add(etiquetas[i]);
            xi+=60;
        }
    }
    public void initPantalla(){
        setTitle("Ejercicio 12");
        setSize(750,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new Ejercicio12();
    }

}
