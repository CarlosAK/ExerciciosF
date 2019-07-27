package br.com.orientacaoObjeto;

public class Funcionario {
	
	private String nome;
	private double salario = 1000;
	private static double vr = 25.00;
	
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public void aumentarSalario() {
		this.salario *= 1.10;
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public static double getValerefeicao() {
		return vr;
	}



	public static void setValerefeicao(double valerefeicao) {
		Funcionario.vr = valerefeicao;
	}



	public void aumentarVale(double taxa) {
		vr *=  (1 + (taxa/100));
	}
	
	
	public String dados() {
		return "Nome: " + this.nome + "\nSalario: " + this.salario + " Bonificação de 10%";
	}

}
