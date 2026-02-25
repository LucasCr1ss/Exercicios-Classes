/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Circulo;

/**
 *
 * @author CAROL
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.raio = 5;

        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
        
    }
    
}
