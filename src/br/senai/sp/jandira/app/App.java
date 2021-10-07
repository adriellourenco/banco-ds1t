package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		//Criação da Agência que os Todos os Clientes Fazem Parte
		Agencia agenciaTeste = new Agencia();
		agenciaTeste.setNomeGerente("Carlos Eduardo Novaes");
		agenciaTeste.setNumeroAgencia("4214-9");
		agenciaTeste.setTelefone("4194-5549");
		agenciaTeste.setCidadeDaAgencia("Barueri");
		
		// Criação a cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Antonieta");
		clienteMaria.setEmail("mariaantonieta@gmail.com");
		clienteMaria.setSalario(5000.00);

		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setCliente(clienteMaria);
		contaMaria.setAgencia(agenciaTeste);
		contaMaria.depositar(500.00);
		contaMaria.setTipo(TipoConta.CORRENTE);

		System.out.println(contaMaria.getTipo());
		System.out.println(contaMaria.getAgencia().getNumeroAgencia());

		// Criação o cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedrocabral@gmail.com");
		clientePedro.setSalario(1000.00);

		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setCliente(clientePedro);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.SALARIO);
		contaPedro.setAgencia(agenciaTeste);

		System.out.println(contaPedro.getTipo());

		// Criação o cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("anagomes@gmail.com");
		clienteAna.setSalario(5000.00);

		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.setCliente(clienteAna);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.POUPANCA);
		contaAna.setAgencia(agenciaTeste);

		System.out.println(contaAna.getTipo());

		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();

		System.out.println();
		System.out.println("-------------------------");
		System.out.println();

		// Depositar 100 reais na conta da Maria
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();

		System.out.println();
		System.out.println("-------------------------");
		System.out.println();

		// Sacar 100 reais na conta da Maria
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();

		// Transferir 200 da Conta da Maria para a Conta do Pedro
		contaMaria.transferir(contaPedro, 2000);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();

	}

}
