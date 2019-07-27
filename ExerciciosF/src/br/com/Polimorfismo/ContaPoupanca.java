package br.com.Polimorfismo;

public class ContaPoupanca extends Conta {
	
private double poupanca;
	
	
	public ContaPoupanca(int numero, String nome) {
		super(numero, nome);
	}


	public double getPoupanca() {
		return poupanca;
	}


	public void setPoupanca(double poupanca) {
		this.poupanca = poupanca;
	}
	
	@Override
	public void extrato() {
		System.out.println("Extrato da conta poupança");
	}

}
