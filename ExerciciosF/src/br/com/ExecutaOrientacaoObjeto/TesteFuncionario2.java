package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.Funcionario;
import br.com.util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {

		String resposta = "S";
		Funcionario func1 = new Funcionario();
		
		func1.nome = Teclado.lerTexto("Digite seu nome: ");
		
		while (!resposta.equalsIgnoreCase("N")){
			System.out.println("1 para alterar nome");
			System.out.println("2 para alterar salario");
			System.out.println("3 para visualizar dados");
			int num = Teclado.lerInt("Numero: ");
		
			if (num == 1) {
				func1.nome = Teclado.lerTexto("Novo nome: ");
			}
		
			else if (num == 2) {
				func1.salario = Teclado.lerDouble("Novo salario: ");
			}
		
			else {
				System.out.println("Nome: " + func1.nome);
				System.out.println("Salario: " + func1.salario);
			}
			
			resposta = Teclado.lerTexto("Deseja continuar? (S/N) ");
			
			
		}
		
		
	}

	}

}
