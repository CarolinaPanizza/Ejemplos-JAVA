//MARIA CAROLINA PANIZZA DE SOUZA
//229053

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] matriz = new int[m][n];
        boolean esta = false;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = in.nextInt();
            }
        }
        for(int l = 0; (l < matriz.length) && !esta; l++){
            for(int x = 0; x < matriz[0].length; x++){
                if(matriz[l][x] == 1){
                    for(int k = x + 1; k < matriz[0].length; k++){
                        if(matriz[l][k] == 1){
                            int dist = (k - x);
                            if((dist + l < matriz.length) && (matriz[dist + l][k] == 1)){
                                if(matriz[dist + l][k - dist] == 1){
                                    esta = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(esta){
          System.out.println("SI");
        }else{
        System.out.println("NO");
        }
    }
}