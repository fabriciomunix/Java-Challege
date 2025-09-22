# Documentação do Projeto Aurawave Java

Este documento explica a estrutura e o funcionamento do código presente no projeto Aurawave Java.

## Estrutura de Pastas 

- `pom.xml`: Arquivo de configuração do Maven, responsável por gerenciar as dependências do projeto.
- `src/main/java/com/aurawave/`: Pacote principal do código fonte.
  - `Main.java`: Classe principal para execução da aplicação.
  - `dao/ProdutoDAO.java`: Classe responsável pelo acesso e manipulação dos dados de produtos no banco de dados (Data Access Object).
  - `model/`: Contém as classes de modelo (entidades) do sistema:
    - `Amostra.java`: Representa uma amostra de dados.
    - `Medicao.java`: Representa uma medição realizada.
    - `Produto.java`: Representa um produto.
    - `Usuario.java`: Representa um usuário do sistema.
  - `service/`: Camada de serviços, responsável pela lógica de negócio:
    - `MedicaoService.java`: Serviços relacionados a medições.
    - `ProdutoService.java`: Serviços relacionados a produtos.
  - `util/ConnectionFactory.java`: Classe utilitária para criar e gerenciar conexões com o banco de dados.
- `src/test/java/com/aurawave/AurawaveTest.java`: Classe de testes automatizados do sistema.

## Descrição dos Componentes

### DAO (Data Access Object)
- **ProdutoDAO.java**: Implementa métodos para inserir, buscar, atualizar e remover produtos do banco de dados, utilizando JDBC para comunicação.

### Modelos (Entidades)
- **Amostra.java**: Define os atributos e métodos de uma amostra.
- **Medicao.java**: Define os atributos e métodos de uma medição.
- **Produto.java**: Define os atributos e métodos de um produto.
- **Usuario.java**: Define os atributos e métodos de um usuário.

### Serviços
- **MedicaoService.java**: Contém regras de negócio e operações relacionadas a medições, utilizando as entidades e DAOs.
- **ProdutoService.java**: Contém regras de negócio e operações relacionadas a produtos, utilizando as entidades e DAOs.

### Utilitários
- **ConnectionFactory.java**: Centraliza a criação de conexões com o banco de dados, facilitando a reutilização e manutenção.

### Testes
- **AurawaveTest.java**: Implementa testes automatizados para garantir o correto funcionamento das funcionalidades do sistema.

## Funcionamento Geral

O projeto segue o padrão MVC (Model-View-Controller), separando as responsabilidades em camadas:
- **Model**: Representa os dados e regras de negócio básicas.
- **DAO**: Responsável pela persistência dos dados.
- **Service**: Implementa a lógica de negócio.
- **Main**: Ponto de entrada da aplicação.

A comunicação com o banco de dados é feita via JDBC, utilizando a `ConnectionFactory` para obter conexões. As operações de CRUD (Create, Read, Update, Delete) são realizadas pelos DAOs. As regras de negócio ficam concentradas nos serviços, que utilizam os DAOs e modelos para executar as operações necessárias.

## Observações
- O projeto utiliza Maven para gerenciamento de dependências e build.
- Os testes automatizados garantem a qualidade e funcionamento do sistema.

---

Caso precise de explicações detalhadas sobre uma classe ou método específico, solicite informando o nome desejado.