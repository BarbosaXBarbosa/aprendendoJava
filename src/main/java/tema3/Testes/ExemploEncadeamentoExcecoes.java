/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.Testes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Victor Barbosa
 */
public class ExemploEncadeamentoExcecoes {
    public static void main(String[] args) {
        try {
            List<String> lstNomes = new ArrayList<>();
            addNome(lstNomes, null);
        } catch (nomeInvalidoExcecao e) {
            System.out.println("Um erro ocorreu: " + e.getMessage());
            System.out.println("Causa raiz: " + e.getCause().getMessage());
            
        } 
    }
    
    public static void addNome(List<String> nomes, String nome) throws nomeInvalidoExcecao {
        try {
            if(nome == null || nome.isBlank()) {
                throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
            }
            nomes.add(nome);
        } catch (IllegalArgumentException e) {
            throw new nomeInvalidoExcecao("Foi detectado um nome inválido", e);
        }
    }    
}

class nomeInvalidoExcecao extends Exception {
    public nomeInvalidoExcecao (String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
