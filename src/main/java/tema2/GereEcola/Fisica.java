/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author João Victor Barbosa
 */


package tema2.GereEcola;

import java.util.Calendar;


public class Fisica extends Pessoa {
    
    public Fisica ( String nome , Calendar data_nascimento , String CPF , Endereco endereco , String nacionalidade , String naturalidade ) {
        super ( nome , data_nascimento, CPF , endereco , nacionalidade , naturalidade );
        setIdade ();
    }
    @Override
    public boolean setID ( String CPF ) {
        if ( validaCPF ( CPF ) ){
            this.identificador = CPF;
            return true;
        }
        else{
            System.out.println ( "ERRO: CPF invalido!" );
            return false;
        }
    }
    protected boolean validaCPF(String CPF) {
        if (CPF == null || CPF.length() != 11 || CPF.chars().allMatch(Character::isDigit)) {
            return false;
        }

        int[] numeros = new int[11];
        for (int i = 0; i < 11; i++) {
            numeros[i] = Character.getNumericValue(CPF.charAt(i));
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += numeros[i] * (10 - i);
        }

        int primeiroDigitoVerificador = 11 - (soma % 11);
        if (primeiroDigitoVerificador > 9) primeiroDigitoVerificador = 0;

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += numeros[i] * (11 - i);
        }

        int segundoDigitoVerificador = 11 - (soma % 11);
        if (segundoDigitoVerificador > 9) segundoDigitoVerificador = 0;

        return primeiroDigitoVerificador == numeros[9] && segundoDigitoVerificador == numeros[10];
    }
    
    @Override
    public String getTipo ( ) {
	return "Fisica";
    }
}
