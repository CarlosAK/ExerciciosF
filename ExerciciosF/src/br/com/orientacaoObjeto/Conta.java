package br.com.orientacaoObjeto;

public class Conta {
	
	private int numero;
	private double saldo;
	private int limite = 100;
	private Agencia agencia;
	private static int num;
	
	
	public Conta() {
		num++;
		this.numero = num;
	}
	
	
	public String zerarcontador() {
		String numeroContas = "Numero de contas criadas: " + num;
		num = 0;
		return numeroContas;
	}
	

	public void depositar(double valor) {
		this.saldo += valor;
	}
	

	public void sacar(double valor) {
		this.saldo -= valor;
	}
	

	public String consultar() {
		return "Você tem " + this.saldo + " na sua conta.";
	}
	

	public String extrato() {
		return "Informando o extrato do mês";
	}	
	
	
	public void tranferir(double valor, Conta contaTrans) {
		this.saldo -= valor;
		contaTrans.saldo += valor;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getLimite() {
		return limite;
	}


	public void setLimite(int limite) {
		this.limite = limite;
	}


	public Agencia getAgencia() {
		return agencia;
	}


	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

}
