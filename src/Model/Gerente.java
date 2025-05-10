/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author P
 */
public class Gerente extends Funcionario implements Autenticavel{
    
    int numerodeFuncionariosGerenciados;
    int senha;
    
    @Override
    public boolean autentica(int senha){
        if(this.senha != senha){
            System.out.println("Acesso negado");
            return false;
          
        }else{
            /*
            pode faser outras possivens verificacoes,
            como saber se esse departamento do gerente
            tem acesso ao sistema interno
            */
            return true;
        }
    }
    
    @Override
     public double getBonificacao(){
        return this.salario * 0.1 + 1000;
    }


}
