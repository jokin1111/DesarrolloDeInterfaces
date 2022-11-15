import Ejercicio10.Ejercicio10;

import javax.swing.*;

public class Ejercicio11 extends JFrame {

    JComboBox [] combos;
    int x_inicial = 30;
    public Ejercicio11(){
        initPantalla();
    }

    public void initPantalla(){
        setLayout(null); //Layout absoluto
        setTitle("Ejercicio 11"); //Título del JFrame
        setSize(400, 600); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

    public void initCombo(){
        for (int i = 0; i > combos.length; i++){
            combos[i] = new JComboBox();
            combos[i].setBounds(x_inicial, 30, 30, 30);
            add(combos[i]);
        }
    }


}
