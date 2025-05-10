/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author P
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double taxa;
    
    public AtualizadorDeContas(double taxa){
        this.taxa = taxa;
    }
    
    public void rodar(Conta c){
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.calculaTaixaDeJures(taxa);
        System.out.println("Saldo atual: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();
        System.out.println("----------------------");
    }
    
    public double getSaldoTotal(){
        return saldoTotal;
    }
}
