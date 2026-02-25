/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Locadora;

/**
 *
 * @author CAROL
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.modelo = "Onix";
        v1.valorDiaria = 150;

        System.out.println("Total aluguel: R$ " + v1.calcularAluguel(4));
    }
    
}
