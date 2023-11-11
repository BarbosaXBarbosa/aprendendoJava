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
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tema3.Testes.ErroValidacaoCNPJ;

//Tema2
//Classe
/*public class Juridica extends Pessoa {

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
}*/


public class Juridica extends Pessoa {
    public Juridica ( String nome , 
    				 Calendar data_nascimento , 
    				 String CPF , Endereco endereco , 
    				 String nacionalidade , 
    				 String naturalidade ) 
    {
    	  super ( nome , data_nascimento, CPF , endereco , nacionalidade , naturalidade );
          setIdade ();        
    }

    @Override
    public boolean setID ( String CNPJ ) {
        try {
            if ( validaCNPJ ( CNPJ ) ) {
                this.identificador = CNPJ;
                return true;
            }
            else {
                System.out.println ( "ERRO: CNPJ invalido!" );
                return false;
            }
        } catch (ErroValidacaoCNPJ ex) {
            Logger.getLogger(Juridica.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    private boolean validaCNPJ ( String CNPJ ) throws ErroValidacaoCNPJ {
        char DV13, DV14;
        int soma, num, peso, i, resto;
        //Verifica sequência de dígitos iguais e tamanho (14 dígitos)
        if ( CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") || CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") || CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") || (CNPJ.length() != 14) )
        {
            throw new ErroValidacaoCNPJ ( "Entrada invalida!" );
            //   return(false);
        }
        try {
            //1º Dígito Verificador
            soma = 0;
            peso = 2;
            for ( i = 11 ; i >= 0 ; i-- ) {
                num = (int)( CNPJ.charAt ( i ) - 48 );
                soma = soma + ( num * peso );
                peso++;
                if ( peso == 10 )
                peso = 2;
            }
            resto = soma % 11;
            if ( ( resto  == 0 ) || ( resto == 1 ) )
                DV13 = '0';
            else
                DV13 = (char)( ( 11 - resto ) + 48 );
            //2º Dígito Verificador
            soma = 0;
            peso = 2;
            for ( i = 12 ; i >= 0 ; i-- ) {
                num = (int) ( CNPJ.charAt ( i ) - 48 );
                soma = soma + ( num * peso );
                peso++;
                if ( peso == 10 )
                peso = 2;
            }
            resto = soma % 11;
            if ( ( resto == 0 ) || ( resto == 1 ) )
                DV14 = '0';
            else
                DV14 = (char) ( ( 11 - resto ) + 48 );
            //Verifica se os DV informados coincidem com os calculados
            if ( ( DV13 == CNPJ.charAt ( 12 ) ) && ( DV14 == CNPJ.charAt ( 13 ) ) )
                return true;
            else
            {
                throw new ErroValidacaoCNPJ ( "DV inválido." );
                //return false;
            }
        } catch (InputMismatchException erro) {
            return false;
        }
    }
    @Override
    public String getTipo ( ) {
        return "Juridica";
    }
}
