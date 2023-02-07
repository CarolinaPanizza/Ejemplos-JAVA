package distancia;
import java.util.*;

public class Partida {
    //seleccionar jugador va afuera
    
    
    public static void unaPartida(String [][] tablero, Jugador j1, Jugador j2){
        System.out.println("\u001B[31m"+"-------------------------------------------------");
        System.out.println("\u001B[31m"+"                    DISTANCIA                    ");
        System.out.println("\u001B[31m"+"-------------------------------------------------"+"\u001B[30m");
        System.out.println();
        System.out.println("\u001B[34m"+"***************  INICIO PARTIDA  ****************");
        System.out.println("\u001B[30m");
        Scanner in = new Scanner(System.in);
        Jugador elGanador = j1;
        j1.unaPartidaJugada();
        j2.unaPartidaJugada();
        String[][] auxiliar = tablero;
        boolean terminado = false;
        boolean interrumpido = false;
        
        String color1 = "R";
        String color2 = "A";
       
        //Imprime el tablero inicial
        Interfaz.imprimirMatriz(auxiliar);
        
        while(!terminado && !interrumpido){
            boolean pasar = false;
            //JUGADA JUGADOR 1:    
            //Valida la posicion inicial
            int[] posInicial1 = Interfaz.validarPosInicial(j1, color1, auxiliar, j2);
            if(posInicial1[2] == 1){
                interrumpido = true;
                elGanador = j2;
            }            
            if(!interrumpido){
                int ai = posInicial1[0];
                int bi = posInicial1[1];

                //Selecciona la posicion inicial
                auxiliar[ai][bi] = "E";

                //Muestra los posibles movimientos
                auxiliar = posiblesMovimientos(ai, bi, auxiliar, color1);
                pasar = !hayMovimientos(auxiliar);
                if(pasar){
                    auxiliar = limpiarAlPasar(auxiliar, color1);
                    auxiliar = limpiarMatriz(auxiliar, color2);
                }
                Interfaz.imprimirMatriz(auxiliar);
            }
            if(!interrumpido && !pasar){
                //Valida posicion final
                int[] posFinal = Interfaz.validarJugadaFinal(j1, auxiliar, color1, j2);
                if(posFinal[2] == 1){
                    interrumpido = true;
                    elGanador = j2;
                }
                
                if(!interrumpido){
                    int af = posFinal[0];
                    int bf = posFinal[1];
                    //Coloca el color en la posicion final
                    auxiliar[af][bf] = color1;
                    //limpia la matriz
                    auxiliar = limpiarMatriz(auxiliar, color2);
                    Interfaz.imprimirMatriz(auxiliar); 
                    if(partidaFinalizada(auxiliar, color2)){
                        elGanador = j1;
                        terminado = true;
                    }
                }
            }

            if(!interrumpido && !terminado){
                pasar = false;
            //JUGADA JUGADOR 2:    
                //Valida la posicion inicial
                int[] posInicial2 = Interfaz.validarPosInicial(j2, color2, auxiliar, j1);
                if(posInicial2[2] == 1){
                    interrumpido = true;
                    elGanador = j1;
                }            
                if(!interrumpido){
                    int ai = posInicial2[0];
                    int bi = posInicial2[1];

                    //Selecciona la posicion inicial
                    auxiliar[ai][bi] = "E";

                    //Muestra los posibles movimientos
                    auxiliar = posiblesMovimientos(ai, bi, auxiliar, color2);
                    
                    pasar = !hayMovimientos(auxiliar);
                    if(pasar){
                        auxiliar = limpiarAlPasar(auxiliar, color2);
                        auxiliar = limpiarMatriz(auxiliar, color1);
                    }
                    Interfaz.imprimirMatriz(auxiliar);
                }
                if(!interrumpido && !pasar){
                    //Valida posicion final
                    int[] posFinal = Interfaz.validarJugadaFinal(j2, auxiliar, color2, j1);
                    if(posFinal[2] == 1){
                        interrumpido = true;
                        elGanador = j1;
                    }                
                    if(!interrumpido){
                        int af = posFinal[0];
                        int bf = posFinal[1];
                        //Coloca el color en la posicion final
                        auxiliar[af][bf] = color2;
                        //limpia la matriz
                        auxiliar = limpiarMatriz(auxiliar, color1);
                        Interfaz.imprimirMatriz(auxiliar);     
                        if(partidaFinalizada(auxiliar, color1)){
                            elGanador = j2;
                            terminado = true;
                        }
                    }
                }                
            }
        }
        elGanador.unaPartidaGanada();
        Interfaz.imprimirGanador(elGanador);
    }
    
