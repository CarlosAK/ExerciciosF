package br.com.statico;

import br.com.orientacaoObjeto.Conta;

public class TesteStaticoContaUnica {

	public static void main(String[] args) {
		
		Conta cont1 = new Conta();
		System.out.println(cont1.numero);
		Conta cont2 = new Conta();
		System.out.println(cont2.numero);

	}

}
