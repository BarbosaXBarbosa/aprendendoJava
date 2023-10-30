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
public interface Identificador {
    final int tamanho_max = 21;
    boolean validateID (String id);
    void formatID (int tipo);
    void setID (String id);
    String getID ();
}
