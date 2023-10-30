/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1.JavaBasico;

import java.util.Calendar;

/**
 *
 * @author João Victor Barbosa
 */
public class Empregado extends Pessoa {
    //Atributos
    protected String matricula;
    private Calendar data_admissao , data_demissao;
				
    public Empregado(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
        this.matricula = gerarMatricula();
        data_admissao = Calendar.getInstance();
    }
    public void demitirEmpregado () {
        data_demissao = Calendar.getInstance();
    }

    protected String recuperarMatricula () {
        return this.matricula;
    }

    protected String gerarMatricula() {
        return this.matricula = "Matrícula não definida.";
    }
}