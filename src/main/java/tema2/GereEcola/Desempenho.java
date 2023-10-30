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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import tema2.Matematica.Nota;

//Classe
public class Desempenho extends Nota {
    private final float media;
    private final Nota nota;
    private List notas;

    public Desempenho(int valorNota, Calendar dataProva, List notas) {
        super (valorNota, dataProva);
        
        Calendar data = Calendar.getInstance();
        data.set(2023, 10, 23);
        
        nota = new Nota(valorNota, dataProva);
        this.notas.add(nota);

        this.media = calcularMedia(notas);
    }
    
    protected float getMedia () { 
        return this.media;
    }
}
