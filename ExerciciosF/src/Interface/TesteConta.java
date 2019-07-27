package Interface;

public class TesteConta {

	public static void main(String[] args) {
		

		ContaCorrente cc = new ContaCorrente();
		cc.setNum(812);
		cc.setSaldo(2476.0);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setNum(812);
		cp.setSaldo(4751.0);
		
		System.out.println("Deposita: " + cc.deposita(1000.0));
		System.out.println("Saca: " + cc.saque(1000.0));
		System.out.println("\n Corrente \n" + cc.extrato());
		System.out.println("\n Poupanca \n" + cp.extrato());
	

	}

}
