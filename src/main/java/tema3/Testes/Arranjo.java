/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author João Victor Barbosa
 */

//Pacote
package tema3.Testes;


//Classe
public class Arranjo {
    int [] vetor = { 1 , 2 , 3, 4 };
    int getElemento ( int i ) {
        try {
            if ( i < 0 || i > 3 )
                throw new IllegalAccessException ();
        } catch ( Exception e ) {
            System.out.println ( "ERRO: índice fora dos limites do vetor." );
        }    
        return vetor [i];
    }
}
