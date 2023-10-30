/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1.JavaBasico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tema1.JavaBasico.Aluno;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author João Victor Barbosa
 */

/*class Escola {
    //Atributos
    private String nome, CNPJ;   
    private Endereco endereco;
    private Departamento departamentos [];
    private Aluno discentes [];
    private int nr_discentes , nr_departamentos;

    //Métodos
    public Escola ( String nome , String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new Departamento [10];
        this.discentes = new Aluno [1000];
        this.nr_departamentos = 0;
        this.nr_discentes = 0;
    }
    public void criarDepartamento ( String nomeDepartamento ) {
        if ( nr_departamentos <= 10 )
        {
            departamentos [ nr_departamentos ] = new Departamento ( nomeDepartamento );                
            nr_departamentos++;
        } else {
            System.out.println ( "Nao e possivel criar outro Departamento." );
        }
    }
    public void matricularAluno ( Aluno novoAluno ) {
       discentes [ nr_discentes ] = novoAluno;
    }
}*/

//Trabalhanco com coleções utilizando o map
/*class Escola {
    //Atributos
    private String nome, CNPJ;   
    private Endereco endereco;
    private List departamentos;
    private List discentes;
    private Aluno a;


    //Métodos
    public Escola ( String nome , String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<Departamento> ( );
        this.discentes = new ArrayList<Aluno> ( );
    }
    public void criarDepartamento ( String nomeDepartamento ) {
        departamentos.add ( new Departamento ( nomeDepartamento ) );
    }
    public void fecharDepartamento ( Departamento departamento ) {
        departamentos.remove ( departamento );
    }
    public void matricularAluno ( Aluno novoAluno ) {
        discentes.add ( novoAluno );
    }
    public void trancarMatriculaAluno ( Aluno aluno ) {
        discentes.remove ( aluno );
    }
    public void agruparAlunos ( ) {
        Map < String , List < Aluno > > agrupamento = new HashMap <> ();
        for (Iterator it = discentes.iterator(); it.hasNext();) {
            Aluno aluno = (Aluno) it.next();
            if(!agrupamento.containsKey ( aluno.recuperarNaturalidade ( ) )) {
                agrupamento.put( aluno.recuperarNaturalidade ( ) , new ArrayList<>( ) );
            }
            agrupamento.get(aluno.recuperarNaturalidade ( ) ).add(aluno);
        }
    System.out.println ("Resultado do agrupamento por naturalidade: " + agrupamento );
    }
}*/

//Utilizando o collectors com a assinatura Grouping By
class Escola {
    //Atributos
    private String nome, CNPJ;   
    private Endereco endereco;
    private List departamentos;
    private List discentes;

    //Métodos
    public Escola ( String nome , String CNPJ) {
    	this.nome = nome;
    	this.CNPJ = CNPJ;
    	this.departamentos = new ArrayList ( );
    	this.discentes = new ArrayList<> ( );
    }
    public void criarDepartamento ( String nomeDepartamento ) {
	        departamentos.add ( new Departamento ( nomeDepartamento ) );
    }
    public void fecharDepartamento ( Departamento departamento ) {
	        departamentos.remove ( departamento );
    }
    public void matricularAluno ( Aluno novoAluno ) {
	        discentes.add ( novoAluno );
    }
    public void trancarMatriculaAluno ( Aluno aluno ) {
	        discentes.remove ( aluno );
    }
    
    //Método utilizando List
    public void agruparAlunos ( ) {
        Map < String , List < Aluno > > agrupamento = 
        (Map < String , List < Aluno > >) discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade));
        System.out.println ("Resultado do agrupamento por naturalidade utilizando a primeira assinatura: ");
        agrupamento.forEach (( String chave , List < Aluno > lista) -> System.out.println (chave + " = " + lista ));
    }
    
    //Método utilizando Set
    public void agruparAlunos ( int a ) {
        Map < String , Set < Aluno > > agrupamento = 
        (Map < String , Set < Aluno > >) discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade , Collectors.toSet()));
        System.out.println ("Resultado do agrupamento por naturalidade utilizando a segunda assinatura: ");    
        agrupamento.forEach (( String chave , Set < Aluno > conjunto) -> System.out.println (chave + " = " + conjunto ));
    }
    
    //Método utilizando o Set, porém mantendo as entradas ordenadas
    public void agruparAlunos ( double a ) {
        Map < String , Set < Aluno > > agrupamento = 
        (Map < String , Set < Aluno > >) discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade , TreeMap::new , Collectors.toSet()));
        System.out.println ("Resultado do agrupamento por naturalidade utilizando a terceira assinatura: ");    
        agrupamento.forEach (( String chave , Set < Aluno > conjunto) -> System.out.println (chave + " = " + conjunto ));
    }
    
/*  Uma observação sobre o método “groupingBy” é que ele não é otimizado para execuções concorrentes. 
    Caso você precise trabalhar com agrupamento de objetos e concorrência, a API Java fornece uma versão apropriada para esse caso.

    Todas as três variantes possuem uma contraparte chamada “groupingByConcurrent”, destinada ao uso num ambiente multithread. 
    As assinaturas, os parâmetros e o retorno – e, portanto, o uso − são exatamente os mesmos que na versão para desenvolvimento não paralelizado.*/
}