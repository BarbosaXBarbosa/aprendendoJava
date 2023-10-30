/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1.JavaBasico;

import java.util.List;



/**
 *
 * @author João Victor Barbosa
 */
// Implementação de Método abstrato usando elementos abstratos usando o generics, 
// pois podemos aplicar a qualquer tipo de objeto e construindo um Template Method, 
// Método com lacunas para serem preenchidas por descendetes
public abstract class PersisteObjetosTemplate<E> {
    protected abstract void persistir (E entidade);
    protected abstract List<E> obter();
    
    
    //Vai receber um conjunto vai adicionar na coleção de retorno e vai persistir a coleção
    public List<E> push(E entidade) {
        List<E> atual = obter();
        atual.add(entidade);
        persistir(entidade);
        return atual;
    }
    
}
