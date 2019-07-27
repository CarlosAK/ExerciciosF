package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.CartaoCredito;

public class TesteCartaoCredito {

	public static void main(String[] args) {
		
		CartaoCredito card1 = new CartaoCredito(221);
		CartaoCredito card2 = new CartaoCredito(431);
		card1.validade = "30/12/2022";
		card2.validade = "08/06/2021";
		System.out.println("Numero e validade do primeiro cartao: " + card1.numero + " - " + card1.validade);
		System.out.println("Numero e validade do segundo cartao: " + card2.numero + " - " + card2.validade);
		card1.numero = 734;
		card1.validade = "30/12/2023";
		card2.numero = 947;
		card2.validade = "08/06/2022";
		System.out.println("Novo numero e validade do primeiro cartao: " + card1.numero + " - " + card1.validade);
		System.out.println("Novo numero e validade do segundo cartao: " + card2.numero + " - " + card2.validade);
	}
		

	}

}
