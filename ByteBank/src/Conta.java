import java.util.Random;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
		
	public Conta(double depositoInicial, Cliente titular) {
		Random random = new Random();

        int agencia = random.nextInt(999 + 111) - 111;
		int numero = random.nextInt(11111 + 99999) - 11111;
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = depositoInicial;
		this.titular = titular;
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
}