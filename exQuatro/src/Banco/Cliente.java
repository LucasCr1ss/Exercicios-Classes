/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author CAROL
 */
public class Cliente {
    
    String nome;
}

class Conta {
    
    Cliente cliente;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(Conta destino, double valor) {
        saldo -= valor;
        destino.saldo += valor;
    }
}