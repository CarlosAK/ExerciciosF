package br.com.Polimorfismo;

public class TesteControleDePonto {
	
	public static void main(String[] args) {

		Gerente ger = new Gerente(221,"Ana", "Ana812");
		
		Telefonista tel = new Telefonista(192,"Funcionario Ana", 3);
		
		
		ControleDePonto control = new ControleDePonto();
		
		control.entrada(ger);
		control.entrada(tel);
		control.saida(ger);
		control.saida(tel);
	}

}
