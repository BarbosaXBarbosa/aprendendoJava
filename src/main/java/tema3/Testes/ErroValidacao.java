/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.Testes;

/**
 *
 * @author João Victor Barbosa
 */

public class ErroValidacao extends Throwable {
    //private String msg_erro;
     
    public ErroValidacao ( String msg_erro ) {
        super ( msg_erro );
    }
  
    public ErroValidacao ( String msg_erro , Throwable causa ) {        
        super ( msg_erro , causa );
    }
    public void atribuirCausa ( Throwable causa ) {
        initCause ( causa );
    }
         
    @Override
    public String toString ( ) {
        return "ErroValidacao: " + this.getMessage();
    }
}
