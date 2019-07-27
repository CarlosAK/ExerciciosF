package br.com.ClassesAbstratas;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta cont1 = new ContaPoupanca(12,"Ana",24);
		
		System.out.println("Nome: " + cont1.getNome());
		
		
		cont1.extrato();

	}

}
