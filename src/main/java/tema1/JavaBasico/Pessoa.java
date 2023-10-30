/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1.JavaBasico;

import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

/**
 *
 * @author João Victor Barbosa
 */
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long CPF;
    private Endereco endereco;

    //Métodos
    public Pessoa ( String nome , Calendar data_nascimento, long CPF , Endereco endereco ) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        atualizarIdade ();
    }
    
    //Trabalhando com coleções usando o collectors
    public Pessoa ( String nome , int idade ) {
        this.nome = nome;
        this.idade = idade;
    }
    
    protected void atualizarNome ( String nome ) {
        this.nome = nome;
    }
    protected String recuperarNome ( ) {
        return this.nome;
    }
    protected void atualizarIdade ( ) {
        this.idade = calcularIdade ();
    }
    protected int recuperarIdade ( ) {
        return this.idade;
    }
    protected void atualizarCPF ( long CPF ) {
        this.CPF = CPF;
    }
    protected long recuperarCPF ( ) {
        return this.CPF;
    }
    protected void atualizarEndereco ( Endereco endereco ) {
        this.endereco = endereco;
    }
    protected Endereco recuperarEndereco ( ) {
        return this.endereco;
    }
    private int calcularIdade ( ){
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(YEAR) - data_nascimento.get(YEAR);
        if ( ( data_nascimento.get(MONTH) > hoje.get(MONTH) ) || ( data_nascimento.get(MONTH) ==                 
        hoje.get(MONTH) && data_nascimento.get(DATE) > hoje.get(DATE) ) )
            lapso--;
        return lapso;
    }
}
