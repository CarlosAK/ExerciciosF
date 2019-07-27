package br.com.orientacaoObjeto;

public class Secretaria extends Funcionario {
	
private String ramal;
	
	public Secretaria(String nome, double salario,String ramal) {
		super(nome,salario);
		this.ramal = ramal;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
	@Override
	public String dados() {
		return "Nome: " + this.getNome() + "\nSalario: " + this.getSalario() + " " + this.getRamal();
	}

}
