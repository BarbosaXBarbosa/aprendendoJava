/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author João Victor Barbosa
 */

//Pacote
package tema2.Matematica;

//Importações
import java.util.Calendar;
import java.util.List;


public class Nota {
    private int nota;
    private Calendar dataProva;
    
    public Nota (int nota, Calendar dataProva){
        this.nota = nota;
        this.dataProva = dataProva;
    }
    protected static float calcularMedia(List<Nota> notas) {
        double soma = 0.0;
        for (Nota nota : notas) {
            soma += nota.getNota();
        }
        return (float) (soma / notas.size());
    }
    protected int getNota(){
        return this.nota;
    }
    protected Calendar getDataProva (){
        return this.dataProva;
    }
}
