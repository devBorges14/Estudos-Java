# Tipos de Dados em Java

Em Java, os tipos de dados se dividem em duas categorias principais:

---

## ✅ 1. Tipos Primitivos

Esses tipos armazenam valores diretamente na memória e são os mais básicos da linguagem. Existem 8 tipos primitivos:

| Tipo      | Tamanho  | Exemplo                   | Uso Principal                        |
|-----------|----------|---------------------------|--------------------------------------|
| `byte`    | 8 bits   | `byte idade = 13;`        | Números pequenos (economia de memória) |
| `short`   | 16 bits  | `short x = 32000;`        | Números inteiros pequenos            |
| `int`     | 32 bits  | `int n = 1000;`           | Inteiros (mais utilizados)           |
| `long`    | 64 bits  | `long l = 9999999999L;`   | Inteiros muito grandes               |
| `float`   | 32 bits  | `float pi = 3.14f;`       | Números decimais (precisão simples)  |
| `double`  | 64 bits  | `double x = 3.1415;`      | Números decimais (precisão dupla)    |
| `char`    | 16 bits  | `char letra = 'A';`       | Armazenar um único caractere         |
| `boolean` | 1 bit    | `boolean ligado = true;`  | Verdadeiro ou falso (`true` / `false`) |

---

## ✅ 2. Tipos por Referência

Esses tipos são baseados em **objetos** e vêm de **classes**. Eles não armazenam o valor diretamente, mas sim uma referência (endereço de memória).

### Exemplos:

- `String nome = "Gabriel";` → Sequência de caracteres (texto)
- `Scanner scanner = new Scanner(System.in);` → Entrada de dados via teclado
- `Integer`, `Double`, `Boolean` → Versões em objeto dos tipos primitivos
- Qualquer classe personalizada que você criar também será um tipo por referência

Esses tipos ficam na **heap** e possuem métodos úteis.

---

## 🔁 Comparação Primitivo vs Referência

| Tipo Primitivo | Tipo por Referência |
|----------------|---------------------|
| `int`          | `Integer`           |
| `double`       | `Double`            |
| `boolean`      | `Boolean`           |
| `char`         | `Character`         |

---

## ✍️ Dica

Sempre que precisar de performance e menos memória: use **tipos primitivos**.  
Se precisar de mais funcionalidades (como métodos úteis), use **referência**.

---

👨‍💻 Feito por Gabriel — Estudando Java do básico ao avançado!
