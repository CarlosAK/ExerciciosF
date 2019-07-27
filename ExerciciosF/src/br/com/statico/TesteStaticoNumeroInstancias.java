package br.com.statico;

import br.com.orientacaoObjeto.Conta;

public class TesteStaticoNumeroInstancias {

	public static void main(String[] args) {
		
		Conta func1 = new Conta(11);
		System.out.println(func1.num);
		Conta func2 = new Conta(22);
		System.out.println(func2.num);
		System.out.println(func1.num);

	}

}
