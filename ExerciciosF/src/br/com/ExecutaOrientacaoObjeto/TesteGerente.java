package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		
		
		Gerente ger1 = new Gerente();
		
		ger1.nome = "Vitor";
		ger1.salario = 1700;
		
		ger1.aumentar10();
		System.out.println(ger1.salario);
		ger1.salario = 1700;
		ger1.aumentarsalario(50);
		System.out.println(ger1.salario);

	}

}
