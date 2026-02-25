/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banco;

/**
 *
 * @author CAROL
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.nome = "Lucas";

        Cliente c2 = new Cliente();
        c2.nome = "Maria";

        Conta conta1 = new Conta();
        conta1.cliente = c1;

        Conta conta2 = new Conta();
        conta2.cliente = c2;

        conta1.depositar(500);
        conta1.transferir(conta2, 200);

        System.out.println("Saldo Conta 1: " + conta1.saldo);
        System.out.println("Saldo Conta 2: " + conta2.saldo);
    }
}
    
