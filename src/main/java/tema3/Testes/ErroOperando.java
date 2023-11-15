/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.Testes;

/**
 *
 * @author João Victor Barbosa
 */
public class ErroOperando extends NullPointerException { 
    ErroOperando ( String msg_erro ) { 
        super ( msg_erro ); 
    }     
    ErroOperando ( Throwable causa ) { 
        initCause ( causa ); 
    }         
    @Override 
    public String toString ( ) { 
        return "Operando nulo: " + this.getMessage(); 
    } 
} 
