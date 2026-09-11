# Atividade de POO — Construtores

Atividade da disciplina de POO (SENAI) sobre construtores em Java: construtor básico, sobrecarga de construtores, chamada encadeada (`this(...)`) e construtores com herança (`super(...)`).

## Enunciado

**Exercício 1 — Construtor Básico**
Classe `Carro` com os atributos `marca`, `modelo` e `ano`.
- Passo 0: a classe sem nenhum construtor declarado ainda permite `new Carro()`, graças ao construtor default do Java.
- Depois, um construtor customizado inicializa os três atributos.

**Exercício 2 — Sobrecarga de Construtores**
Classe `Livro` com `titulo`, `autor` e `paginas`, com dois construtores: um completo e outro que recebe apenas o título.

**Exercício 3 — Sobrecarga de Construtores**
Classe `Filme` com `titulo`, `diretor` e `duracao`, com um construtor completo e outro que recebe apenas o título (diretor e duração assumem valores padrão).

**Exercício 4 — Chamada Encadeada de Construtores**
Classe `Produto` com `nome`, `preco` e `quantidade`. Um construtor completo e outro que recebe apenas nome e preço, chamando o primeiro via `this(...)` com quantidade padrão 1.

**Exercício 5 — Construtores e Herança**
Classe `Animal` (`nome`, `peso`) e classe `Cachorro`, que herda de `Animal` e adiciona `raca`, chamando o construtor da superclasse via `super(...)`.

## Estrutura

```
01-construtores-poo/
├── Carro.java
├── Livro.java
├── Filme.java
├── Produto.java
├── Animal.java
├── Cachorro.java
└── Main.java   -> executa e imprime o resultado dos 5 exercícios
```

## Como executar

```bash
javac *.java
java Main
```
