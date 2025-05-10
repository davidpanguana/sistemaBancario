/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author P
 */
public class Banco {
    List<Conta> contas = new ArrayList<>();
    
    public void adiciona(Conta c){
        contas.add(c);    
    }
    
    public Conta pegaConta(int i){
        return contas.get(i);
    }
    
    public int pegaTotalDeContas(){
        return contas.size();
    }
}
