package utn_game;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Game_Clase {

    Scanner teclado = new Scanner(System.in);
    private String[][] matriz;
    private String[] arreglo= new String[10];

    private int columna;
    private int fila;
    private String marca;

    public void CrearMatriz() {
        matriz = new String[6][7];
    }

    public void cargar() {
        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 7; c++) {
                matriz[f][c] = " ";
            }
        }
    }

    public void colocarFicha(int columna, int fila, String marca) {
        this.columna = columna;
        this.columna = fila;
        this.marca = marca;

        for (int f = 6; f >= 0; f--) {
            for (int c = 7; c >= 0; c--) {

                if (c == columna && f == fila) {

                    matriz[f][c] = marca;

                }

            }
        }

    }

    public String ganar() {
        int cont1 = 0;
        int cont2 = 0;

        int temp = 0;
        String ganador = "";

        for (int f = 5; f >= 0; f--) {
            for (int c = 6; c >= 0; c--) {

                if (marca == matriz[f][c]) {

                    cont1++;

                    if (cont1 == 4) {
                        ganador = "El primer jugador ganó.";
                        JOptionPane.showMessageDialog(null, ganador);
                    }
                }

                if (marca == matriz[f][c] && marca == "0") {
                    cont2++;
                    if (cont2 == 4) {

                        ganador = "El segundo jugador ganó.";
                        JOptionPane.showMessageDialog(null, ganador);
                    }
                }

            }

        }
        return ganador;

    }

    public void imprimir() {

        for (int f = 5; f >= 0; f--) {
            for (int c = 6; c >= 0; c--) {
                System.out.print("[ " + matriz[f][c] + " ]");

            }
            System.out.println();
        }

    }

  

}
