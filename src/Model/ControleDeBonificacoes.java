/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 
package Model;

/**
 *
 * @author P
 */
public class ControleDeBonificacoes {
    
    private double totalDeBonificacoes = 0;
    
    public void registra(Funcionario f){
        System.out.println("Adicionando bonidicacao ao funcionario: " + f);
        this.totalDeBonificacoes += f.getBonificacao();
    }
    
    public double getTotaldebonificacoes(){
        return this.totalDeBonificacoes;
    }
    
}
