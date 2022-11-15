package Práctica1JoaquínAntequera.Práctica1JoaquínAntequera;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Práctica1JoaquinAntequera extends JFrame {
//    private JPanel panel= new JPanel();
//    private JScrollPane scroll = new JScrollPane();
    JTextField[] textos = new JTextField[9];
    JLabel[] etiquetas = new JLabel[9];
    JRadioButton[] sexo = new JRadioButton[3];
    JCheckBox [] idiomas = new JCheckBox[6];
    JMenuBar menuBar;
    JTextArea carta;
    JMenu menu1;
    JMenu menus[] = new JMenu[2];
    JMenuItem[] menuColores = new JMenuItem[5];
    JComboBox prov = new JComboBox();
    JComboBox prev = new JComboBox();
    public Práctica1JoaquinAntequera(){
        initTextos();
        initLabel();
        initCombo();
        initSexo();
        initIdiomas();
        initCarta();
        initBoton();
        initMenuBar();
        initPantalla();
    }
    //todo Realiza un formulario de datos personales en la izquierda de un JFrame que incluya:
    //todo inicializar JFrame
    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("Práctica1"); //Título del JFrame
        setSize(1200, 1200); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        getContentPane().setBackground(Color.BLACK);

//        panel.setLayout(null);
//        panel.setPreferredSize(new Dimension(1100, 1100));
//        scroll.setViewportView(panel);
//        scroll.setBounds(10, 10, 1110,1000);
//        add(scroll);
        setVisible(true); //Mostrar JFrame
    }
    //todo Campos de entrada de texto para nombre, apellidos, dirección, teléfono, NIF, código postal, email, contraseña y población.

    private void initTextos(){
        int initial_i = 55;//Posición y para el array de textos
        for (int i = 0; i < textos.length; i++) {
            textos[i] = new JTextField();
            textos[i].setBounds(1, initial_i, 150, 30);
            //panel.add(textos[i]);
            add(textos[i]);
            initial_i += 60;
        }
    }
    private void initLabel(){
        String[] nomEt = {"Nombre", "Apellidos", "Dirección", "Teléfono", "NIF", "Código postal", "Email", "Contraseña", "Población"};
        int initial_y = 30;//Posición y para el array de etiquetas
        for (int i = 0; i < etiquetas.length; i++) {
            etiquetas[i] = new JLabel(nomEt[i]);
            etiquetas[i].setBounds(1, initial_y, 300, 30);
            etiquetas[i].setBackground(Color.BLACK);
            etiquetas[i].setForeground(Color.GREEN);
            etiquetas[i].setOpaque(false);
            /*if (i == 5){
                etiquetas[i].setBounds(30, 270, 300, 30);
            }*/
            //panel.add(etiquetas[i]);
            add(etiquetas[i]);
            initial_y += 60;
        }
    }
    //todo Campos de selección de opción única para provincias y países (al menos 10 de cada)
    private void initCombo(){
        String [] paises = {"España", "Rusia", "Alemania", "Francia", "Inglaterra", "Escocia", "Japón", "Australia",
                            "China", "Polonia"};
        String [] ciudades = {"Madrid", "Moscow", "Berlin", "Paris", "Londres", "Glasgow", "Tokyo", "Camberra",
                             "Pekin", "Varsovia"};
        for (int i = 0; i < paises.length; i++) {
            prov.setBounds(325, 175, 100, 30);
            prov.addItem(paises[i]);
            prev.setBounds(325, 225, 100, 30);
            prev.addItem(ciudades[i]);
            prov.setForeground(Color.RED);
            prev.setForeground(Color.RED);
//            panel.add(prov);
            add(prov);
//            panel.add(prev);
            add(prev);
        }
    }
    //todo Campo de selección única para Sexo (Hombre, Mujer, Otros)
    private void initSexo(){
        String[] hmo = {"Masculino", "Femenino", "Otro"};
        ButtonGroup grupoBotones = new ButtonGroup();
        int initial_y = 40;
        for (int i = 0; i < sexo.length; i++) {
            sexo[i] = new JRadioButton(hmo[i]);
            sexo[i].setBounds(160, initial_y, 100, 30);
            sexo[i].setForeground(Color.magenta);
            //panel.add(sexo[i]);
            add(sexo[i]);
            initial_y += 35;
            grupoBotones.add(sexo[i]);
        }
    }
    //todo Campos de selección de opción múltiple para Idiomas (Español, Inglés, Francés, Alemán, Italiano, Otros).
    private void initIdiomas(){
        String[] idi = {"Español", "Alemán", "Inglés", "Francés", "Italiano", "Otros"};
        int initial_y = 160;
        for (int i = 0; i < idiomas.length ; i++) {
            idiomas[i] = new JCheckBox(idi[i]);
            idiomas[i].setBounds(200, initial_y, 80, 40);
            //panel.add(idiomas[i]);
            add(idiomas[i]);
            initial_y += 80;
        }
    }
    //todo Campos de entrada de texto para Carta de presentación (al menos 10 líneas).
    private void initCarta(){
        carta = new JTextArea();
        carta.setBounds(325, 280, 300, 180);
        carta.setBackground(Color.CYAN);
        carta.setLineWrap(true);
        //panel.add(carta);
        add(carta);
    }
    //todo A la derecha del JFrame, el botón anterior hará que se muestren en un
    //todo campo que permita hacer scroll y de forma ordenada y maquetada, todos los input y opciones seleccionadas anteriormente.
    //todo Un botón de generar datos personales.
    private void initBoton(){
        JButton boton = new JButton("Recibir formulario");
        boton.setBounds(500, 150, 160, 100);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(boton);
    }

    private void initMenuBar(){
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menu1 = new JMenu("Menú");
        menuBar.add(menu1);
        String[] nombres = {"Formato", "Acciones"};
        String[] nom_col = {"Rojo", "Azul", "Verde", "Amarillo", "Rosa"};
        for (int i = 0; i < menus.length; i++) {
            menus[i] = new JMenu(nombres[i]);
            menu1.add(menus[i]);
        }
        for (int i = 0; i < menuColores.length; i++) {
            menuColores[i]  =new JMenuItem(nom_col[i]);
            menus[0].add(menuColores[i]);
        }


    }

    public static void main(String[] args) {
        new Práctica1JoaquinAntequera();
    }

}
