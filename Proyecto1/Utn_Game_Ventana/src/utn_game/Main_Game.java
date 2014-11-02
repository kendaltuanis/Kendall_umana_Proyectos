package utn_game;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main_Game {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenidos, que se diviertan");
        
       Game_menu ventana = new Game_menu();
       ventana.setTitle("Menú");
       
       ventana.setVisible(true);
       ventana.setLocationRelativeTo(null);
       


    }

}
