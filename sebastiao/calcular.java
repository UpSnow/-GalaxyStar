package sebastiao;

import java.util.Scanner;

public class calcular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções para o usuário
        System.out.println("Selecione a operação desejada:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        // Lê a escolha da operação
        int operacao = scanner.nextInt();

        // Lê os números para a operação
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        // Realiza a operação escolhida
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro! Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
