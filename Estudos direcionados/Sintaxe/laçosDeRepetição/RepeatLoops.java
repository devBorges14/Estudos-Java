import java.util.Scanner;
public class RepeatLoops {
    public static void main(String[] args) {
        // While
        /*
         * Para melhorar o seu entendimento vamos criar uma analogia. Sabe quando o Burro do
         * Shrek fica perguntando se "já chegou?" Trazendo a cena icônica do burro irritando o Shrek.
         * Então vamos fazer uma simples lógica:
         */
        boolean jaChegamos = false; // jaChegamos = false (Não chegamos ainda Burro!)

        while (!jaChegamos) { // Se não chegamos ainda
            System.out.println("E agora, já chegamos?"); // Imprima "E agora, já chegamos?"
            jaChegamos = true; // Passa jaChegamos para verdadeiro
        }

        System.out.println("Sim, chegamos!"); // Estamos fora do laço de repetição

        // For
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }
        // do-while
        /*
        * É uma estrutura de repetição parecida com o while, mas com uma diferença importante:
          O bloco do do-while é executado pelo menos uma vez, mesmo que a condição seja
        * */
        int i = 0;
        do {
            System.out.println("Valor de i: " + i);
            i++;
        } while (i < 5);

    }
}


class Ex1While {
    public static void main(String[] args) {
        /*
        * 1. While – Contagem regressiva
            Descrição: Peça ao usuário um número inteiro positivo. Exiba uma contagem regressiva até 0 usando while.
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();

        while (num != -1) {
            System.out.println(num);
            num = num - 1;
        }
        scanner.close(); // sempre bom fechar o scanner
    }
}
