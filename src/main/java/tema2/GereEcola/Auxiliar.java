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
public abstract class Auxiliar {
    //Atributos
    private float freq;
    private final int dias_letivos;
    private int presenca;
    //Métodos
    public Auxiliar ( int dias_letivos ) {
        this.dias_letivos = dias_letivos;
    }
    protected final void calcularFrequencia ( ) {
        freq = 100 * ( presenca / dias_letivos );
    }
    protected float getFrequencia ( ) {
        return freq;
    }
    protected abstract float calcularMedia ( );
}