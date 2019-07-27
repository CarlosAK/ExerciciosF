package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.Aluno;

public class TesteAluno {
	
public static void main(String[] args) {
		
		Aluno alun1 = new Aluno();
		Aluno alun2 = new Aluno();
		alun1.nome = "Carlos";
		alun1.rg = 9654381;
		alun1.datNascimento = "08/01/1992";
		alun2.nome = "Rafael";
		alun2.rg = 3876351;
		alun2.datNascimento = "10/01/1984";
		
		System.out.println("Nome, rg e data de nascimento do primeiro aluno: " + 
				alun1.nome + " - " + alun1.rg + " - " + alun1.datNascimento);
		System.out.println("Nome, rg e data de nascimento do segundo aluno: " + 
				alun2.nome + " - " + alun2.rg + " - " + alun2.datNascimento);
	}

}
