package br.com.Polimorfismo;

public class ControleDePonto {
	
	public class ControleDePonto {
		
		public void entrada(Funcionario func) {
			SimpleDateFormat entrada = new SimpleDateFormat ("dd/MM/ yyyy HH:mm:ss") ;
			Date agora = new Date () ;
			
			System.out.println("Funcionario: " + func.getCodigo() + " entrou!");
			System.out.println("Horario: " + entrada.format(agora));
			
		}
		
		public void saida(Funcionario func) {
			SimpleDateFormat saida = new SimpleDateFormat ("dd/MM/ yyyy HH:mm:ss") ;
			Date agora = new Date () ;		
			System.out.println("Funcionario: " + func.getCodigo() + " saiu!");
			System.out.println("Horario: " + saida.format(agora));
			
		}

}
