/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author João Victor Barbosa
 */

package tema2.GereEcola;

//Importações
import java.util.Calendar;

// To string sobrescrito para classe de pessoa
/*public class Principal {
    private static Pessoa grupo [];
    public static void main (String args[]) {
        grupo = new Pessoa [2];
        Calendar data_nasc = Calendar.getInstance();
        data_nasc.set(1980, 10, 23);
        grupo [0] = new Fisica ( "Marco Antônio" , data_nasc , "365.586.875-45", null , "Brasil" , "Rio de Janeiro" );
        grupo [1] = new Pessoa ("Escola Novo Mundo Ltda" , data_nasc , "43.186.666/0026-32" , null , "Brasil" , "Rio de Janeiro");
        for ( int i = 0 ; i <= 1 ; i++ )
            System.out.println( "grupo[" + i + "]: " + grupo[i].toString() );
    }
}*/

//Equals
/*public class Principal {
    //Atributos
    private static int I1 , I2 , I3;
    private static String S1 , S2 , S3;
    private static Fisica p1 , p2;
    private static Pessoa p3, p4;
    private static Pessoa pessoas [];

    //Métodos
    public static void main (String args[]) {
        pessoas = new Pessoa [4];
        I1 = 1;
        I2 = 2;
        I3 = 1;
        S1 = "a";
        S2 = "b";
        S3 = "a";
        Calendar data_nasc = Calendar.getInstance();
        data_nasc.set(1980, 10, 23);
        p1 = new Fisica ( "Marco Antônio" , data_nasc , "365.586.875-45" , null , "Brasil" , "Rio de Janeiro" );
        p2 = new Fisica ( "Marco Antônio" , data_nasc , "365.586.875-45" , null , "Brasil" , "Rio de Janeiro" );
        p3 = new Pessoa ( "Classe Pessoa" , null , null , null , "Brasil" , "Rio de Janeiro");
        p4 = new Pessoa ( "Classe Pessoa" , null , null , null , "Brasil" , "Rio de Janeiro");
        pessoas[0] = p1;
        pessoas[1] = p2;
        pessoas[2] = p3;
        pessoas[3] = p4;
        
        compararEquals ( p1 , p2 , p3 );
        compararEquals ( I1, I2, I3 );
        compararEquals ( S1, S2, S3 );
        
        for ( int i = 0 ; i <= 3 ; i++ )
            System.out.println( "grupo[" + i + "]: " + pessoas[i].toString() );
    }

    private static void compararEquals ( Object o1 , Object o2 , Object o3 ){
        System.out.println("Uso de EQUALS para comparar " + o1.getClass().getName());
        if ( o1.equals( o2 ) )
            System.out.println("o1 == o2");
        else
            System.out.println("o1 != o2");
        if ( o1.equals(o3) )
            System.out.println("o1 == o3");
        else
            System.out.println("o1 != o3");
    }
}*/

//InstanceOf
/*public class Principal {
//Atributos
private static Pessoa p1, p3;
private static Fisica p2;
//Métodos
public static void main (String args[]) {
    
    Calendar data_nasc = Calendar.getInstance();
    data_nasc.set(1980, 10, 23);
    p1 = new Fisica ( "Marco Antônio" , data_nasc , "365.586.875-45" , null , "Brasil" , "Rio de Janeiro" );
    p2 = new Fisica ( "Marco Antônio" , data_nasc , "365.586.875-45" , null , "Brasil" , "Rio de Janeiro" );
    p3 = new Pessoa ( "Classe Pessoa" , null , null , null , "Brasil" , "Rio de Janeiro");
    
    if ( p1 instanceof Pessoa )
        System.out.println("p1 é instância do tipo Pessoa.");
    else
        System.out.println("p1 não é instância do tipo Pessoa.");
    if ( p2 instanceof Pessoa )
    System.out.println("p2 é instância do tipo Pessoa.");
    else
        System.out.println("p2 não é instância do tipo Pessoa.");
    if ( p3 instanceof Pessoa )
        System.out.println("p3 é instância do tipo Pessoa.");
    else
        System.out.println("p3 não é instância do tipo Pessoa.");
    if ( p3 instanceof Fisica )
        System.out.println("p3 é instância do tipo Física.");
    else
        System.out.println("p3 não é instância do tipo Física.");
    }
}*/

