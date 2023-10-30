/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author João Victor Barbosa
 */
package tema2.GereEcola;

//Classe
public class Base {
    protected int var_base;
    public Base ( ){
        var_base = -1;
    }
    protected void atualizarVarBase ( int valor ) {
        this.var_base = valor;
    }
    protected void imprimirVarBase ( ) {
        System.out.println ("O valor de var_base é " + this.var_base );
    }
    protected void atualizarVarSub ( int valor ) {
        ((Derivada)this).var_der = valor;
    }
    protected void imprimirVarSub ( ) {
        System.out.println ("O valor de var_der na subclasse é " + ((Derivada)this).var_der );
    }
}
