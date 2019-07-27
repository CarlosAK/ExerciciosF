package br.com.orientacaoObjeto;

public class Aluno {
	
	private String nome;
	private int rg;
	private String datNascimento;
	private Turma turma;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getDatNascimento() {
		return datNascimento;
	}
	public void setDatNascimento(String datNascimento) {
		this.datNascimento = datNascimento;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
