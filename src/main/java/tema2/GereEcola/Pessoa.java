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
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

//Classe
/*public class Pessoa {
    //Atributos
    protected String nome, nacionalidade , naturalidade, identificador;
    private int idade;
    private Calendar data_nascimento;
    private Endereco endereco;


    //Métodos
    public Pessoa ( String nome ,
                    Calendar data_nascimento, 
                    String identificador, 
                    Endereco endereco, 
                    String nacionalidade,
                    String naturalidade ) 
    {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.identificador = identificador;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        atualizarIdade ();
    }
    
    protected void atualizarIdade ( ) {
        if ( this.data_nascimento != null)
            this.idade = calcularIdade ();
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
    
    protected String getNome ( ) {
        return this.nome;
    }
    protected void setNome ( String nome ) {
        this.nome = nome;
    }
    protected String getNacionalidade ( ) {
        return this.nacionalidade;
    }
    protected String getNaturalidade ( ) {
        return this.naturalidade;
    }
    protected String getID ( ) {
        return this.identificador;
    }
    protected void setID ( String identificador ) {
        this.identificador = identificador;
    }
    protected String getTipo ( ) {
	return null;
    }
    
    @Override
    public String toString (){
        return """
               Objeto:
               \t- Classe: """ + getClass().getName() + 
                "\n\t- Hash: " + Integer.toHexString(hashCode()) + 
                "\n\t- Nome: " + nome + 
                "\n\t- Identificador: " + identificador +
                "\n\t- Tipo: " + getTipo();
    }
    
    @Override
    public boolean equals (Object obj) {
	if ( ( nome.equals( ( ( Pessoa ) obj ).nome ) ) && ( this instanceof Pessoa ) )
            return true;
	else
            return false;
    }
    
    @Override
    public int hashCode () {
	if ( this instanceof Pessoa )
            return this.nome.hashCode();
	else
            return super.hashCode();
    }
}*/

//Trabalhando com poliformismo e abstração
//Classe
/*public abstract class Pessoa {
    //Atributos
    protected String nome, nacionalidade , naturalidade, identificador;
    private int idade;
    private Calendar data_nascimento;
    private Endereco endereco;


    //Métodos
    public Pessoa ( String nome ,
                    Calendar data_nascimento, 
                    String identificador, 
                    Endereco endereco, 
                    String nacionalidade,
                    String naturalidade ) 
    {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.identificador = identificador;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        atualizarIdade ();
    }
    
    protected void atualizarIdade ( ) {
        if ( this.data_nascimento != null)
            this.idade = calcularIdade ();
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
    
    protected String getNome ( ) {
        return this.nome;
    }
    protected void setNome ( String nome ) {
        this.nome = nome;
    }
    protected String getNacionalidade ( ) {
        return this.nacionalidade;
    }
    protected String getNaturalidade ( ) {
        return this.naturalidade;
    }
    protected final String getID ( ) {
        return this.identificador;
    }
    protected abstract void setID ( String identificador );
    
    protected String getTipo ( ) {
	return null;
    }
    
    @Override
    public String toString (){
        return """
               Objeto:
               \t- Classe: """ + getClass().getName() + 
                "\n\t- Hash: " + Integer.toHexString(hashCode()) + 
                "\n\t- Nome: " + nome + 
                "\n\t- Identificador: " + identificador +
                "\n\t- Tipo: " + getTipo();
    }
    
    @Override
    public boolean equals (Object obj) {
	if ( ( nome.equals( ( ( Pessoa ) obj ).nome ) ) && ( this instanceof Pessoa ) )
            return true;
	else
            return false;
    }
    
    @Override
    public int hashCode () {
	if ( this instanceof Pessoa )
            return this.nome.hashCode();
	else
            return super.hashCode();
    }
}*/

//Trabalhando com Interfaces
public abstract class Pessoa implements iPessoa , Identificador {
    //Atributos
    int idade;
    String nome = "" , naturalidade = "" , nacionalidade = "" , identificador = "";
     
    private Calendar data_nascimento;
    private Endereco endereco;
    
    //Métodos
        public Pessoa ( String nome ,
                    Calendar data_nascimento, 
                    String identificador, 
                    Endereco endereco, 
                    String nacionalidade,
                    String naturalidade ) 
    {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.identificador = identificador;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        setIdade ( );
    }
    
    @Override
    public void setNome ( String nome ) {
        if ( !nome.isBlank() )
        this.nome = nome;
        else
        System.out.println ( "ERRO: nome em branco!" );
    }
    @Override
    public String getNome ( ) {
        return this.nome;
    }
    @Override
    public abstract void setID ( String identificador );
   
    @Override
    public String getID ( ) {
        return this.identificador;
    }
    @Override
    public void formatID ( int id ){
            this.identificador = String.valueOf (id);
    }
    @Override
    public boolean validateID ( String id ) {
        return !(id.isBlank() || id.isEmpty());
    }
    @Override
    public String getNacionalidade ( ) {
        return this.nacionalidade;
    }
    @Override
    public String getNaturalidade ( ) {
        return this.naturalidade;
    }
    @Override
    public void setIdade ( ) {
        this.idade = calcularIdade ( this.data_nascimento );
    }
    @Override
    public int getIdade ( ) {
        return this.idade;
    }
    @Override
    public abstract String getTipo ( );
    @Override
    public int calcularIdade ( Calendar data_inicio_existencia ){
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(YEAR) - data_inicio_existencia.get(YEAR);
        if ( ( data_inicio_existencia.get(MONTH) > hoje.get(MONTH) ) ||( data_inicio_existencia.get(MONTH) == hoje.get(MONTH) && data_inicio_existencia.get(DATE) > hoje.get(DATE) ) )
            lapso--;
        return lapso;
    }
}