/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author João Victor Barbosa
 */

//Pacotes
package tema2.GereEcola;

//Classe
public class Endereco {
    //Atributos
    protected String numero;
    protected String rua;
    protected String cidade;
    protected String estado;
    protected int    cep;
    protected String pais;
    protected String complemento;
    
    public Endereco ( ){}
    
    protected void definirPais ( String pais) {  
        this.pais = pais;
    }
    protected void definirUF (String uf) {
        this.estado = uf;
    }
    protected void definirCidade (String cidade) {
        this.cidade = cidade;
    }
    protected void definirRua (String rua) {
         if ( rua == null) {
            throw new IllegalArgumentException("variavel não pode ser nula");
        }
        this.rua = rua;
    }
    protected void definirNumero (String numero) {
        this.numero = numero;
    }
    protected void definirCEP (int cep) {
        this.cep = cep;
    }
    protected void definirComplemento (String complemento) {
        this.complemento = complemento;
    }
    
}
