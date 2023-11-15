/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.Threads;

/**
 *
 * @author João Victor Barbosa
 */
public class Contador {
    private int nmrContagem;
    
    public Contador (int n) {
        this.nmrContagem = n;
    }
    
    public int getControle () {
        return this.nmrContagem;
    }
    public void decrementa () {
        this.nmrContagem = this.nmrContagem - 1;
    }
}
