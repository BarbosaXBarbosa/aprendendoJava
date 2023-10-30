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
import java.util.Calendar;

//Classe
public class Juridica extends Pessoa {

    public Juridica ( String nome , Calendar data_nascimento , String CPF , Endereco endereco , String nacionalidade , String naturalidade ) {
        super ( nome , data_nascimento, CPF , endereco , nacionalidade , naturalidade );
        setIdade ();
    }

    @Override
    public void setID(String CNPJ) {
        if (validaCNPJ(CNPJ)) {
            this.identificador = CNPJ;
        } else {
            System.out.println("ERRO: CNPJ invalido!");
        }
    }

    protected boolean validaCNPJ(String CNPJ) {
        if (CNPJ == null || CNPJ.length() != 14 || !CNPJ.chars().allMatch(Character::isDigit)) {
            return false;
        }

        int[] numeros = new int[14];
        for (int i = 0; i < 14; i++) {
            numeros[i] = Character.getNumericValue(CNPJ.charAt(i));
        }

        int[] pesos = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += numeros[i] * pesos[i];
        }

        int primeiroDigitoVerificador = 11 - (soma % 11);
        if (primeiroDigitoVerificador >= 10) {
            primeiroDigitoVerificador = 0;
        }

        pesos = new int[]{6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        soma = 0;
        for (int i = 0; i < 13; i++) {
            soma += numeros[i] * pesos[i];
        }

        int segundoDigitoVerificador = 11 - (soma % 11);
        if (segundoDigitoVerificador >= 10) {
            segundoDigitoVerificador = 0;
        }

        return primeiroDigitoVerificador == numeros[12] && segundoDigitoVerificador == numeros[13];
    }
    @Override
    public String getTipo ( ) {
	return "Juridica";
    }
}
