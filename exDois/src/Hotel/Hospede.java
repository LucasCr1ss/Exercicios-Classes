/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author CAROL
 */
public class Hospede {
    String nome;
    int dias;
    double valorDiaria;

    public double calcularTotal() {
        return dias * valorDiaria;
    }
}
