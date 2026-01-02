# 📝 Gerenciador de Tarefas Java

Um sistema interativo via console desenvolvido em Java para o gerenciamento eficiente de tarefas cotidianas. O projeto aplica conceitos de **Programação Orientada a Objetos (POO)** e separação de lógica de serviço.

## ⚙️ Funcionalidades Implementadas

O sistema permite o controle total do ciclo de vida de uma tarefa:

- **Adicionar Tarefas:** Valida se o título não está vazio e impede a criação de tarefas com nomes duplicados.
- **Listar Tarefas:** Exibe visualmente o status da tarefa usando marcações (`[ ]` para pendentes e `[X]` para concluídas).
- **Concluir Tarefas:** Localiza uma tarefa pelo título (independente de maiúsculas/minúsculas) e altera seu estado.
- **Remover Tarefas:** Exclui tarefas cadastradas da lista em memória.
- **Interface via CLI:** Menu interativo para navegação do usuário.

## 🏗️ Estrutura do Código

O projeto está dividido em três pilares principais:

1.  **`Tarefa.java` (Model):** Define a estrutura da tarefa com atributos `titulo` e `concluida`.
2.  **`TarefaService.java` (Service):** Contém a "inteligência" do sistema, com toda a lógica de negócio, validações de duplicidade e manipulação da lista.
3.  **`Main.java` (App):** Ponto de entrada que gerencia o fluxo de entrada do usuário via `Scanner`.

## 🛠️ Tecnologias

- **Linguagem:** Java
- **Estrutura de Dados:** `ArrayList` para persistência em tempo de execução.
- **Ferramentas:** Git e Maven/IntelliJ.

## 🚀 Como Executar

1. Certifique-se de ter o **JDK 11+** instalado.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/Yvenscivel/validador-tarefas-java.git](https://github.com/Yvenscivel/validador-tarefas-java.git)