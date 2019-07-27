package br.com.statico;

import br.com.orientacaoObjeto.Funcionario;
import br.com.orientacaoObjeto.Gerente;
import br.com.orientacaoObjeto.Secretaria;
import br.com.orientacaoObjeto.Telefonista;

public class TesteGerenteSecretariaTelefonista {

	public static void main(String[] args) {
		
		Funcionario ger = new Gerente("Alice", 1400,"Alice739","Minhasenha");
		Funcionario tel = new Telefonista("Amanda",853.55,8);
		Funcionario sec = new Secretaria("Aline", 2292.99,"207");
		
		
		System.out.println("Gerente: " + ger.dados());
		System.out.println("Telefonista: " + tel.dados());
		System.out.println("Secretaria: " + sec.dados());
		
		ger.aumentarSalario();
		tel.aumentarSalario();
		sec.aumentarSalario();
		
		System.out.println("Gerente: " + ger.dados());
		System.out.println("Telefonista: " + tel.dados());
		System.out.println("Secretaria: " + sec.dados());

	}

}
