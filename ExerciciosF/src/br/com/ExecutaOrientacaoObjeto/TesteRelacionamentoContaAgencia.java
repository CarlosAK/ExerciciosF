package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.Agencia;
import br.com.orientacaoObjeto.Conta;

public class TesteRelacionamentoContaAgencia {

	public static void main(String[] args) {
		
		
		Agencia ag = new Agencia(101);
		Conta cont1 = new Conta(59912);
		cont1.saldo = 9763;
		cont1.agencia = ag;
		
		System.out.println("Numero, saldo da conta e sua respectiva agencia: " + 
					cont1.numero + " - " + cont1.saldo + " - " + cont1.agencia.numero);

	}

}
