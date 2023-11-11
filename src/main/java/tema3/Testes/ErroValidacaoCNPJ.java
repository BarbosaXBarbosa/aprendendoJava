/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author João Victor Barbosa
 */

package tema3.Testes;

public class ErroValidacaoCNPJ extends Throwable{
	private final String msg_erro;
    
    public ErroValidacaoCNPJ ( String msg_erro ) {
        this.msg_erro = msg_erro;
    }
	    
    @Override
    public String toString ( ) {
        return "ErroValidacaoCNPJ: " + msg_erro;
    }
}
