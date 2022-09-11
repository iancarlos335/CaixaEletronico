/*
@autor   Ian Carlos
@version 1.9
@since   22/08/2022
*/
package com.exemplo.caixa;

public class Correntista {

    // Conta atributosConta = new Conta();
    private double saldo;
    private double valorSaque;
    private double valorDeposito;

    // Criando os gets e sets, pq n da pra pegar os valores do saldo em outra classe
    // sem que seja um método objetificado.
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public void sacar(double valorSaque) {
        if (this.saldo >= this.valorSaque) {
            this.saldo = saldo - valorSaque;
            System.out.println("O saque deu certo!");
            System.out.println("O valor do saque foi de: " + getValorSaque());
        } else {
            System.out.println("Você não tem saldo suficiente.");
            System.out.println("O valor do saque foi de: 0.0");
        }
    }

    public void depositar(double valorDeposito) {
        if (this.saldo >= this.valorDeposito) {
            this.saldo = saldo + valorDeposito;
            System.out.println("O depósito deu certo!");
            System.out.println("O valor do depósito foi de: " + getValorDeposito());
        } else {
            System.out.println("Você não tem saldo suficiente.");
            System.out.println("O valor do depósito foi de: 0.0");
        }
    }

    public void calcularRendimento(double saldo) { // Que no caso é de 10% sobre o saldo
        this.saldo = saldo * 1.1;
        System.out.println("O rendimento deu certo!");
    }

}