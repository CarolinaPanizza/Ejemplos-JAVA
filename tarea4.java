//MARIA CAROLINA PANIZZA DE SOUZA
//229053


import java.io.*;
import java.util.*;



public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int cantEsp = 0;
        int maxCol = n;
        String [] filas = new String[n];
        int elMayor = Integer.MIN_VALUE;
        
        
        //Ingreso las filas
        for (int i = 0; i < n; i++){
            filas[i] =  in.nextLine();
            String[] elementos = filas[i].split(" ");
            if(elementos.length > maxCol){
                maxCol = elementos.length;
            }
            for (int j = 0; j < elementos.length; j++){
                if (Integer.valueOf(elementos[j]) > elMayor){
                    elMayor = Integer.valueOf(elementos[j]);
                }
            }
        }
        
        //Arma la matriz
        int[][] matriz = new int[maxCol][maxCol];
        for (int l = 0; l < maxCol; l++){
            if (l < filas.length){
                String[] elementos = filas[l].split(" ");
                for (int j = 0; j < elementos.length; j++){
                    matriz[l][j] = Integer.valueOf(elementos[j]);
                }
                int k = elementos.length;
                while (k < maxCol){
                    matriz[l][k] = elMayor;
                    k++;
                }
            }
            else {
                for (int h = 0; h < matriz[0].length; h++){
                    matriz[l][h] = elMayor;
                }
            }
        }
        
        //Imprime la matriz
        for (int s = 0; s < maxCol; s++){
            for (int j = 0; j < maxCol; j++){
                System.out.print(matriz[s][j]+" ");
            }
            System.out.println();
        }
        
        
        
    }
}