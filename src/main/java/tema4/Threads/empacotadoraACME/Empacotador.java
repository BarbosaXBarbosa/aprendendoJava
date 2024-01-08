/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author João Victor Barbosa
 */

package tema4.Threads.empacotadoraACME;

//Importações
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Empacotador implements Runnable {
    //Atributos
    private final Equipe equipe;
    private final ContadorSinc empacotamentos;
    private final String nome;
    private String lista_threads_id;
    //Métodos
    public Empacotador ( int nr_empacotador , Equipe equipe )
    {
        this.equipe = equipe;
        this.lista_threads_id = new String ();
        this.nome = "Emp[" + nr_empacotador + "]@" + equipe.getName();
        Thread.currentThread ( ).setName ( nome );       
        empacotamentos = new ContadorSinc ( 0 );
    }
    
    public void listarIdThreads ( ) {
        System.out.println ( " |----- Lista de threads executadas por " + nome + " : " + lista_threads_id );
    }
    
    public void listarEmpacotamentos ( ) {
        System.out.println ( " |----- Empacotamentos feitos por " + nome + " : " + empacotamentos.getContador() );
    }
    
    @Override
    public void run() {
        try {
            synchronized ( lista_threads_id ) {
                //Constrói na instância de Empacotador uma lista com todas as threads que foram criadas.
                lista_threads_id = lista_threads_id + "[" + Thread.currentThread().getId() + "]"; 
            }
            
            System.out.println ( nome + " empacotando (" + System.currentTimeMillis() + ")" );
            
            //Coloca a thread para dormir por um período aleatório entre 100 e 999 milissegundos.
            Thread.sleep ( ( int ) ( Math.random ( ) * 899 + 100 ) ); 
            System.out.println ( nome + " concluiu  (" + System.currentTimeMillis() + ")" );
            
            //Incrementa o contador de empacotamentos da instância de Empacotador.
            empacotamentos.incrementar(); 
            equipe.liberarFita();
        } catch ( InterruptedException e ) {
               e.printStackTrace();
        }
    }
}