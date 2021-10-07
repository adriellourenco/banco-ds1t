package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	private TipoConta tipo;
	private String numero;
	private Agencia agencia;
	public Cliente cliente;
	private double saldo;

	// Método Construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}

	// Método para Alterar o Atributo Tipo
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	// Método para Pegar o Atributo Tipo
	public TipoConta getTipo() {
		return tipo;
	}

	/* Método para Alterar o Atributo numeroAgencia
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	 Método para Pegar o Atributo numeroAgencia
	public String getNumeroAgencia() {
		return numeroAgencia;
	}*/

	// Método para definir quem é o cliente da conta
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// Método para mostrar/pegar quem é o cliente da conta
	public Cliente getCliente() {
		return this.cliente;
	}

	// Método para definir quem é a agência da conta
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	// Método para mostrar/pegar quem é a agência da conta
	public Agencia getAgencia() {
		return this.agencia;
	}

	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			System.out.println("Não é possível depositar valores menores ou iguais a 0!");
		} else {
			saldo += valorDeposito;
		}
	}

	public boolean sacar(double valorSaque) {
		if (valorSaque <= 0) {
			System.out.println("\nNão é possível sacar um valor menor ou igual a 0!");
			return false;
		} else if (valorSaque > saldo) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		} else {
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
		System.out.printf("Titular: %s\n", cliente.getNome());
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", agencia.getNumeroAgencia());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
