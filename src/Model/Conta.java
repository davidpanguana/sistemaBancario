/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author P
 */
public abstract class Conta {
    private static int totalDeContas;
    protected int number;
    protected double saldo;
    protected Cliente titular;
    
    public Conta(int number, Cliente titular, double saldo){
        Objects.requireNonNull(this.number,"O numero nao pode se null");
        Objects.requireNonNull(this.titular,"O titular nao pode se null");
        Conta.totalDeContas++;
        this.number = number;
        this.titular = titular;
        this.saldo = saldo;
    } 
    public Conta(){
        
    }
    
    public void saca(double valor){
        if(valor != 0 && valor <= this.saldo){
            throw new IllegalArgumentException();
        }else{
            this.saldo += valor;
        }
    }
    
    public double deposita(double quantidade){
        if(quantidade > 0){
            return this.saldo = this.saldo + quantidade;
        }else {
            System.out.println("valor invalido");
            return 0;
        }
    }
    
     public void transfere(double  valor, Conta destino){
            this.saca(valor);
            destino.deposita(valor);

    }
    
    public void calculaTaixaDeJures(double taxa){
        this.saldo += this.saldo * taxa;
        
    }
    
    @Override
    public boolean equals(Object object){
        if(object == null) return false;
        if(this == object) return true;
        if(this.getClass() != object.getClass()) return false;
       Conta conta = (Conta) object;
       return this.number != 0 && Integer.valueOf(this.number).equals(conta.number);
    }
    
    @Override
    public int hashCode(){
        return this.number == 0 ? 0 : Integer.valueOf(this.number).hashCode();
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    
    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }

    @Override
    public String toString() {
        return "Conta{" + "number=" + this.number + ", saldo=" + this.saldo + ", titular=" + this.titular.toString() + '}';
    }
    
    
}
