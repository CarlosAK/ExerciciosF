package br.com.Polimorfismo;

public class ContaCorrente extends Conta {
	
private double corrente;
	
	public ContaCorrente(int numero, String nome) {
		super(numero, nome);
	}

	public double getCorrente() {
		return corrente;
	}

	public void setCorrente(double corrente) {
		this.corrente = corrente;
	}
	
	@Override
	public void extrato() {
		System.out.println("Extrato da conta corrente");
	}

}
