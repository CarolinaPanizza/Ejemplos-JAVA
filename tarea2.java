//MARIA CAROLINA PANIZZA DE SOUZA
//229053

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        in.nextLine();
        String esta = "NO";
        boolean existe = false;
        int contH = 1;
        int contV = 1;
        int contDA = 1;
        int contDa = 1;
        int fila = 0;
        int columna = 0;
        int k = 0;
        char[][] matriz = new char[m][n];
  
        for (int i = 0; i < m; i++){
            String cadena = in.nextLine();
            for (int h = 0; h < cadena.length() ; h++){
                matriz[i][h] = cadena.charAt(h);
            }
        }
        String palabra = in.nextLine();
        //Recorre la matriz buscando la primera letra de la palabra
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if ((matriz[i][j] == palabra.charAt(0)) && !existe){
                    fila = i;
                    columna = j;
                    k = 0;
                    contH = 0;
                    //Recorre la matriz horizontal
                    while((columna < matriz[0].length) && (contH < palabra.length()) && (matriz[fila][columna] == palabra.charAt(k))){
                        k++;
                        columna++;
                        contH++;
                    }
                    existe = (contH == palabra.length());
                }
                if (!existe){
                    fila = i;
                    columna = j;
                    k = 0;
                    contV = 0;
                    //Recorre la matriz vertical
                    while((fila < matriz.length) && (contV < palabra.length()) && (matriz[fila][columna] == palabra.charAt(k))){
                        k++;
                        fila++;
                        contV++;
                    }
                    existe = (contV == palabra.length());
                }
                if (!existe){
                    fila = i;
                    columna = j;
                    k = 0;
                    contDA = 0;
                    //Recorre la matriz diagonal hacia abajo
                    while((fila < matriz.length) && (columna < matriz[0].length) && (contDA < palabra.length()) && (matriz[fila][columna] == palabra.charAt(k))){
                        k++;
                        fila++;
                        columna++;
                        contDA++;
                    }
                   existe = (contDA == palabra.length());
                }
                if (!existe){
                    fila = i;
                    columna = j;
                    k = 0;
                    contDa = 0;
                    //Recorre la matriz diagonal hacia arriba
                    while((fila < matriz.length)&& (fila >= 0) && (columna < matriz[0].length) && (contDa < palabra.length()) && (matriz[fila][columna] == palabra.charAt(k))){
                        k++;
                        fila--;
                        columna++;
                        contDa++;
                    }
                    existe = (contDa == palabra.length());
                }
            }   
        }
        if (existe){
            esta = "SI";
        }
        System.out.println(esta);
    }
}