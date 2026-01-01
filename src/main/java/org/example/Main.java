package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TarefaService service = new TarefaService();
        boolean rodando = true;

        System.out.println("=== SISTEMA DE TAREFAS ===");

        while (rodando) {
            System.out.println("\n1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Concluir Tarefa");
            System.out.println("4. Deletar Tarefa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Título da tarefa: ");
                    String titulo = scanner.nextLine();
                    service.adicionarTarefa(titulo);
                    break;

                case "2":
                    service.consultarTarefa();
                    break;

                case "3":
                    System.out.print("Título da tarefa para concluir: ");
                    String tituloConcluir = scanner.nextLine();
                    service.concluirTarefa(tituloConcluir);
                    break;

                case "4":
                    System.out.print("Título da tarefa para deletar: ");
                    String tituloDeletar = scanner.nextLine();
                    service.deletarTarefa(tituloDeletar);
                    break;

                case "0":
                    System.out.println("Encerrando sistema...");
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        scanner.close();
    }
}