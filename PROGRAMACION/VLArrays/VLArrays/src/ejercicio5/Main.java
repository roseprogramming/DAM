package ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Imprime el valor de la diagonal de una matriz*/

        Scanner scn = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("matriz [" + i + "] [" + j + "]");
                matriz[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j){
                    System.out.print(matriz[i][j]+" ");
                }
            }
        }


    }
}
