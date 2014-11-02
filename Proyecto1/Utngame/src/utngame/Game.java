
package utngame;

import java.util.Scanner;


public class Game {
    
      Scanner teclado = new Scanner(System.in);
    private String[][] matriz;

    public void CrearMatriz() {
        matriz = new String[6][7];
    }

    public void cargar() {
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 7; c++) {
                matriz[f][c] = "|";
            }
        }
    }
    
}
