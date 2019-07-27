package br.com.orientacaoObjeto;

public class Telefonista extends Funcionario {
	
private int codigo;
	
	public Telefonista(String nome, double salario, int codigo) {
		super(nome,salario);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String dados() {
		return "Nome: " + this.getNome() + "\nSalario: " + this.getSalario() + " " + this.getCodigo();
	}

}
