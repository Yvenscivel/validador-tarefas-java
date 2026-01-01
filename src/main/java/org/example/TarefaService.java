package org.example;

import java.util.ArrayList;
import java.util.List;


public class TarefaService {
    private final List <Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String titulo){

        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Tarefa não pode ser vazia");
            return;
        }

        for(Tarefa t : tarefas ){
            if(t.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Erro: '" + titulo + "' já existe");
                return;
            }
        }

        Tarefa t1 = new Tarefa(titulo);
        tarefas.add(t1);
        System.out.println("Tarefa: '" + titulo+ "' foi adicionada com o sucesso");
    }

    public void consultarTarefa(){

        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa encontrada");
            return;
        }

        for(Tarefa t : tarefas ){
            if (!t.isConcluida()){
                System.out.println("[ ] " + t.getTitulo());
            }else{System.out.println("[X] " + t.getTitulo());}
        }
    }

    public void concluirTarefa(String titulo){
        if (titulo == null) return;

        for(Tarefa t : tarefas){
            if (titulo.equalsIgnoreCase(t.getTitulo())){
                t.setConcluida(true);
                System.out.println("Tarefa concluída com sucesso");
                return;
            }
        }

        System.out.println("Tarefa não encontrada");
    }

    public void deletarTarefa(String titulo){
        boolean tarefa = tarefas.removeIf(t -> t.getTitulo().equalsIgnoreCase(titulo));

        if(!tarefa){
            System.out.println("A tarefa: '" + titulo + "' não foi encontrada");
            return;
        }

        System.out.println("'"+ titulo+ "' foi deletada com sucesso");

    }
}
