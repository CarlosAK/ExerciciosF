package br.com.Polimorfismo;

public class Gerente extends Funcionario {
	
private String nomeusuario;
	
	public Gerente(int codigo, String nome, String nomeusuario) {
		super(codigo, nome);
		this.nomeusuario = nomeusuario;
	}

	
	public String getNomeusuario() {
		return nomeusuario;
	}

	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}

}
