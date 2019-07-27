package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.Agencia;

public class TesteAgencia {
	
public static void main(String[] args) {
		
		Agencia ag1 = new Agencia(86);
		Agencia ag2 = new Agencia(37);
		System.out.println("Numero da primeira agencia: " + ag1.numero);
		System.out.println("Numero da segunda agencia: " + ag2.numero);
		ag1.numero = 86;
		ag2.numero = 37;
		System.out.println("Novo numero da primeira agencia: " + ag1.numero);
		System.out.println("Novo numero da segunda agencia: " + ag2.numero);
	}

}
