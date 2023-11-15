/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.Threads;

/**
 *
 * @author João Victor Barbosa
 */
public class Principal {
    //Atributos
    private static PingPong partida;

    //Métodos
    public static void main (String args[]) throws InterruptedException {
          partida = new PingPong ( 8 );
    }    
}
