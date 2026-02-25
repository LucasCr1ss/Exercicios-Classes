/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hotel;

/**
 *
 * @author CAROL
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hospede h1 = new Hospede();
        h1.nome = "Carlos";
        h1.dias = 3;
        h1.valorDiaria = 200;

        System.out.println("Total da estadia: R$ " + h1.calcularTotal());
    }
    
}