//Polimorfismo com classe abstrata
/*public class Principal {
    //Atributos
    private static Pessoa ref [];
    //Método main
    public static void main (String args[]) {
        ref = new Pessoa [2];
        Calendar data_nasc = Calendar.getInstance();
        Calendar data_criacao = Calendar.getInstance();
        data_nasc.set(1980 , 10 , 23);
        ref [ 0 ] = new Fisica ( "Marco Antônio" , data_nasc , null , null , "Brasil" , "Rio de Janeiro" ); //"365.586.875-45"
        data_criacao.set(1913 , 02 , 01 );
        ref [ 1 ] = new Juridica ( "Escola Novo Mundo Ltda" , data_criacao , null , null , "Brasil" , "Rio de Janeiro" ); //"43.186.666/0026-32"
        ref [ 0 ].setID("482.270.038-00");
        ref [ 1 ].setID("43186666002632");
    }
}*/

//Downcasting Upcasting
/*public class Principal {
    //Atributos
    private static Derivada ref;
    //Métodos
    public static void main (String args[]) {
        ref = new Derivada ( ); //instancia objeto do tipo Derivada
        System.out.println ( "=> Imprime o valor de var_base");
        ref.imprimirVarBase();
        System.out.println ( "=> Atualiza o valor de var_der com downcasting (var_der = 1000)");
        ref.atualizarVarSub(1000);
        System.out.println ( "=> Imprime o valor de var_der com downcasting");
        ref.imprimirVarSub();
        System.out.println ( "=> Imprime o valor de var_der");
        ref.imprimirVarDer();
        System.out.println ( "=> Atualiza o valor de var_base com Downcasting (var_base = 5)");
        ref.atualizarVarBase(5);
        System.out.println ( "=> Imprime o valor de var_base");
        ref.imprimirVarBase();
    }
}*/

//Mutabilidade
/*public class Principal {
    //Atributos
    private static final Derivada ref = new Derivada();
    //Métodos
     public static void main (String args[]) {
       ref.atualizarVarSub(1000);
       ref.imprimirVarSub();
     }
}*/

//Interfaces, herança e typecasting
/*public class Principal {
    //Atributos
    private static Identificador refIdt;
    private static iPessoa refiPessoa;
    //Métodos
    public static void main (String args[]) {
        Calendar data_nasc = Calendar.getInstance();
        data_nasc.set(1980 , 10 , 23);
        refIdt = new Fisica ( "Marco Antônio" , data_nasc , null , null , "Brasil" , "Rio de Janeiro" ); //"365.586.875-45"
        refIdt.setID("M-1020/001");
        System.out.println ( refIdt.getID() );
        //refIdt.setNome ("João Batista");// Erro pois esta variável referencia identificador e não ipessoa
        refiPessoa = (iPessoa) refIdt;//Typecasting
        refiPessoa.setNome("João Batista");// Agora é possível
        System.out.println(refiPessoa.getNome());
        
    }
}*/

/*public class Principal {

    public static void main(String [ ] args) {

       Integer a,b,c,d,e ;
       int f ;
       char r1,r2,r3,r4,r5 ;
       String s ;

       a=1; b=1; c = a ;
       d= b; 
       f=1; 
       e = f;

       r1= ( a.equals(b)? 's' : 'n' ) ;
       r2= ( a.equals(c)? 's' : 'n' ) ;
       r3= ( a==d? 's' : 'n' ) ;
       r4= ( a==e? 's' : 'n' ) ;
       r5= ( a.equals(f)? 's' : 'n' ) ;

       s = " "+r1+r2+r3+r4+r5 ;

       System.out.println(s) ;

    }
}*/

