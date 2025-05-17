import java.util.Scanner;

class Variable {
    public static void main(String[] args) {
        System.out.println("Testando as Varíaveis");
        byte Idade = 13;
        System.out.println("Minha idade é " + Idade);

        double Altura = 169.50;
        System.out.println("Minha altura: " + Altura + "cm");
    }}
/*
 * NÚMEROS INTEIROS (sem ponto decimal):
 *
 *
 * 1) byte  => 8 bits    => de -128 a 127
 *    Exemplo: byte idade = 13;
 *    -> Usado quando o valor é pequeno e queremos economizar memória.
 *
 * 2) short => 16 bits   => de -32.768 a 32.767
 * 3) int   => 32 bits   => de -2.147.483.648 a 2.147.483.647
 * 4) long  => 64 bits   => de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
 *    -> Para valores muito grandes. Para declarar um literal `long`, usa-se o `L`:
 *       Exemplo: long populacao = 8000000000L;
 */

/*
 * NÚMEROS DECIMAIS (com ponto decimal):
 *
 * 1) float  => 32 bits  => até ±3.40282347E+38F (precisão simples)
 *     Exemplo: float preco = 10.5f;
 *
 * 2) double => 64 bits  => até ±1.79769313486231570E+308 (precisão dupla)
 *     Exemplo: double salario = 2560.75;
 */
class Ex1CalculadoradeIdadeFutura {
        /*
        * 1: Calculadora de idade futura
        Peça ao usuário sua idade e mostre quantos anos ele terá daqui a 10 anos.
        * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada de dados para a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        int IdadeCalculada =  (idade + 10);
        System.out.println(IdadeCalculada);
        scanner.close();
            }
        }

class Ex2ConversorDeTemperatura {
    /*
    * 2: Conversor de temperatura
    Crie um programa que peça a temperatura em Celsius e converta para Fahrenheit.
    Fórmula: F = (C × 1.8) + 32
    * */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        double C = scanner.nextDouble();
        double formula = (C * 1.8) + 32.00;
        System.out.println("Temperatura em Fahrenheit: " + formula);
        scanner.close();

    }
}

class Ex3SalárioPorHora {
    /*
     * 3: Salário por hora
     * Peça ao usuário seu salário mensal e a quantidade de horas que trabalha por mês.
     * Calcule e exiba quanto ele ganha por hora trabalhada
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do salário
        System.out.print("Salário do mês: ");
        double salarioMensal = scanner.nextDouble();

        // Entrada das horas trabalhadas
        System.out.print("Horas trabalhadas por mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        // Cálculo
        double salarioPorHora = salarioMensal / horasTrabalhadas;
        System.out.println("Você ganha R$ " + salarioPorHora + " por hora.");

        scanner.close();
    }
}
