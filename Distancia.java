
package distancia;
import java.util.*;
import java.util.Collections;



public class Distancia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] tablero = Interfaz.matStandard();
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        Jugador[] seleccionados = new Jugador[2];
        String opcion = Interfaz.imprimirMenu();
        while(!opcion.equals("E")){
            if (opcion.equals("A")){
                listaJugadores.add(registrarJugador(listaJugadores));
            }
            if (opcion.equals("B")){
                tablero = Interfaz.establecerTablero();
            }
            if (opcion.equals("C")){
                if(listaJugadores.size() <= 1){
                    System.out.println("\u001B[34m"+"Debe ingresar 2 jugadores antes de iniciar la partida."+"\u001B[30m");
                }else{
                    seleccionados = seleccionarJugadores(listaJugadores);
                    Partida.unaPartida(tablero, seleccionados[0], seleccionados[1]);
                    tablero = Interfaz.matStandard();    
                }
            } 
            if (opcion.equals("D")){
                Interfaz.mostrarRanking(listaJugadores);
            }  
            opcion = Interfaz.imprimirMenu();
        }
        Interfaz.goodBye();
    }
    
        //metodo para seleccionar jugadores
    public static Jugador[] seleccionarJugadores(ArrayList<Jugador> listaJugadores){
        Scanner in = new Scanner(System.in);
        Jugador[] seleccionados = new Jugador[2];
        System.out.println();
        System.out.println("\u001B[32m"+"LISTADO DE JUGADORES:"+"\u001B[30m");        
        for(int i = 0; i < listaJugadores.size(); i++){
            System.out.println("\u001B[32m"+(i+1) + " - " + listaJugadores.get(i)+"\u001B[30m");
        }
        System.out.println();
        System.out.println("Seleccione la posicion del jugador " + "\u001B[31m"+"ROJO "+"\u001B[30m");    
        System.out.println("El dato ingresado debe ser un entero.");
        int k = in.nextInt();
        while(k > listaJugadores.size()){
            System.out.println("\u001B[31m"+"ERROR: fuera de rango! "+"\u001B[30m");
            System.out.println("Por favor seleccione un jugador:");
            k = in.nextInt();
        }
        seleccionados[0] = listaJugadores.get(k-1);
        System.out.println("\u001B[31m"+"Jugador ROJO: "+"\u001B[30m" + seleccionados[0].getAlias().toUpperCase() + " seleccionado.");        
        System.out.println();
        System.out.println("Seleccione la posicion del jugador " + "\u001B[34m"+"AZUL "+"\u001B[30m");    
        System.out.println("El dato ingresado debe ser un entero.");        
        int j = in.nextInt();
        while(j > listaJugadores.size()){
            System.out.println("\u001B[31m"+"ERROR: fuera de rango! "+"\u001B[30m");
            System.out.println("Por favor seleccione un jugador:");
            j = in.nextInt();
        }        
        while(j == k){
            System.out.println("\u001B[31m"+"ERROR: El jugador ya fue seleccionado! "+"\u001B[30m");
            System.out.println("Por favor seleccione otro jugador:");            
            j = in.nextInt();            
        }
        seleccionados[1] = listaJugadores.get(j-1);  
        System.out.println("\u001B[34m"+"Jugador AZUL: "+"\u001B[30m" + seleccionados[1].getAlias().toUpperCase() + " seleccionado.");
        System.out.println();
        return seleccionados;

    }
    
    // metodo para crear un jugador
    public static Jugador registrarJugador(ArrayList<Jugador> listaJugadores){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese Alias: ");
        String unAlias = in.nextLine();
        for (int i = 0; i < listaJugadores.size(); i++){
            while(listaJugadores.get(i).mismoAlias(unAlias)){
                System.out.println("El jugador ya existe, ingrese otro Alias");
                unAlias = in.nextLine();   
            }
        }
        System.out.println("Ingrese Nombre: ");
        String unNombre = in.nextLine();   
        System.out.println("Ingrese Edad: ");
        int unaEdad = in.nextInt();
        in.nextLine();
        Jugador unJugador = new Jugador(unNombre, unaEdad, unAlias);
        System.out.println("\u001B[32m"+"-------------------------------------------------");
        System.out.println("\u001B[32m"+"           EL JUGADOR HA SIDO INGRESADO ");
        System.out.println("\u001B[32m"+"-------------------------------------------------"+"\u001B[30m");
        System.out.println();
        return unJugador;
    }    
}

