package br.com.ClassesAbstratas;

public class Gerente extends Funcionario {
	
private String nomusuario;
	
	public Gerente(int codigo, String nome, String nomusuario) {
		super(codigo, nome);
		this.nomusuario = nomusuario;
	}
	
	
	@Override
	public void bonificacao() {
		System.out.println("Vc acaba de receber uma bonificação de 5 reais a mais por hora");
	}

}
