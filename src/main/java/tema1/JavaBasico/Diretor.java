/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1.JavaBasico;

import java.util.Calendar;
import java.util.UUID;

/**
 *
 * @author João Victor Barbosa
 */
public class Diretor extends Empregado {
    //Atributos
	
    //Métodos	
    public Diretor(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
         super(nome, data_nascimento, CPF, endereco);	
    }	

    //Poliformismo
    
    //-Sobreescrita
    @Override
    protected String gerarMatricula () {
         return matricula = "E-" + UUID.randomUUID( ).toString( );	
    }
   
    //- Sobrecarga de método
    public String alterarMatricula () {
        return gerarMatricula ();
    }
    public void alterarMatricula ( String matricula ) {
        this.matricula = matricula;
    }
}
