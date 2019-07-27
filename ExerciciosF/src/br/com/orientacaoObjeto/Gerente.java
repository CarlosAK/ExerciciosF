package br.com.orientacaoObjeto;

public class Gerente extends Funcionario {
	
	private String numusuario;
	private String senha;
	
	
	public Gerente(String nome, double salario, String numusuario, String senha) {
		super(nome,salario);
		this.numusuario = numusuario;
		this.senha = senha;
	}
	
	@Override
	public void aumentarSalario() {
		this.setSalario(this.getSalario() * 1.50);
	}
	
	
	public String getNumusuario() {
		return numusuario;
	}


	public void setNumusuario(String numusuario) {
		this.numusuario = numusuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String dados() {
		return "Nome: " + this.getNome() + "\nSalario: " + this.getSalario() + " " + this.getNumusuario();
	}
	
	

}
