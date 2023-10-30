/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author João Victor Barbosa
 */

//Pacote
package tema2.GereEcola;

//Importações
import java.util.Calendar;

//Interface
public interface iPessoa {
    void setNome ( String nome );
    String getNome ( );
    String getNacionalidade ( );
    String getNaturalidade ( );
    void setIdade ( );
    int getIdade ( );
    String getTipo ( );
    int calcularIdade ( Calendar data_inicio_existencia );    
}
