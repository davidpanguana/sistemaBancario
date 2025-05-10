/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import Model.AtualizadorDeContas;
import Model.Banco;
import Model.Cliente;
import Model.ComparadorDeContas;
import Model.Conta;
import Model.Funcionario;
import Model.Gerente;
import Model.Conta;
import Model.ContaCorrente;
import Model.ContaPoupanca;
import Model.Tributavel;

/**
 *
 * @author P
 */
public class programa {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca();
        AtualizadorDeContas adc = new AtualizadorDeContas(0.010);
        ComparadorDeContas com = new ComparadorDeContas();
        Cliente cliente = new Cliente("134432");
        cliente.setNome("David");
        cliente.setSobrenome("Panguana");
        cc.setNumber(1223);
        cp.setNumber(1223);
        cp2.setNumber(1423);
        
        com.comparaContas(cp2, cp);
        System.out.println(cp.getNumber());
        System.out.println(cc.getNumber());
        
//        cc.deposita(1000);
//        cc.setTitular(cliente);
//        cc.deposita(1000);
//        cp.deposita(1000);
//        
//        adc.rodar(cc);
//        adc.rodar(cp);
//System.out.println();
//System.out.println(cc);
        
        
        

//        try{
//            
//        cc.transfere(1000, cp);
//        }catch(IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//        
//        System.out.println(cc.getSaldo());
//        System.out.println(cp.getSaldo());

// testando polimorfismo
//        Tributavel t = cc;
//        System.out.println(t.calculaTributos());
    }
}
