package Interface;

public class ContaPouponca implements IConta {
	
	private int num = 0;
	private double saldo = 0;

	
	public int getNum() {
		return num;
	}
	public void setNum(int numconta) {
		this.num = numconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double deposita(double valor){
		this.setSaldo(getSaldo() + valor);
		return getSaldo();
	}
	
	public double saque(double valor) {
	   this.setSaldo(getSaldo() - valor);
	   return getSaldo();
	}
	
	public String extrato() {
		String extrato = ("Numero: " + num + "\nSaldo: " + saldo);
		return extrato;
	}
}
