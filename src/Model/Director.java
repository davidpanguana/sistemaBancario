/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author P
 */
public class Director extends Funcionario implements Autenticavel {

    @Override
    public double getBonificacao() {
        return 0;
    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
    
}
