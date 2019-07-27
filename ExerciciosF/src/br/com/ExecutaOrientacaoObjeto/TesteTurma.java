package br.com.ExecutaOrientacaoObjeto;

import br.com.orientacaoObjeto.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		
		Turma turm1 = new Turma();
		Turma turm2 = new Turma();
		
		turm1.periodo = "Matutino";
		turm1.serie = 1;
		turm1.sigla = "A";
		turm1.ensino = "Fundamental";
		turm2.periodo = "Noturno";
		turm2.serie = 3;
		turm2.sigla = "A";
		turm2.ensino = "Medio";
		System.out.println("Periodo, serie, sigla e ensino: " + turm1.periodo + " - " + 
					turm1.serie + " - " + turm1.sigla + " - " + turm1.ensino);
		System.out.println("Periodo, serie, sigla e ensino: " + turm2.periodo + " - " + 
				turm2.serie + " - " + turm2.sigla + " - " + turm2.ensino);

	}

}
