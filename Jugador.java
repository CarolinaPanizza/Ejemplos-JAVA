package distancia;

import java.util.*;
import java.util.Collection;


public class Jugador implements Comparable<Jugador> {
    private String nombre;
    private int edad;
    private String alias;
    private int partidasGanadas;
    private int partidasJugadas;

    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getAlias(){
        return alias;
    }
    
    public int getPartGanadas(){
        return partidasGanadas;
    }
    
    public int getPartJugadas(){
        return partidasJugadas;
    }
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
   
    public void setEdad(int unaEdad){
        this.edad = unaEdad;
    }
    
    public void setAlias(String unAlias){
        this.alias = unAlias;
    }
    
    private void setPartGanadas(int unaPartida){
        this.partidasGanadas = unaPartida;
    }
    
    private void setPartJugadas(int unaPartida){
        this.partidasJugadas = unaPartida;
    }
            
    public void unaPartidaGanada(){
        int ganadas = this.getPartGanadas();
        ganadas++;
        this.setPartGanadas(ganadas);
    }
    
    public void unaPartidaJugada(){
        int jugadas1 = this.getPartJugadas();
        jugadas1++;
        this.setPartJugadas(jugadas1);
    }
    
    public Jugador(String unNombre, int unaEdad, String unAlias){
        this.nombre = unNombre;
        this.edad = unaEdad;
        this.alias = unAlias;
        this.partidasGanadas = 0;
        this.partidasJugadas = 0;
    }
    
    
 
    @Override
    public String toString(){
        return "Nombre: " + this.getNombre() + "\t" + "Alias: " + this.getAlias()+ "\t" + "Edad: " + this.getEdad()+ "\t" + "Partidas Ganadas: " + this.getPartGanadas()+ "\t" + "Partidas Jugadas: " + this.getPartJugadas();
    }
    
    //comparar alias
    public boolean mismoAlias(String unAlias){
        return (this.getAlias().equals(unAlias));
        
    }
    
    @Override
    public int compareTo(Jugador unJugador){
        return this.partidasGanadas - unJugador.partidasGanadas;
       
    }


   
            
}
