/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author João Victor Barbosa
 */
package tema2.GereEcola;


public class Derivada extends Base {
    protected int var_der;
    public Derivada ( ){
        System.out.println ("O valor de var_base antes da instanciacao da classe Derivada eh " + this.var_base );
        this.var_base = this.var_der = -2;
    }
    public void atualizarVarDer ( int valor ) {
        this.var_der = valor;
    }
    public void imprimirVarDer ( ) {
        System.out.println ("O valor de var_der eh " + this.var_der );
    }
}
