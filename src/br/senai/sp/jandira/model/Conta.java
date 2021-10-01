package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	
	private TipoConta tipo;
	private String numero;
	private String numeroAgencia;
	public Cliente titular;
	private double saldo;
	
	//Método Construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	//Método para Alterar o Atributo Tipo
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
	//Método para Pegar o Atributo Tipo
	public TipoConta getTipo(){
		return tipo;
	}
	
	//Método para Alterar o Atributo numeroAgencia
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	
	//Método para Pegar o Atributo numeroAgencia
	public String getNumeroAgencia() {
		return numeroAgencia;
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
