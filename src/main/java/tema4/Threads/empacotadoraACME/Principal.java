/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author João Victor Barbosa
 */

package tema4.Threads.empacotadoraACME;

public class Principal {
    //Atributo
    private static Empresa ACME;

    //Métodos
    public static void main ( String args [ ] ) throws InterruptedException {
        // Empresa (número de fitas, empregados disponíveis, número máximo de equipes, produtos a serem empacotados)
	ACME = new Empresa ( 20 , 25 , 4 , 200 );
    }    
}
