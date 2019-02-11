package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	public void saca(double valor)throws SaldoInsuficienteException {
		double valoraASacar = valor + 0.2;
		super.saca(valoraASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo+=valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo*0.01;
	}
	

}
