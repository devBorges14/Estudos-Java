public class Main {
    public static void main(String[] args) {
        System.out.println("Testando a Sintaxe básica em JAVA");
        new Test(); // Chama o construtor da classe Test
    }

}
class variavélIdade {
    byte minhaIdade = 13; // Passando essa variável como byte
}
/*Tipos primitivos do JAVA
 * numeros inteiros = 100, 10, 50, 123
 * -> Tipos para declarar um numero inteiro, usando:
 * 1) byte => 8 bits -128 a 127
 * ou seja se eu tentar fazer isto:
 *      byte minhaVar = 225 Vai dar erro pois o Byte só vai do numero -128 a 127
 * porque usaria isso? Para gastar menos espaço na memoria
 * 2) short => 16 bits => -32.768 a 32.767
 * 3) int => 32 bits => -2.147.483.648 a 2.147.483.647
 * 4) long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
 */
// Números decimais = 1.2, 3.4, 5.5
/*
 * float => 32 bits => 3.40282347E+38F precisão simples
 * double => 64 bits => 1.79769313486231570E+308 precisão dupla
 */
/*
 * String => representar palavras, frases, textos (usa aspas duplas)
 * char=> representar um único caractere => 'a', 'b', 'c', '1', '2', '3'
 * char meuChar= 'a'; 
 * meuChar = "Gabriel"; // Isso não é permitido, pois o char só aceita um único caractere
 * boolean meuBoolean = true ou false; // Representa verdadeiro ou falso
 */

 class Test {
    byte b = 100;
    short s = 1000;
    int i = 10000;
    long l = 100000L; // O L é opcional, mas é uma boa prática usar
    float f = 10.5f; // O f é opcional, mas é uma boa prática usar
    double d = 10.5; // O d é opcional, mas é uma boa prática usar
    String str = "Hello World"; 
    char c = 'A';
    boolean bool = true;
    
public Test() {
    boolean usuarioLogado = true;
    if(usuarioLogado) {
        System.out.println("Logado com sucesso");
    } else {
        System.out.println("Não logado");
    }
    }

}