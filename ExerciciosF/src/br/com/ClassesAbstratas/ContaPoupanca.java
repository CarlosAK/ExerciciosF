package br.com.ClassesAbstratas;

public class ContaPoupanca extends Conta{
	
private double poupanca;
	
	public ContaPoupanca(int numero, String nome, double poupanca) {
		super(numero, nome);
		this.poupanca = poupanca;
	}

	
	@Override
	public void extrato() {
		System.out.println("Estou retornando o extrato do mês");
	}

}