    //METODO QUE MUESTRA LOS POSIBLES MOVIMIENTOS
    private static String[][] posiblesMovimientos(int a, int b, String[][] auxiliar, String color){
        int[][] distancia = matDistancia();
        String color1 = "R";
        String color2 = "A";
        if(color.equals("A")){
            color1 = "A";
            color2 = "R";
            
        }

        //********MOVERSE SIN CAPTURA*************
        //se desplaza a una casilla vacía adyacente
        //en la misma columna
        if((a<5)&&(distancia[a+1][b] > distancia[a][b])&&(auxiliar[a+1][b] == " ")){
            auxiliar[a+1][b] = "*";
        }
        if((a>0)&&(distancia[a-1][b] > distancia[a][b])&&(auxiliar[a-1][b] == " ")){
            auxiliar[a-1][b] = "*";
        }
        //en la misma fila
        if((b<5)&&(distancia[a][b+1] > distancia[a][b])&&(auxiliar[a][b+1] == " ")){
            auxiliar[a][b+1] = "*";
        }                
        if((b>0)&&(distancia[a][b-1] > distancia[a][b])&&(auxiliar[a][b-1] == " ")){
            auxiliar[a][b-1] = "*";
        }
        //en diagonal
        if((a>0)&&(b>0)&&(distancia[a-1][b-1] > distancia[a][b])&&(auxiliar[a-1][b-1] == " ")){
            auxiliar[a-1][b-1] = "*";
        }
        if((a<5)&&(b<5)&&(distancia[a+1][b+1] > distancia[a][b])&&(auxiliar[a+1][b+1] == " ")){
            auxiliar[a+1][b+1] = "*";
        }
        if((a>0)&&(b<5)&&(distancia[a-1][b+1] > distancia[a][b])&&(auxiliar[a-1][b+1] == " ")){
            auxiliar[a-1][b+1] = "*";
        }
        if((b>0)&&(a<5)&&(distancia[a+1][b-1] > distancia[a][b])&&(auxiliar[a+1][b-1] == " ")){
            auxiliar[a+1][b-1] = "*";
        }
            
        //*********MOVERSE CON CAPTURA******************
        //en la misma fila a la derecha
        if((b<5)&&(distancia[a][b+1]<distancia[a][b])){
            boolean ok = false;
            for (int i = b; (i < 5) && !ok; i++){
                if(auxiliar[a][i] == color2){
                    auxiliar[a][i] = "#";
                    ok = true;
                }
                if(auxiliar[a][i] == color1){
                    ok = true;
                }                
            }
        }
        //en la misma fila a la izquierda
        if((b>0)&&(distancia[a][b-1]<distancia[a][b])){
            boolean ok = false;
            for (int i = b; (i > 0) && !ok; i--){
                if(auxiliar[a][i] == color2){
                    auxiliar[a][i] = "#";
                    ok = true;
                }
                if(auxiliar[a][i] == color1){
                    ok = true;
                }                
            }
        }
        //en la misma columna arriba
        if((a>0)&&(distancia[a-1][b]<distancia[a][b])){
            boolean ok = false;
            for (int i = a; (i > 0) && !ok; i--){
                if(auxiliar[i][b] == color2){
                    auxiliar[i][b] = "#";
                    ok = true;
                }
                if(auxiliar[i][b] == color1){
                    ok = true;
                }                
            }
        } 
        //en la misma columna abajo
        if((a<5)&&(distancia[a+1][b]<distancia[a][b])){
            boolean ok = false;
            for (int i = a; (i < 5) && !ok; i++){
                if(auxiliar[i][b] == color2){
                    auxiliar[i][b] = "#";
                    ok = true;
                }
                if(auxiliar[i][b] == color1){
                    ok = true;
                }                
            }
        }
        //en diagonal arriba izquierda
        if((b>0)&&(a>0)&&(distancia[a-1][b-1]<distancia[a][b])){
            boolean ok = false;
            int i = a;
            int j = b;
            while((!ok) && (i >= 0) && (j >= 0)){
                if(auxiliar[i][j] == color2){
                    auxiliar[i][j] = "#";
                    ok = true;
                }
                if(auxiliar[i][j] == color1){
                    ok = true;
                }
                i--;
                j--;
            }
        }
        //en diagonal arriba derecha
        if((b<5)&&(a>0)&&(distancia[a-1][b+1]<distancia[a][b])){
            boolean ok = false;
            int i = a;
            int j = b;
            while((!ok) && (i >= 0) && (j < 6)){
                if(auxiliar[i][j] == color2){
                    auxiliar[i][j] = "#";
                    ok = true;
                }
                if(auxiliar[i][j] == color1){
                    ok = true;
                }
                i--;
                j++;
            }
        }
        //en diagonal abajo izquierda
        if((b>0)&&(a<5)&&(distancia[a+1][b-1]<distancia[a][b])){
            boolean ok = false;
            int i = a;
            int j = b;
            while((!ok) && (j >= 0) && (i < 6)){
                if(auxiliar[i][j] == color2){
                    auxiliar[i][j] = "#";
                    ok = true;
                }
                if(auxiliar[i][j] == color1){
                    ok = true;
                }
                i++;
                j--;
            }
        }
        //diagonal abajo derecha
        if((b<5)&&(a<5)&&(distancia[a+1][b+1]<distancia[a][b])){
            boolean ok = false;
            int i = a;
            int j = b;
            while((!ok) && (j >= 0) && (i < 6)){
                if(auxiliar[i][j] == color2){
                    auxiliar[i][j] = "#";
                    ok = true;
                }
                if(auxiliar[i][j] == color1){
                    ok = true;
                }
                i++;
                j++;
            }
        }        
        
        return auxiliar;
}
    
