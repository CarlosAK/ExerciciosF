package br.com.Polimorfismo;

public class Conta {
	
	private int numero;
	private String nome;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void extrato() {
		
	}

}
