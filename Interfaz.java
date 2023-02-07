package distancia;
import java.util.*;
public class Interfaz {
    //Muestra el tablero
    public static void imprimirMatriz(String[][] unaMatriz){
        System.out.print("\t");
        for (int i = 0; i < 6; i++){
            System.out.print(" " + (i+1));
        }
        System.out.println();
        System.out.println("\t"+"+-+-+-+-+-+-+");
        char lateral = 'A';
        for (int i = 0; i < 6; i++){
            System.out.print(lateral + "\t"+"|");
            for (int j = 0; j < 6; j++){
                if((unaMatriz[i][j] == "A")||(unaMatriz[i][j] == " ")){
                    System.out.print("\u001B[34m" + unaMatriz[i][j] + "\u001B[30m"+"|");                    
                }
                if(unaMatriz[i][j] == "R"){
                    System.out.print("\u001B[31m" + unaMatriz[i][j] + "\u001B[30m"+"|");                    
                }
                if((unaMatriz[i][j] == "E")||(unaMatriz[i][j] == "#")||(unaMatriz[i][j] == "*")){
                    System.out.print("\u001B[32m" + unaMatriz[i][j] + "\u001B[30m"+"|");                    
                }
            }
            System.out.print("\t" + lateral);
            lateral++;
            System.out.println();
            System.out.println("\t"+"+-+-+-+-+-+-+");
        }
        System.out.print("\t");
        for (int i = 0; i < 6; i++){
            System.out.print(" " + (i+1));
        }
        System.out.println();
    }
    
