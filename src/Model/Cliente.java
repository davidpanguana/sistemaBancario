/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author P
 */
public class Cliente {
    private String nome;
    private String Sobrenome;
    private String bi;
    private int idade;
    
    public Cliente(String bi){
        this.bi = bi;
    }
    
    public void mudaBi(String bi){
        if(this.idade <= 60){
            validaBi(bi);
        }else{
            this.bi = bi;
        }
        
    }
    
    private void validaBi(String bit){
        //serie de regras...
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNomeCompleto(){
        return this.getNome() + " " + this.getSobrenome();
    }
    

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + this.getNomeCompleto() + '}';
    }
    
    
}
