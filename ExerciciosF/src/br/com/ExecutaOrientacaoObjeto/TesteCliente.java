package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente();
		Cliente cli2 = new Cliente();
		cli1.nome = "Jackson";
		cli1.codigo = 1080;
		cli2.nome = "Ana";
		cli2.codigo = 5913;
		
		System.out.println("Nome e codigo do primeiro cliente: " + cli1.nome + " - " + cli1.codigo);
		System.out.println("Nome e codigo do Segundo cliente: " + cli2.nome + " - " + cli2.codigo);
		
	}

	}

}
