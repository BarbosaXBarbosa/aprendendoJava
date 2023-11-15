/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.Testes;

/**
 *
 * @author João Victor Barbosa
 */
public class OperacaoArray {
  
    public char[] concatenarArray ( char[] op1 , char[] op2 ) throws ErroValidacao {

        int tamnh_res;
        if (op1 == null || op2 == null )
            throw new ErroValidacao("O array não foi alocado corretamente");

        tamnh_res = op1.length + op2.length;

        return copiarArray ( op1 , op2 , tamnh_res , op2.length );
    }
        
    private char[] copiarArray ( char[] op1 , char[] op2 , int tamnh_res , int n ){
        char[] resultado = new char [ tamnh_res ];
        System.arraycopy ( op1 , 0 , resultado , 0 , op1.length );
        System.arraycopy ( op2 , 0 , resultado , op1.length , n );
        return resultado;
    }
}