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
 */
public class Departamento {
    String nome;
    List<Aluno> alunos = new ArrayList<>();
    Departamento(String nome) {this.nome = nome; }
}
