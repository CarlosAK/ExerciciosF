package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.setNome("Eduardo");
		func1.setSalario(1467.20);
		func2.setNome("Thiago");
		func2.setSalario(2458.30);
		System.out.println("Nome e salario do primeiro funcionario: " + func1.getNome() + " - " + func1.getSalario());
		System.out.println("Nome e salario do segundo funcionario: " + func2.getNome() + " - " + func2.getSalario());
		
		
		System.out.println("-------------------------");
		func1.aumentarSalario(90);
		System.out.println(func1.dados());
		
		System.out.println("-------------------------");
		System.out.println(func1.getValerefeicao());
		
		func1.aumentarVale(50);
		System.out.println(func2.getValerefeicao());

	}

}
