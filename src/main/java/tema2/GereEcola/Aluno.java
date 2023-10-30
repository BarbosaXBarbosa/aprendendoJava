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

//Importações
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import tema2.Matematica.Nota;

//Classe
public class Aluno extends Fisica {

    //Atributos
    private String matricula;
    private List<Nota> notas;

    //Métodos
    public Aluno ( String nome , Calendar data_nascimento , String CPF , Endereco endereco , String nacionalidade , String naturalidade ) {
        super ( nome , data_nascimento, CPF , endereco , nacionalidade , naturalidade );
        this.matricula = UUID.randomUUID( ).toString( );
        setIdade ();
    }
    
    protected String getIdAluno () {
        return this.matricula;
    }
    
    protected void setIdAluno ( ) {
        if ( this.matricula.isBlank() )
            this.matricula = UUID.randomUUID( ).toString( );
        else
            System.out.println ( "ERRO: Codigo matricula ja existente!" );
    }
    
    protected void addNota(int valor, Calendar dataProva) {
        Nota nota = new Nota(valor, dataProva);
        this.notas.add(nota);
    }
}
