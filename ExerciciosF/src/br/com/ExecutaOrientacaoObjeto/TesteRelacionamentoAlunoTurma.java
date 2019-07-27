package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.Aluno;
import br.com.orientacaoObjeto.Turma;

public class TesteRelacionamentoAlunoTurma {

	public static void main(String[] args) {
		
		Turma turm1 = new Turma();
		Aluno alun1 = new Aluno();
		
		turm1.periodo = "Integral";
		turm1.serie = 3;
		turm1.sigla = "C";
		turm1.ensino = "Médio";
		
		alun1.nome = "Ana";
		alun1.rg = 563987;
		alun1.datNascimento = "08/07/2007";
		alun1.turma = turm1;
		
		System.out.println("Nome, rg, data de nascimento do aluno: " + 
			alun1.nome + " - " + alun1.rg + " - " + alun1.datNascimento + "\n Turma: " + 
			alun1.turma.periodo + " " + alun1.turma.ensino + " " + alun1.turma.serie + " ano " + alun1.turma.sigla);

	}

}
