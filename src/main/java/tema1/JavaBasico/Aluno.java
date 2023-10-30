/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1.JavaBasico;

/**
 *
 * @author João Victor Barbosa
 */

//Importações

import java.util.Calendar;

//Classe
/*public class Aluno {
    
    //Atributos
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;

    //Métodos
    protected Aluno ( String nome , int idade ) {
         aleatorio = new Random ();
         this.nome = nome;
         this.idade = idade;
         this.codigo_identificador = aleatorio.nextDouble ();
    }
    public void definirNome ( String nome ) {
         this.nome = nome;
    }  
    public void definirIdade ( int idade ) {
         this.idade = idade;
    }

    public String getNome () {
        return this.nome;
    }

    public int getIdade () {
        return this.idade;
    }

    public static void main(String[] args) {
        // Cria uma nova instância da classe Aluno
        Aluno aluno1 = new Aluno("João", 20);

        // Usa os métodos getter para obter o nome e a idade do aluno
        String nome = aluno1.getNome();
        int idade = aluno1.getIdade();

        // Imprime as informações do aluno
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
    }
}*/


/*public class Aluno extends Pessoa {
   	//Atributos    
   	private String matricula;

   	//Métodos
   	public Aluno ( String nome , Calendar data_nascimento , long CPF , Endereco endereco ) {
   	    super ( nome , data_nascimento , CPF , endereco );
   	}
}*/

//Trabalhando com coleções Utilizando o map
public class Aluno extends Object {
    //Atributos    
    private String matricula , nome , naturalidade;
    //Métodos
    public Aluno ( String nome , String naturalidade ) {
        this.nome = nome;
        this.naturalidade = naturalidade;
    }
    
    @Override
    public String toString () {
        return String.format("%s(%s)", nome , naturalidade );
    }
    
    public String recuperarNaturalidade () {
        return this.naturalidade;
    }
} 
