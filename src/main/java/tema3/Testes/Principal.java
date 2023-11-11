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

//Importações
import java.util.Calendar;
import java.util.Scanner;
import tema2.GereEcola.Fisica;
import tema2.GereEcola.Juridica;
import tema2.GereEcola.Pessoa;
import java.io.IOException;
import java.util.Scanner;

//Classe
public class Principal {
	
	//Exceção Implícita, ou seja não precisa ser tratada e pode ser contornável
        /*public static void main ( String args [ ] ) throws InterruptedException {
        int divisor , dividendo , quociente = 0;
        String controle = "s";
        
        Scanner s = new Scanner ( System.in );
        do {    
            System.out.println ( "Entre com o dividendo." );
            dividendo = s.nextInt();
            System.out.println ( "Entre com o divisor." );
            divisor = s.nextInt();
            try {
                if ( divisor ==0 )
                    throw new ArithmeticException ( "Divisor nulo." );
                quociente = dividendo / divisor;
            }
            catch (Exception e)
            { 
                System.out.println( "ERRO: Divisão por zero! " + e.getMessage() );
            } 
            System.out.println ( "Repetir?" );
            controle = s.next().toString();
        } while ( controle.equals( "s" ) );
        s.close();
    }*/
	
    //Exceção Explicita, ou seja não é contornável e precisa ser tratada
    /*Arranjo arrj = new Arranjo();
    public static void main(String args[]) {
        Principal main = new Principal();
        int i = main.invocaGetElemento(6);
    }

    int invocaGetElemento(int i) {
        return arrj.getElemento(i);
    }*/
    
    
    //Testando exceção do método setId
    //Atributos
    /*private static Pessoa ref [];
    //Método main
    public static void main (String args[]) throws Throwable {
        ref = new Pessoa [2];
        Calendar data_nasc = Calendar.getInstance();
        Calendar data_criacao = Calendar.getInstance();
        data_nasc.set(1980 , 10 , 23);
        ref [ 0 ] = new Fisica ( "Marco Antônio" , data_nasc , null , null , "Brasil" , "Rio de Janeiro" ); //"365.586.875-45"
        data_criacao.set(1913 , 02 , 01 );
        ref [ 1 ] = new Juridica ( "Escola Novo Mundo Ltda" , data_criacao , null , null , "Brasil" , "Rio de Janeiro" ); //"43.186.666/0026-32"
        ref [ 0 ].setID("482.270.038-00");
        ref [ 1 ].setID("43186666002632");
    }*/
    
    private static Fibonacci fib;
    private static Scanner entrada;
     
    public static void main ( String args [ ] ) {
        double num = 0;
        entrada = new Scanner ( System.in );
        fib = new Fibonacci ();
        do {
            System.out.println ( "Entre com um numero não negativo ou \"-1\" para sair: ");
            num = entrada.nextDouble();
            if ( num == -1 )
                System.exit ( 0 );
            System.out.println ( "O " + num + "n-esimo termo de Fibonacci é: " + fib.CalcularFibonacci( num ) );
        } while ( num >= 0 );
    }
}
