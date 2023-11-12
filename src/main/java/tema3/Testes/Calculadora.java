/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.Testes;

/**
 *
 * @author João Victor Barbosa
 */


public class Calculadora {
    //Funcionamento das Excecções e seus blocos de controle
    /*public int divisao ( int dividendo , int divisor )
    {
        try {
            if ( divisor == 0 )
                throw new ArithmeticException ( "Divisor nulo." );
        }
        catch (Exception e)
        { 
            System.out.println( "ERRO: Divisão por zero! " + e.getMessage() );
            return 999999999;            
        }
        return dividendo / divisor;
    }*/
    
    
    
    public int divisao ( int dividendo , int divisor ) throws ArithmeticException
    {
        if ( divisor == 0 )
            throw new ArithmeticException ( "Divisor nulo." );  
        return dividendo / divisor;
    }
} 
