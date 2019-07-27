package br.com.ClassesAbstratas;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Gerente(24861, "Ana","Ana412");
		
		func1.setCodigo(84120);
		func1.setNome("Funcionaria Ana");
		
		
		func1.bonificacao();

	}

}
