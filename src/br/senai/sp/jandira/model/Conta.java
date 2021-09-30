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
			System.out.println("Não é possível depositar valores menores ou iguais a 0!");
		}else {
			saldo += valorDeposito;
		}
	}
	
	public boolean sacar(double valorSaque) {
		if (valorSaque<=0) {
			System.out.println("\nNão é possível sacar um valor menor ou igual a 0!");
			return false;
		} else if (valorSaque>saldo) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		}else {
			saldo -= valorSaque;
			return true;
		}	
	
		
	}
	
	public void transferir(Conta contadestino, double valorTransferência) {
		boolean resultado = sacar(valorTransferência);
		if (resultado) {
			contadestino.depositar(valorTransferência);
		} else {
			System.out.println("Não possível efetuar a transferência!");
		}
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
