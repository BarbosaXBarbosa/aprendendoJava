/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1.JavaBasico;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author João Victor Barbosa
 */

// Aprendendo sobre Objetos, escopos e polimorfismo no geral
/*public class Principal {
    //Atributos
    private static Aluno aluno, aluno2;
    private static Endereco endereco;
    private static Empregado empregado;
    private static Diretor diretor;
    private static PersisteEmMemoria alunos;
    

    //Métodos main
    
    // Criação de um aluno
    /*public static void main (String args[]) {
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        endereco = new Endereco ();
        endereco.definirPais("Brasil");
        endereco.definirUF("RJ");
        endereco.definirCidade ("Rio de Janeiro");
        endereco.definirRua("Avenida Rio Branco");
        endereco.definirNumero("156A");
        endereco.definirCEP(20040901);
        endereco.definirComplemento("Bloco 03 - Ap 20.005");
        aluno = new Aluno ("Marco Antônio", data , 901564098 , endereco);
        aluno.atualizarIdade();
        idade = aluno.recuperarIdade();
    }*/
    
    // Criação de um diretor (Demonstração de Poliformismo)
    /*public static void main (String args[]) {
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        empregado = new Empregado ("Clara Silva", data , 211456937 , null);
        empregado.gerarMatricula();
        diretor = new Diretor ("Marco Antônio", data , 901564098 , null);
        diretor.gerarMatricula();
        
        System.out.println ("A matrícula do Diretor é: " + diretor.recuperarMatricula());
        System.out.println ("A matrícula do Empregado é: " + empregado.recuperarMatricula());
        
        diretor.alterarMatricula();
        System.out.println ("A nova matrícula do Diretor é: " + diretor.recuperarMatricula());
        
        diretor.alterarMatricula("Nova Matrícula top 100% atualizada");
        System.out.println ("A nova matrícula do Diretor é: " + diretor.recuperarMatricula());
        
    }*/
    
    
    //Teste com polimorfismo e generalização
    /*public static void main (String args[]) {
        
        PersisteEmMemoria<Aluno> persistir = new PersisteEmMemoria<>();
        
        
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        aluno = new Aluno ("Marco Antônio", data , 901564098 , null);
        
        aluno2 = new Aluno ("Marco2 Antônio", data , 901564098 , null);
        
        List<Aluno> lista = persistir.push(aluno);
        
        System.out.println("Lista com um aluno"); 
        for (Aluno px: lista)
            System.out.println(px.recuperarNome());
        
        lista = persistir.push(aluno2); // Armazene a lista retornada aqui
        
        System.out.println("Lista com dois aluno");
        for (Aluno px: lista)
            System.out.println( px.recuperarNome());
    }    
}*/

//Trabalhando com Coleções e API collectors
public class Principal {
        
    //Atributos
    private static Aluno aluno1 , aluno2 , aluno3 , aluno4 , aluno5 , aluno6 , aluno7 , aluno8 , aluno9;
    private static Escola escola;
    

    //Métodos main
    public static void main (String args[]) {
        escola = new Escola ( "Escola Pedro Álvares Cabral" , "42.336.174/0006-13");
        criarAlunos ();
        matricularAlunos ();
	escola.agruparAlunos(0.1);
    }

    //Métodos
    private static void criarAlunos ( ) {
	aluno1 = new Aluno ( "Marco Antônio" , "Rio de Janeiro" );
        aluno2 = new Aluno ( "Clara Silva" , "Rio de Janeiro" );
        aluno3 = new Aluno ( "Marcos Cintra" , "Sorocaba" );
        aluno4 = new Aluno ( "Ana Beatriz" , "Barra do Pirai" );
        aluno5 = new Aluno ( "Marcio Gomes" , "São Paulo" );
        aluno6 = new Aluno ( "João Carlos" , "Sorocaba" );
        aluno7 = new Aluno ( "César Augusto" ,  "São Paulo" );
        aluno8 = new Aluno ( "Alejandra Gomez" , "Madri" );
        aluno9 = new Aluno ( "Castelo Branco" , "São Paulo" );
    }
    private static void matricularAlunos ( ) {
        escola.matricularAluno(aluno1);
        escola.matricularAluno(aluno2);
        escola.matricularAluno(aluno3);
        escola.matricularAluno(aluno4);
        escola.matricularAluno(aluno5);
        escola.matricularAluno(aluno6);
        escola.matricularAluno(aluno7);
        escola.matricularAluno(aluno8);
        escola.matricularAluno(aluno9);
    }
}

/*public class Principal {
    
    
    private static Pessoa pessoa;
    
    
    public static void main (String args[]) {
        List<Pessoa> pessoas = new ArrayList<>();
        
        pessoas.add(new Pessoa("Ana", 29 ));
        pessoas.add(new Pessoa("Carlos", 42 ));
        pessoas.add(new Pessoa("Beatriz", 50 ));
        pessoas.add(new Pessoa("Marcos", 33 ));
        pessoas.add(new Pessoa("Joao", 18 ));
        pessoas.add(new Pessoa("Roberto", 25 ));
        pessoas.add(new Pessoa("Denise", 38 ));
        
        
        List<String> lista = pessoas.stream()
                    .map(Pessoa::recuperarNome)
                    .collect(Collectors.toList());
        lista.forEach(str->System.out.println(str));
        
        String nomes = pessoas.stream()
                        .map(Pessoa::recuperarNome)
                        .collect(Collectors.joining(", "));
        
        int totalIdade = pessoas.stream()
                        .collect(Collectors.summingInt(Pessoa::recuperarIdade));
        
        System.out.println (nomes);
        System.out.println(totalIdade);
        
    }
}*/
    