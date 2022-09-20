package com.exemplo.caixa;

import java.util.Scanner;

import com.exemplo.caixa.logica.ConsultaCpf;

public class AbrirConta extends ConsultaCpf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AbrirConta abrconta = new AbrirConta();

		int rdmnumero;
		int controleFor = 0;
		int controleSaida;

		for (int i = 0; i <= controleFor; i++) {
			System.out.println("Digite o Cpf ou Cnpj do titular da conta: ");
			abrconta.setCpfCnpj(scanner.nextDouble());

			System.out.println("Digite o nome do titular da conta: ");
			abrconta.setTitular(scanner.next()); // scanner.findInLine(); caso o scanner.next() n funcione

			System.out.println(abrconta.getTitular()
					+ " selecione sua Agência : \n1 - Bradesco \n2 - Banco do Brasil \n3 - Santander \n4 - NuBank \n5 - Caixa Econômica \n \n");
			abrconta.setAgencia(scanner.next());

			abrconta.setNumero(controleFor);
			System.out.println("Seus dados: \n Nome: " + abrconta.getTitular() + " \n Agência: " + abrconta.getAgencia()
					+ "Número: " + abrconta.getNumero());

			System.out.println("\n \nGostaria de: \n1 - Criar outra conta \n2 - Finalizar a sessão");
			controleSaida = scanner.nextInt();
			switch (controleSaida) {
			case 1:
				controleFor++;
				break;
			case 2:
				System.out.println("Bye...");
				System.exit(i);
				break;
			default:
				System.out.println("Coloque apenas os números indicados acima!");
				// Vou tentar tirar o break do default pra ver se ele espera até que eu coloque
				// o número certo, ou ele só trava mesmo.
				controleSaida = scanner.nextInt();
			}
		}

		scanner.close();
	}

	private String titular;
	private int numero;
	private String agencia;
	private double cpfCnpj;
	private String dataDeAbertura;

	public double getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(double cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	@Override
	protected void consultarCpf() {
		// TODO Auto-generated method stub
		System.out.println("Verificando se realmente é cpf ou cnpj");
	}

}
