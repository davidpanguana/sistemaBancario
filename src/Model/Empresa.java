/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author P
 */
public class Empresa {
    
    private Funcionario[] empregados = new Funcionario[5];
    private String depatramento;
    
    

    public Funcionario getEmpregados(int posicao) {
        return empregados[posicao];
    }

    public void setEmpregados(Funcionario[] empregados) {
        this.empregados = empregados;
    }

    public String getDepatramento() {
        return depatramento;
    }

    public void setDepatramento(String depatramento) {
        this.depatramento = depatramento;
    }

}