    //Metodo para crear la matriz auxiliar de distancias
    private static int[][] matDistancia(){
        int[][] matDist = new int[6][6];
        int val = 6;
        for (int i = 0; i < 3; i++){
            if (i == 0){
                for (int j = 0; j < 3; j++){
                    matDist [i][j] = val - j;
                    matDist [j][i] = val - j;
                }   
            }
            val--;
            matDist [1][1] = 3;
            matDist [2][1] = 2;
            matDist [1][2] = 2;            
            matDist [2][2] = 1;            

            for (int j = 0; j < 3; j++){
            matDist[i][5-j] = matDist[i][j];
            matDist[5-i][5-j] = matDist[i][j];
            matDist[5-i][j] = matDist[i][j];
            }
        }        
        return matDist;
    }
    
    //Metodo para limpiar el tablero
    private static String[][] limpiarMatriz(String[][] auxiliar, String color){
        for (int i = 0; i < auxiliar.length; i++){
            for (int j = 0; j < auxiliar[0].length; j++){
                if(auxiliar[i][j] == "*"){
                    auxiliar[i][j] = " ";
                }
                if(auxiliar[i][j] == "#"){
                    auxiliar[i][j] = color;
                }
                if(auxiliar[i][j] == "E"){
                    auxiliar[i][j] = " ";
                }
            }
        }
        return auxiliar;
    }
    
    
    //Metodo para limpiar el tablero al pasar
    private static String[][] limpiarAlPasar(String[][] auxiliar, String unColor){
        for(int i = 0; i < auxiliar.length; i++){
            for(int j = 0; j < auxiliar[0].length; j++){
                if(auxiliar[i][j] == "E"){
                    auxiliar[i][j] = unColor;
                }
            }
        }
        
        return auxiliar;
    }
    
    
    //Metodo para validar si restan movimientos
    private static boolean partidaFinalizada(String[][] auxiliar, String otroColor){
        boolean terminado = true;
        for(int i = 0; i < auxiliar.length; i++){
            for(int j = 0; j < auxiliar[0].length; j++){
                if(auxiliar[i][j] == otroColor){
                    terminado = false;
                }
            }
        }
        
        return terminado;
    }

    //pasar jugada
    public static boolean hayMovimientos(String[][] auxiliar){
        boolean hay = false;
        boolean asterisco = false;
        boolean numeral = false;
        for(int i = 0; i < auxiliar.length; i++){
            for(int j = 0; j < auxiliar[0].length; j++){
                if(auxiliar[i][j] == "*"){
                    asterisco = true;
                }
                if(auxiliar[i][j] == "#"){
                    numeral = true;
                }
            }
        }
        
        if(numeral || asterisco){
            hay = true;
        }
        
        if(!hay){
            System.out.println();
            System.out.println("\u001B[32m"+"<--------- NO HAY MOVIMIENTOS POSIBLES --------->");
            System.out.println("\u001B[32m"+"<--------------- SIGUIENTE TURNO --------------->"+"\u001B[30m");
            System.out.println();
        }
        
        return hay;
    }   


}
