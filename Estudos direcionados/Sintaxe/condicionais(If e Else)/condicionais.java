class condicionais {
    public static void main(String[] args){
        byte idade = 13;

        if (idade < 13) { // Se idade for menor que 13 é uma Criança
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente"); // Ou se idade é maior ou igual a 17, é um Adolescente
        } else {
            System.out.println("Adulto"); // Se não é um Adulto
        }
        /*
        * Operadores Lógicos
            && (e)
            || (ou)
            ! (não)
        * */
        // Exemplo:
        int yearOld = 18;
        boolean temCNH = true;

        if (yearOld >= 18 && temCNH) { // Se tem 18 ou mais anos de idade && (e) tem CNH
            System.out.println("Pode dirigir legalmente"); // Você está liberado
        }

    }
}
class Ex1VerificadorDeNúmero {
    public static void main(String[] args) {
        /*
         * 1. Verificador de número positivo, negativo ou zero
         * Peça ao usuário para digitar um número e diga se ele é positivo, negativo ou igual a zero.
         */
        int num = 0;

        if (num < 0) {
            System.out.println("É negativo");
        } else if (num == 0) {
            System.out.println("O número é zero");
        } else {
            System.out.println("É positivo");
        }
    }
}
class Ex2ComparadorDeTrêsNúmeros {
    public static void main(String[] args) {
        /*
         *2. Comparador de três números
           Solicite três números ao usuário e diga qual deles é o maior. Se houver igualdade entre dois ou mais, avise também.
         */
        byte PrimeiroNum = 5;
        byte SegundoNum = 7;
        byte TerceiroNum = 1;

        if (PrimeiroNum > SegundoNum && PrimeiroNum > TerceiroNum){
            System.out.println("O primeiro numero é maior");
        } else if (SegundoNum > PrimeiroNum && SegundoNum > TerceiroNum){
            System.out.println("O Segundo numero é maior");
        } else{
            System.out.println("O Terceiro numero é maior");
        }
    }
}
class Ex3ValidadordeAcessoporIdade {
    public static void main(String[] args){
        /*
        * 3. Validador de acesso por idade
        Peça a idade do usuário. Se for maior ou igual a 18 anos, exiba "Acesso permitido", senão, exiba "Acesso negado".
        * */
        byte IdadedoUser = 12;

        if(IdadedoUser >= 18){
            System.out.println("Acesso permitido");
        } else{
            System.out.println("Acesso negado");
        }
    }
}
