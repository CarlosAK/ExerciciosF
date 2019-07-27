package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		
		Conta cont1 = new Conta(11);
		Conta cont2 = new Conta(22);
		
		cont1.saldo = 498;
		cont1.limite = 100;
		cont2.saldo = 670;
		cont2.limite = 200;
		System.out.println("Numero, saldo e limite da primeira conta: " + cont1.numero + " - " + cont1.saldo + " - " + cont1.limite);
		System.out.println("Numero, saldo e limite da segunda conta: " + cont2.numero + " - " + cont2.saldo + " - " + cont2.limite);
		cont1.numero = 15;
		cont1.saldo = 1400;
		cont1.limite = 300;
		cont2.numero = 19;
		cont2.saldo = 2500;
		cont2.limite = 700;
		System.out.println("Novo numero,saldo e limite da primeira conta: " + cont1.numero + " - " + cont1.saldo + " - " + cont1.limite);
		System.out.println("Novo numero,saldo e limite da segunda conta: " + cont2.numero + " - " + cont2.saldo + " - " + cont2.limite);
		
		System.out.println("-------------------------");
		cont1.depositar(200);
		System.out.println(cont1.consultar());
		cont1.sacar(300);
		System.out.println(cont1.consultar());
		System.out.println(cont1.extrato());
	
		System.out.println("-------------------------");
		System.out.println("Saldo conta 1: " + cont1.saldo);
		System.out.println("Saldo conta 2: " + cont2.saldo);
		
		cont1.tranferir(250, cont2);
		System.out.println("Saldo conta 1: " + cont1.saldo);
		System.out.println("Saldo conta 2: " + cont2.saldo);
		
		
	}

	

}
