# Sistema de Controle de Ferramentas

Projeto Integrado desenvolvido para o curso de Análise e Desenvolvimento de Sistemas da UNIFEOB.

## 📌 Sobre o projeto

O Sistema de Controle de Ferramentas foi desenvolvido com o objetivo de auxiliar no controle de ferramentas utilizadas em um ambiente de trabalho.

O sistema permite cadastrar ferramentas, consultar as ferramentas cadastradas e registrar retiradas e devoluções, mantendo atualizada a quantidade disponível de cada ferramenta.

O projeto foi desenvolvido em Java, utilizando conceitos de Programação Orientada a Objetos e estruturas básicas de lógica de programação.

## 🎯 Objetivos

- Cadastrar ferramentas;
- Consultar as ferramentas cadastradas;
- Controlar a quantidade disponível;
- Registrar a retirada de ferramentas;
- Registrar a devolução de ferramentas;
- Informar quando uma ferramenta não está disponível;
- Informar quando uma ferramenta não está cadastrada.

## 💻 Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

## 🧩 Estrutura do projeto

O sistema é organizado nas seguintes classes:

### `Main`
Responsável pela execução do sistema e pelo menu de opções apresentado ao usuário.

### `Ferramenta`
Representa uma ferramenta do sistema, contendo seu nome e sua quantidade disponível.

### `Funcionario`
Representa o funcionário responsável pela retirada ou devolução de uma ferramenta.

### `ControleFerramentas`
Responsável pelo gerenciamento das ferramentas cadastradas e pelas operações de retirada e devolução.

## ⚙️ Funcionalidades

O sistema possui as seguintes opções:

1. Cadastrar ferramenta
2. Listar ferramentas
3. Registrar retirada
4. Registrar devolução
5. Sair

Durante as operações, o sistema realiza verificações para evitar retiradas quando não há quantidade disponível e informa quando uma ferramenta não foi encontrada.

## 🧪 Testes realizados

Foram realizados testes das principais funcionalidades do sistema, incluindo:

- Cadastro de ferramentas;
- Listagem das ferramentas;
- Retirada de ferramentas com quantidade disponível;
- Tentativa de retirada sem quantidade disponível;
- Devolução de ferramentas;
- Busca por ferramenta inexistente.

## ▶️ Como executar

1. Clone este repositório:
   
   `git clone https://github.com/kathleintorres/sistema-controle-ferramentas.git`

2. Abra o projeto no IntelliJ IDEA.

3. Localize a classe `Main.java`.

4. Execute o método `main`.

5. Utilize o menu apresentado no console para testar as funcionalidades.

## 📚 Projeto acadêmico

Projeto desenvolvido como parte do Projeto Integrado do curso de Análise e Desenvolvimento de Sistemas da UNIFEOB.

## Integrantes

**Nome:** Kathlein Clissean Torres de Souza
**RA:** 25002397
**Instituição:** UNIFEOB  
**Curso:** Análise e Desenvolvimento de Sistemas  
**Ano:** 2026
