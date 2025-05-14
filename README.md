# Sistema de Biblioteca com Herança, Polimorfismo e Métodos da Classe Object (Java)

Este projeto em Java implementa um sistema simples de gerenciamento de biblioteca utilizando os conceitos fundamentais de **Programação Orientada a Objetos**: **herança**, **polimorfismo** e **sobrescrita de métodos** da classe `Object`.

## 📚 Etapas do Projeto

### ✅ Etapa 1 – Herança Multinível

Implementa uma hierarquia de classes para representar diferentes tipos de alunos:

- `Aluno` (classe base)
- `AlunoGraduacao` (subclasse de `Aluno`)
  - `AlunoEngenharia`
  - `AlunoDireito`
- `AlunoEnsinoMedio`

Cada classe possui atributos específicos, e o método `solicitarLivro(String titulo)` é sobrescrito para exibir mensagens personalizadas.

### ✅ Etapa 2 – Polimorfismo

Criação de uma classe base `ItemBiblioteca`, com subclasses:

- `Livro`
- `Revista`

Cada uma sobrescreve o método `avaliar()` para mostrar comportamento distinto. A classe `Aluno` possui o método `avaliarItem(ItemBiblioteca item)` que aceita qualquer item de biblioteca, demonstrando **polimorfismo**.

### ✅ Etapa 3 – Uso da Classe Object

- O método `toString()` é sobrescrito em `Aluno`, `Livro` e `Revista` para fornecer uma representação legível dos objetos.
- O método `equals()` é sobrescrito na classe `Aluno` para considerar dois objetos iguais se tiverem a **mesma matrícula**.

## 🧪 Como Executar

1. Importe o projeto para sua IDE Java (Eclipse, IntelliJ ou VS Code).
2. Compile e execute a classe `Main.java`.
3. Observe a saída no console demonstrando a criação dos alunos, solicitação de livros, avaliação de itens e comparação de objetos.

## 💡 Conceitos Utilizados

- Herança e herança multinível
- Polimorfismo via sobrescrita de métodos
- Sobrescrita dos métodos `toString()` e `equals()` da classe `Object`
- Organização modular e reutilização de código

## 📁 Estrutura do Projeto