    //Muestra el menu
    public static String imprimirMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("\u001B[31m"+"-------------------------------------------------");
        System.out.println("\u001B[31m"+"                    DISTANCIA                    ");
        System.out.println("\u001B[31m"+"-------------------------------------------------"+"\u001B[30m");
        System.out.println();
        System.out.println("\u001B[34m"+"<-------------   MENU PRINCIPAL  -------------->");
        System.out.print("\u001B[30m");
        System.out.println("A- Registrar jugador");
        System.out.println("B- Establecer tablero");
        System.out.println("C- Jugar partida");
        System.out.println("D- Ranking");
        System.out.println("E- Salir");
        System.out.println("\u001B[34m"+"<---------------------------------------------->");
        System.out.println("\u001B[30m");
        System.out.println("Por favor, ingrese la opcion deseada: ");
        String opcion = in.next().toUpperCase();
        while(!((opcion.equals("A"))||(opcion.equals("B"))||(opcion.equals("C"))||(opcion.equals("D"))||(opcion.equals("E")))){
            System.out.println("La opcion no es correcta. Por favor reintente. ");
            opcion = in.next().toUpperCase();
        }
        return opcion;
    }
    
    //Selecciona el tablero
    public static String[][] establecerTablero(){
        Scanner in = new Scanner(System.in);        
        String[][] matriz = matStandard();
        System.out.println("\u001B[34m"+"<------------ ESTABLECER TABLERO -------------->");
        System.out.print("\u001B[30m");
        System.out.println("A- Tablero Standard");
        System.out.println("B- Tablero Precargado 1");
        System.out.println("C- Tablero Precargado 2");
        System.out.println("\u001B[34m"+"<---------------------------------------------->");
        System.out.println("\u001B[30m");
        System.out.println("Por favor, seleccione el tablero: ");
        System.out.println();
        String opcion = in.next().toUpperCase();
        
        while(!((opcion.equals("A"))||(opcion.equals("B"))||(opcion.equals("C")))){
            System.out.println("La opcion no es correcta. Por favor reintente. ");
            opcion = in.next().toUpperCase();
            
        }
        System.out.println();
        if (opcion.equals("B")){
            matriz = matPrecargado1();
        }
        if (opcion.equals("C")){
            matriz = matPrecargado2();
        }        
        return matriz;
    }
    
    //Metodo que crea la matriz Standard    
    public static String[][] matStandard(){
        String[][] stnd = new String [6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(((i+j)%2) == 0){
                    stnd[i][j] = "A";                    
                }else{
                    stnd[i][j] = "R";
                }
            }
        }
        return stnd;
    }
    
    //Metodo que crea la matriz precargado 1
    public static String[][] matPrecargado1(){
        String[][] pre1 = new String[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                pre1[i][j] = " ";
            }
        }
        pre1[0][0] = "R";
        pre1[2][2] = "A";
        pre1[3][5] = "A";
        pre1[4][1] = "A";
        pre1[5][3] = "R";
        return pre1;
    }
    
    //Metodo que crea la matriz precargado 2    
    public static String[][] matPrecargado2(){
        String[][] pre2 = new String[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                pre2[i][j] = " ";
            }
        }
        pre2[0][0] = "R";
        pre2[5][5] = "A";
        pre2[5][4] = "A";
        return pre2;
    }       

    //Metodo para mostrar ranking
    public static String mostrarRanking(ArrayList<Jugador> listaJugador){
        Scanner in = new Scanner(System.in);
        Collections.sort(listaJugador, Collections.reverseOrder());
        System.out.println("\u001B[34m"+"RANKING:");
        System.out.print("\u001B[30m");
        for(int i = 0; i < listaJugador.size(); i++){
            System.out.println("\u001B[34m"+(i+1) + " - " + listaJugador.get(i)+"\u001B[30m");
        }
        System.out.println("\u001B[30m");
        System.out.println("X para volver al MENU PRINCIPAL");
        String opcion = in.nextLine().toUpperCase();
        while(!opcion.equals("X")){
            System.out.println("X para volver al MENU PRINCIPAL");
            opcion = in.nextLine().toUpperCase();
        }
        return opcion;
      

    }
    
    //Metodo para finalizar
    public static void goodBye(){
        System.out.println("\u001B[31m"+"-------------------------------------------------");
        System.out.println("\u001B[31m"+"                    DISTANCIA                    ");
        System.out.println("\u001B[31m"+"-------------------------------------------------"+"\u001B[30m");
        System.out.println();
        
        System.out.println("\u001B[34m"+"-------------------------------------------------");
        System.out.println("\u001B[34m"+"               NOS VEMOS PRONTO!  ");
        System.out.println("\u001B[34m"+"-------------------------------------------------");

    }
    
    //Validar la posicion inicial
    public static int[] validarPosInicial(Jugador unJugador, String color, String[][] auxiliar, Jugador otroJugador){
        Scanner in = new Scanner(System.in);
        int interrumpido = 0;
        int ai = 0;
        int bi = 0;        
        System.out.println(unJugador.getAlias().toUpperCase()+" ("+color+")" +": seleccione posicion inicial");
        String inicial = in.nextLine().toUpperCase();
        if(inicial.equals("X")){
            interrumpido = 1;
        }else{
            ai = inicial.charAt(0) - 65;
            bi = inicial.charAt(1) - 49;
            while ((ai > 6)||(ai < 0)||(bi > 6)||(bi < 0)||(auxiliar[ai][bi]!= color)){
                System.out.println(unJugador.getAlias().toUpperCase() +" ("+color+")" + ": la posicion no es correcta");
                System.out.println("\u001B[31m"+"Por favor, vuelva a ingresar: "+"\u001B[30m");           
                inicial = in.nextLine().toUpperCase();
                    ai = inicial.charAt(0) - 65;
                    bi = inicial.charAt(1) - 49;
            }
        }
        int[] posi = {ai, bi, interrumpido};
        return posi;
    }
    
    //Validar la posicion final
    public static int[] validarJugadaFinal(Jugador unJugador, String[][] auxiliar, String color, Jugador otroJugador){
        Scanner in = new Scanner(System.in);
        int interrumpido = 0;
        int af = 0;
        int bf = 0;
        System.out.println(unJugador.getAlias().toUpperCase()+" ("+color+")" +": seleccione posicion final");
        String posfinal = in.nextLine().toUpperCase();
        if(posfinal.equals("X")){
            interrumpido = 1;
        }else{
            af = posfinal.charAt(0) - 65;
            bf = posfinal.charAt(1) - 49;
            while ((af > 6)||(af < 0)||(bf > 6)||(bf < 0)||((auxiliar[af][bf]!="*")&&(auxiliar[af][bf]!="#")&&(auxiliar[af][bf] != "E"))){
                System.out.println(unJugador.getAlias().toUpperCase()+" ("+color+")" +": la posicion no es correcta");
                System.out.println("\u001B[31m"+"Por favor, vuelva a ingresar: "+"\u001B[30m");           
                posfinal = in.nextLine().toUpperCase();
                    af = posfinal.charAt(0) - 65;
                    bf = posfinal.charAt(1) - 49;
            }
        }
        int [] posf = {af, bf, interrumpido};
        return posf;
    }
    
    //Muestra el ganador
    public static void imprimirGanador(Jugador j1){
            System.out.println("\u001B[34m"+"-------------------------------------------------");
            System.out.println("\u001B[34m"+"       "+j1.getAlias().toUpperCase()+" HA GANADO LA PARTIDA");
            System.out.println("\u001B[34m"+"-------------------------------------------------"+"\u001B[30m");        
            System.out.println();
    }
    
    //Valida si la partida finalizo
    public static boolean partidaFinalizada(String[][] auxiliar, Jugador unJugador, String otroColor){
        boolean ganador = true;
        for (int i = 0; i < 5; i++){
            for(int j = 0; (j < 5) && ganador; j++){
                if(auxiliar[i][j] == otroColor){
                    ganador = false;
                }                    
            }
        }
        return ganador;
    }
    
}