/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1.JavaBasico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Victor Barbosa
 * @param <E>
 */
public class PersisteEmMemoria<E> extends PersisteObjetosTemplate<E> {
    
    private final List<E> listaInterna = new ArrayList<>();

    @Override
    protected void persistir(E entidade) {
        listaInterna.add(entidade);
    }

    @Override
    protected List<E> obter() {
        List<E> aux = new ArrayList<>(listaInterna);
        return aux;
    }
    
}
