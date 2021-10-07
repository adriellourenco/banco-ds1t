package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	private TipoConta tipo;
	private String numero;
	private Agencia agencia;
	public Cliente cliente;
	private double saldo;

	// M�todo Construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}

	// M�todo para Alterar o Atributo Tipo
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	// M�todo para Pegar o Atributo Tipo
	public TipoConta getTipo() {
		return tipo;
	}

	/* M�todo para Alterar o Atributo numeroAgencia
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	 M�todo para Pegar o Atributo numeroAgencia
	public String getNumeroAgencia() {
		return numeroAgencia;
	}*/

	// M�todo para definir quem � o cliente da conta
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// M�todo para mostrar/pegar quem � o cliente da conta
	public Cliente getCliente() {
		return this.cliente;
	}

	// M�todo para definir quem � a ag�ncia da conta
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	// M�todo para mostrar/pegar quem � a ag�ncia da conta
	public Agencia getAgencia() {
		return this.agencia;
	}

	public void depositar(double valorDeposito) {
		if (valorDeposito <= 0) {
			System.out.println("N�o � poss�vel depositar valores menores ou iguais a 0!");
		} else {
			saldo += valorDeposito;
		}
	}

	public boolean sacar(double valorSaque) {
		if (valorSaque <= 0) {
			System.out.println("\nN�o � poss�vel sacar um valor menor ou igual a 0!");
			return false;
		} else if (valorSaque > saldo) {
			System.out.println("\nSaldo Insuficiente!");
			return false;
		} else {
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
		System.out.printf("Titular: %s\n", cliente.getNome());
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", agencia.getNumeroAgencia());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
