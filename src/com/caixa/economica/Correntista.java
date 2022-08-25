/*
@autor   Ian Carlos
@version 1.9
@since   22/08/2022
*/
package com.caixa.economica;

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
        } else {
            System.out.println("Você não tem saldo suficiente");
        }
    }

    public void depositar(double valorDeposito) {
        if (this.saldo >= this.valorDeposito) {
            this.saldo = saldo + valorDeposito;
        } else {
            System.out.println("Você não tem saldo suficiente");
        }
    }

    public void calcularRendimento(double saldo) { // Que no caso é de 10% sobre o saldo
        this.saldo = saldo * 1.1;
    }

}