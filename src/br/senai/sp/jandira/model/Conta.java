package br.senai.sp.jandira.model;

public class Conta {
	
	public String tipo;
	private String numero;
	public String numeroAgencia;
	public String titular;
	private double saldo;
	
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	public void depositar(double valorDeposito) {
		if (valorDeposito<=0) {
			System.out.println("N�o � poss�vel depositar valores menores ou iguais a 0!");
		}else {
			saldo += valorDeposito;
		}
	}
	
	public boolean sacar(double valorSaque) {
		if (valorSaque<=0) {
			System.out.println("\nN�o � poss�vel sacar um valor menor ou igual a 0!");
			return false;
		} else if (valorSaque>saldo) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		}else {
			saldo -= valorSaque;
			return true;
		}	
	
		
	}
	
	public void transferir(Conta contadestino, double valorTransfer�ncia) {
		boolean resultado = sacar(valorTransfer�ncia);
		if (resultado) {
			contadestino.depositar(valorTransfer�ncia);
		} else {
			System.out.println("N�o poss�vel efetuar a transfer�ncia!");
		}
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
