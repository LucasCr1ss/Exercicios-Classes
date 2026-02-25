/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Locadora;

/**
 *
 * @author CAROL
 */
public class Veiculo {
    
    String modelo;
    double valorDiaria;
    int dias;
            
    public double calcularAluguel(int dias) {
        return dias * valorDiaria;
    }
}
