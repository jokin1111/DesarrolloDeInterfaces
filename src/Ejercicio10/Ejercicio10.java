package Ejercicio10;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio10 extends JFrame implements ActionListener {

    JTextField textField1, textField2;
    JRadioButton[] radios = new JRadioButton[4];
    ButtonGroup grupoBotones;
    String[] operaciones = {"+", "-", "*", "/"};
    int x_inicial = 40;
    JLabel label1, label2, textoResultado;
    JButton botonReiniciar;

    public Ejercicio10(){
        initTextField();
        initRadioButton();
        initJLabel();
        initBoton();
        initPantalla();
    }

    private void initBoton(){
        botonReiniciar = new JButton("Reiniciar");
        //botonReiniciar.setBounds("");
    }

    private void initTextField(){
        textField1 = new JTextField("");
        textField1.setBounds(50, 80, 55, 30);
        add(textField1);

        textField2 = new JTextField("");
        textField2.setBounds(150, 80, 55, 30);
        add(textField2);
    }

    private void initRadioButton(){

        grupoBotones = new ButtonGroup();

        for (int i = 0; i < radios.length; i++){
            radios[i] = new JRadioButton(operaciones[i]);
            radios[i].setBounds(x_inicial, 120, 50, 30);
            grupoBotones.add(radios[i]);
            //radios[i].addChangeListener(radios[i], i);
            initChangeListener(radios[i], i);
            radios[i].setRolloverEnabled(false);
            x_inicial += 50;
            add(radios[i]);
        }

    }

    private void initChangeListener(JRadioButton radios, int i){
        radios.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (radios.isSelected() && NaN()){
                    calcula_resultado(operaciones[i]);
                }
            }
        });
    }

    private boolean NaN(){
        if (textField1.getText().length() >0 && textField2.getText().length() >0){
            try{
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                return true;
            }catch (Exception e){
                return false;
            }
        }
        return false;
    }

    private void calcula_resultado(String operaciones){
        double resultado = 0;
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());
        switch (operaciones){
            case "+": resultado = num1 + num2;break;
            case "-": resultado = num1 - num2;break;
            case "*": resultado = num1 * num2;break;
            case "/": resultado = num1 / num2;break;
            default: resultado = 0;
        }
        textoResultado.setText("Resultado: " + resultado);
        botonReiniciar.setVisible(false);
        if (resultado >= 0) getContentPane().setBackground(Color.green);
        else getContentPane().setBackground(Color.red);
    }

    private void initJLabel(){
        label1 = new JLabel("Número 1");
        label1.setBounds(50, 50, 100, 30);
        add(label1);

        label2 = new JLabel("Número 2");
        label2.setBounds(150, 50, 100, 30);
        add(label2);

        textoResultado = new JLabel("Resultado: Ninguno");
        textoResultado.setBounds(50, 150, 200, 30);
        add(textoResultado);
    }

    private void initPantalla() {
        setLayout(null); //Layout absoluto
        setTitle("Ejercicio 10"); //Título del JFrame
        setSize(400, 300); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame

    }

    public static void main(String[] args) {
        new Ejercicio10();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(botonReiniciar)){
            textField1.setText("");
            textField2.setText("");
            grupoBotones.clearSelection();
            textoResultado.setText("Resultado: ");
            botonReiniciar.setVisible(false);
            getContentPane().setBackground(new Color(242, 242, 242));
        }
    }
}
