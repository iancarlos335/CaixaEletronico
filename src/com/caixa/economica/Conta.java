/*
@autor   Ian Carlos
@version 1.9
@since   22/08/2022
*/

package com.caixa.economica
;

import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {
        Correntista movimentacao = new Correntista(); // novo objeto que referencia a classe irmã nesse mesmo diretório
        Scanner scanner = new Scanner(System.in);

        String titular;
        int numero;
        String agencia;
        String dataDeAbertura;
        String controleMetodos;
        String metodos;
        int novaMovimentacao;
        int controleMovimentacoes = 0;

        System.out.println("Coloque o nome do titular da conta por gentileza.");
        titular = scanner.nextLine();
        System.out.println("Coloque o número da conta do " + titular);
        numero = scanner.nextInt();
        System.out.println("Coloque o nome da agencia do " + titular);
        agencia = scanner.next();
        System.out.println("Coloque o saldo da conta " + numero + " no atual momento:");
        movimentacao.setSaldo(scanner.nextDouble()); // puxando o doidão vei
        System.out.println("Insira a data da abertura da conta " + numero + ":");
        dataDeAbertura = scanner.next();
        System.out.println("\n");

        System.out.println("Verifique os dados:");
        System.out.println("Titular da conta : " + titular);
        System.out.println("Número da conta: " + numero);
        System.out.println("Agência da conta: " + agencia);
        System.out.println("Saldo da conta: " + movimentacao.getSaldo()); // puxando o doidão vei
        System.out.println("Data de cadastro: " + dataDeAbertura + "\n");

        for (int i = 0; i <= controleMovimentacoes; i++) {

            System.out.println("Recursos de movimentação bancária:");
            System.out.println("Saque é S");
            System.out.println("Depósito é D");
            System.out.println("Cálculo de Rendimento é R");
            System.out.println(
                    "Para realizar a movimentação desejada digite S, D ou R para os recursos apresentados aneriormente.");
            metodos = scanner.next(); // O segredo disso ta na propriedade equals();
            controleMetodos = metodos;

            if (controleMetodos.equals("S")) {
                System.out.println("Insira o valor do saque: ");
                movimentacao.setValorSaque(scanner.nextDouble());
                movimentacao.sacar(movimentacao.getValorSaque());
                System.out.println("O valor do saque foi de: " + movimentacao.getValorSaque());
                System.out.println("Seu saldo atual é de: " + movimentacao.getSaldo());
                System.out.println("O saque deu certo \n");
            } else if (controleMetodos.equals("D")) {
                System.out.println("Insira o valor do depósito: ");
                movimentacao.setValorDeposito(scanner.nextDouble());
                movimentacao.depositar(movimentacao.getValorDeposito());
                System.out.println("O valor do depósito foi de: " + movimentacao.getValorDeposito());
                System.out.println("Seu saldo atual é de: " + movimentacao.getSaldo());
                System.out.println("O depósito deu certo \n");
            } else if (controleMetodos.equals("R")) {
                movimentacao.calcularRendimento(movimentacao.getSaldo());
                System.out.println("O seu rendimento aumentou o saldo para: " + movimentacao.getSaldo());
                System.out.println("O rendimento deu certo \n");
            } else {
                System.out.println("Coloque o número certo \n");
            }

            System.out.println("Deseja realizar uma nova movimentação bancária? Digite 1 para sim ou 2 para não");
            novaMovimentacao = scanner.nextInt();
            System.out.println("\n");

            /*
             * Essa estrutura condicional que basicamente controla todo o for, se der
             * problema nela, o for (estrutura repetição) inteiro vai dar problema.
             */
            switch (novaMovimentacao) {
                case 1: /*
                         * Caso o valor atribuido na variavel novaMovimentação seja 1(case 1:), o que
                         * vier depois dos dois pontos será executado como argumentos
                         */
                    controleMovimentacoes++;
                    break;
                case 2: // Aqui é 2 então será executado apenas se for digitado 2
                    System.out.println("Ok, fechando as operações. \n \nBye.");
                    break;
                default: // Aqui é se não for atribuido nada à variavel
                    System.out.println("Digite apenas algum dos numeros indicados anteriormente");

            }

        }

        // vo ter q chamar os metodos da classe Correntista aqui no metodo Main

        scanner.close();
    }

}
