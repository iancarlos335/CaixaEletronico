package database.model.eclipse;

import java.time.LocalDateTime;

public class Conta {

	private String agencia;
	private String nomeTitular;
	private int numeroConta;
	private double pessoaFisicaOuJuridica;
	private int rendaFixaAtual;
	private LocalDateTime horarioCriacao; // private LocalDateTime dataDeCriacaoDateTime;

	/*
	 * Quando eu for consumir a api dos correios double cep; String endereco; int
	 * numeroResidencia; String complemento;
	 */

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getPessoaFisicaOuJuridica() {
		return pessoaFisicaOuJuridica;
	}

	public void setPessoaFisicaOuJuridica(double pessoaFisicaOuJuridica) {
		this.pessoaFisicaOuJuridica = pessoaFisicaOuJuridica;
	}

	public int getRendaFixaAtual() {
		return rendaFixaAtual;
	}

	public void setRendaFixaAtual(int rendaFixaAtual) {
		this.rendaFixaAtual = rendaFixaAtual;
	}

	public LocalDateTime getHorarioCriacao() {
		return horarioCriacao;
	}

	public void setHorarioCriacao(LocalDateTime horarioCriacao) {
		this.horarioCriacao = horarioCriacao;
	}

}
