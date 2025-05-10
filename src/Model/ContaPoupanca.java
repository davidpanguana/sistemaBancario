/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author P
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int number, Cliente titular, double saldo) {
        super(number, titular, saldo);
    }

    public ContaPoupanca() {
    }

    @Override
    public void calculaTaixaDeJures(double taxa){
        super.calculaTaixaDeJures(taxa * 3);
    }
    
  
}
