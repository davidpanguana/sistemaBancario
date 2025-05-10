/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author P
 */
public class  ContaCorrente extends Conta implements Tributavel {
    private double limite;

    public ContaCorrente(double limite, int number, Cliente titular, double saldo) {
        super(number, titular, saldo);
        this.limite = limite;
    }
    
    

    public ContaCorrente( ) {
    }
    
    
    
    @Override
    public void calculaTaixaDeJures(double taxa){
        super.calculaTaixaDeJures(taxa * 2);
    }
    
    @Override
    public void saca(double valor) {
       if (valor > this.saldo + this.limite){
           throw new IllegalArgumentException( "Saldo insuficiente");
       }else{
           super.saca(valor + 0.10);
       }
    }

    
    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + super.toString() + "limite=" + limite + '}';
    }
    
    
}
