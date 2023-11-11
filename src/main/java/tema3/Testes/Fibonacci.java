/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author João Victor Barbosa
 */

package tema3.Testes;

//imports
// Não há
 
public class Fibonacci {
    //Atributos
    private static int conta_chamada = 0; //conta o número de chamadas recursivas

    public double CalcularFibonacci ( double num ) {
        conta_chamada++;
        System.out.println ( "Chamada recursiva nr: " + conta_chamada );
        if ( num != 2 && num != 1 ) {
            double numAnt = num - 1;
            double numAnt2 = num - 2;
            
            return CalcularFibonacci(numAnt) + CalcularFibonacci(numAnt2);
        }
        else
            return 1;
    }    
}
