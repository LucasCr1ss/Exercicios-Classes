/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exctres;

/**
 *
 * @author CAROL
 */
public class Tarefa {
    String nome;
    String descricao;
    String prazo;
    boolean concluida;

    public void concluir() {
        concluida = true;
    }

    public void mostrarStatus() {
        if(concluida) {
            System.out.println("Concluída");
        } else {
            System.out.println("Pendente");
        }
    }
}
