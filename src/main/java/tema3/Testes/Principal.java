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
import java.util.InputMismatchException;
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
    
    /*private static Fibonacci fib;
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
    }*/
    
    
    //Implementando tratamento direto no método
    /*public static void main ( String args [ ] ) {
        int dividendo, divisor;
        String controle = "s";
	        
        Calculadora calc = new Calculadora ( );
        Scanner s = new Scanner ( System.in );
        do {    
            System.out.println ( "Entre com o dividendo." );
            dividendo = s.nextInt();
            System.out.println ( "Entre com o divisor." );
            divisor = s.nextInt();
            System.out.println ( "O quociente é: " + calc.divisao ( dividendo , divisor ) );
            System.out.println ( "Repetir?" );
            controle = s.next().toString();
        } while ( !controle.equals( "n" ) );
        s.close();
    }*/
    
    //Implementando tratamento com a instrução throws
    /*public static void main ( String args [ ] ) {
        int dividendo, divisor;
        String controle = "s";
	        
        Calculadora calc = new Calculadora ( );
        Scanner s = new Scanner ( System.in );
        do {    
            System.out.println ( "Entre com o dividendo." );
            dividendo = s.nextInt();
            System.out.println ( "Entre com o divisor." );
            divisor = s.nextInt();
            try {
                System.out.println ( "O quociente é: " + calc.divisao ( dividendo , divisor ) );
            } catch ( ArithmeticException e ) {
                System.out.println( "ERRO: Divisão por zero! " + e.getMessage() );
            }
            System.out.println ( "Repetir?" );
            controle = s.next().toString();
        } while ( !controle.equals( "n" ) );
        s.close();
    }*/
    
    
    //Encadeamento de exceções
    /*private static Scanner entrada;
    private static long res = 0;
    private static long fat = 0;
     
    public static void main ( String args [ ] ) {
        long num = 0;
        entrada = new Scanner ( System.in );
        do {
            System.out.println ( "Entre com um numero inteiro ou \"-1\" para sair: " );
            try {
                num = lerEntrada ( entrada );
            } catch ( ErroValidacao erro ) {
                System.out.println ( "Entrada inválida!" );
                System.out.println ( "Causa: " + erro.getCause ( ) );
                erro.printStackTrace( System.out );
                System.exit ( -1 );
            }
            if ( num == -1 )
                System.exit ( 0 );
            else
                try {
                    System.out.println ( "O fatorial de " + num + " é: " + calcularFatorial( num ) );
                } catch ( ErroValidacao erro ) {
                    erro.printStackTrace( System.out );
                }
        } while ( num >= 0 );
    }
    private static long lerEntrada ( Scanner entrada ) throws ErroValidacao {
        try {
            return entrada.nextLong();
        } catch ( InputMismatchException erro_entrada ) {
            ErroValidacao erro = new ErroValidacao ( "A entrada " + entrada.next() + " nao eé um numero inteiro!" );
            erro.atribuirCausa ( erro_entrada );
            throw erro;
        }
    }
    private static long calcularFatorial ( long num ) throws ErroValidacao {
        if ( num > 0 ) { 
            res = calcularFatorial ( num - 1 );
            fat = num * res;
            if ( ( fat / res ) != num ) {
                throw new ErroValidacao ( "Overflow!");
            }
            else
                return fat;
        }
        else
            return 1;
    }*/
    
    //Relaçando exceção
    /*public static void main ( String args [ ] ) {
        int dividendo, divisor;
        String controle = "s";
	        
        Calculadora calc = new Calculadora ( );
        Scanner s = new Scanner ( System.in );
        do {    
            System.out.println ( "Entre com o dividendo." );
            dividendo = s.nextInt();
            System.out.println ( "Entre com o divisor." );
            divisor = s.nextInt();
            try {
                System.out.println ( "O quociente é: " + calc.divisao ( dividendo , divisor ) );
            } catch ( ArithmeticException e ) {
                System.out.println( "ERRO: Divisão por zero! " + e.getMessage() );
            }
            System.out.println ( "Repetir?" );
            controle = s.next().toString();
        } while ( !controle.equals( "n" ) );
        s.close();
    }*/
    
    //Criando tratamento de exceção comum
    /*public static void main ( String args [ ] ) throws ErroValidacao {
        int indice1, indice2;
        OperacaoArray calc = new OperacaoArray ();
        char[] op1 = null;
        char[] op2 = null;
        Scanner s = new Scanner ( System.in );
        try {
            System.out.println ( "Entre com o tamanho do primeiro array." );
            indice1 = s.nextInt();
            System.out.println ( "Entre com o tamanho do segundo array." );
            indice2 = s.nextInt();
            
            op1 = new char [indice1];
            op2 = new char [indice2];
            
        } catch ( OutOfMemoryError e ) {
            Runtime runtime = Runtime.getRuntime ();
            System.out.println ( "Memoria insuficiente!" );
            System.out.println ( "A memória total da MVJ eh " + runtime.totalMemory() + " e o máximo eh " + runtime.maxMemory () );
            System.out.println ( "Reconfigure a MVJ usando o parametro -Xmx<size>. Você precisa de " + 16*Short.MAX_VALUE + " soh para os vetores."); 
            System.exit ( -1 );
        }        

        char[] resultado = calc.concatenarArray(op1, op2);

        System.out.println("O tamanho do array resultante é: " + resultado.length);
    }*/
    
    public static void main ( String args [ ] ) { 
        char[] op1 = { 'J' , 'A' , 'V' , 'A' , '.' }; 
        char[] op2 = new char [4]; 
        System.out.println ( copiarArray ( op1 , op2 ) );         
    }     
    private static char[] copiarArray ( char[] op1 , char[] op2 ) { //copia o vetor op1 para op2 
        try { 
            if ( verificarOperandos ( op1 , op2 ) && verificarTamanhoOperandos ( op1 , op2 ) ) { 
                System.arraycopy ( op1 , 0 , op2 , 0 , op1.length ); 
                return op2; 
            } else 
                System.out.println( "A operacao nao pode ser realizada!" ); 
        } catch ( NullPointerException e ) { 
            System.out.println ( "Ponteiro para objeto nulo!" );
            e.getCause();
            throw e;
             
        } catch ( ArrayIndexOutOfBoundsException e ) { 
            System.out.println ( "Tentativa de extrapolar o limite do vetor!" ); 
            System.out.println ( e.getMessage() ); 
            System.exit ( -1 ); 
        } 
        return null; 
    } 
    private static boolean verificarOperandos ( char[] op1 , char[] op2 ) throws ErroOperando , NullPointerException { 
        boolean check = false; 
        if ( ( op1 == null ) && ( op2 == null ) ) 
            throw new ErroOperando ( "Ambos operandos sao nulos!" ); 
        else if ( op1 == null ) 
            throw new ErroOperando ( "Primeiro operando eh nulo!" ); 
        else if ( op2 == null ) 
            throw new ErroOperando ( "Segundo operando eh nulo!" ); 
        else 
            check = true; 
        return check; 
    } 
    private static boolean verificarTamanhoOperandos ( char[] op1 , char[] op2 ) { 
        if ( op1.length > op2.length ) { 
            System.out.println ( "Os tamanhos dos vetores são incompativeis! "); 
            throw new ErroOperando ( new ArrayIndexOutOfBoundsException ( "ESPACO INSUFICIENTE NO SEGUNDO OPERANDO!" ) ); 
        } else     
            return true; 
    } 
}

