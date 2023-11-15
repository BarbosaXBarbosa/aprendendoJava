/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.Threads;

import java.util.concurrent.Semaphore;

/**
 *
 * @author João Victor Barbosa
 */
public class PingPong {
    //Atributos
    private Semaphore s1 , s2;
    private Ping ping;
    private Pong pong;
    private Contador contador;
    private int tamanho_partida;

    //Métodos
    public PingPong ( int tamanho_partida ) throws InterruptedException {
        s1 = new Semaphore(0);
        s2 = new Semaphore(0);
        contador = new Contador ( tamanho_partida );
        ping = new Ping ( s1 , s2 , contador );
        pong = new Pong ( s1 , s2 , contador );
        //juiz = new Juiz ( tamanho_partida / 2 );
        new Thread ( ping ).start ();
        new Thread ( pong ).start ();
        s1.release();
     }   
}