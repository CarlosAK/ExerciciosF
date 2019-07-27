package br.com.statico;

import br.com.orientacaoObjeto.Conta;

public class TesteStatcioZeraContas {

	public static void main(String[] args) {
		
		Conta cont1 = new Conta();
		System.out.println(cont1.numero);
		Conta cont2 = new Conta();
		System.out.println(cont2.numero);
		
		cont1.zerarcontador();
		System.out.println(cont1.num);

	}

}
