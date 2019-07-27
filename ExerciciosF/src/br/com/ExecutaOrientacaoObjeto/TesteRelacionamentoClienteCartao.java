package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.CartaoCredito;
import br.com.orientacaoObjeto.Cliente;

public class TesteRelacionamentoClienteCartao {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente();
		cli1.nome = "Diogo";
		cli1.codigo = 572;
		CartaoCredito cart1 = new CartaoCredito(392221);
		cart1.validade = "07/01/2023";
		cart1.cliente = cli1;
		System.out.println("Numero e validade do cartao e seu respectivo dono: " + 
				cart1.numero + " - " + cart1.validade + " - " + cart1.cliente.nome);

	}

}
