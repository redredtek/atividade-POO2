/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciosalario;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Funciosalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario paulinho = new Funcionario();
        Scanner ler = new Scanner(System.in);
        System.out.println("qual o nome do funcionario");
        paulinho.setNome(ler.nextLine());
        System.out.println("qual o salario atual");
        paulinho.setSalario(ler.nextDouble());
        System.out.println("qual o reajuste(1,%)");
        paulinho.setReajuste(ler.nextDouble());
        paulinho.show();
        paulinho.calcSal();
        paulinho.show();
    }
    
}
