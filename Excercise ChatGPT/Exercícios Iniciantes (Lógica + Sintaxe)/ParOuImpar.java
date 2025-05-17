import java.util.Scanner;

/*
1. Par ou Ímpar:
   Peça um número e diga se ele é par ou ímpar.
*/

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        short number = scanner.nextShort();
        
        if (number % 2 != 0) {
            System.out.println("O número " + number + " é ímpar");
        } else {
            System.out.println("O número " + number + " é par");
        }

        scanner.close();
    }
}
