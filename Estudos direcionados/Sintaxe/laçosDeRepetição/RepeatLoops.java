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
class Ex2For {
    public static void main(String[] args) {
        /*
        * 2. For – Tabuada
            Descrição: Peça um número e exiba a tabuada dele de 1 a 10 usando for.
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int conta = i * num;
            System.out.println(num + " x " + i + " = " + conta);
        }
    }
}
class Ex3DoWhile {
    public static void main(String[] args) {
        /*
        * 3. Do-while – Continuar ou parar
            Descrição: Peça que o usuário digite seu nome. Após isso, pergunte se ele quer continuar (s) ou sair (n). Repita enquanto a resposta for s.
        * */
        /*
        * int i = 0;
        do {
            System.out.println("Valor de i: " + i);
            i++;
        } while (i < 5);
        * */
        Scanner scanner = new Scanner(System.in);
        String continuar;
        String nome;
        do {

        // Nome
        System.out.print("Digite seu nome: ");
        nome = scanner.next();

        // Deseja continuar?
        System.out.print("Deseja continuar? [s/n]: ");
        continuar = scanner.next();

        } while ( continuar.equalsIgnoreCase("s"));
        System.out.println("Ok " +  nome + " programa encerrado.");
        scanner.close();
    }
}