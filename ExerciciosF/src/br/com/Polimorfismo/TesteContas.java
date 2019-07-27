package br.com.Polimorfismo;

public class TesteContas {
	
public static void main(String[] args) {
		
		
		Conta cc = new ContaCorrente(852809,"Carlos");
		Conta cp = new ContaPoupanca(804642,"Ana");
		
		cc.extrato();
		cp.extrato();
	}

}
