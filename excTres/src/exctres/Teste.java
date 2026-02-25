/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exctres;

/**
 *
 * @author CAROL
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa();
        t1.nome = "Estudar Java";
        t1.prazo = "30/03/2026";

        t1.mostrarStatus();
        t1.concluir();
        t1.mostrarStatus();
    }
    
}
