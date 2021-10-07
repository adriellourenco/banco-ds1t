package br.senai.sp.jandira.model;

public class Agencia {

	private String numeroAgencia;
	private String nomeGerente;
	private String telefone;
	private String cidadeDaAgencia;

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroAgencia() {
		return this.numeroAgencia;
	}

	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}

	public String getNomeGerente() {
		return this.nomeGerente;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setCidadeDaAgencia(String cidadeDaAgencia) {
		this.cidadeDaAgencia = cidadeDaAgencia;
	}

	public String getCidadeDaAgencia() {
		return this.cidadeDaAgencia;
	}

}
