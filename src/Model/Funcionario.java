/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author P
 */
public abstract class Funcionario {
    
    protected static int identificador = 1;
    protected String nome;
    protected String departamento;
    protected double salario;
    protected String datantrada;
    protected String bi;
    protected boolean estaNaEmpresa;

    public Funcionario(String nome, String departamento, double salario, String datantrada, String bi, boolean estaNaEmpresa) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.datantrada = datantrada;
        this.bi = bi;
        this.estaNaEmpresa = estaNaEmpresa;
        Funcionario.identificador +=1;
    }

    public Funcionario() {
    }
    
    
    
    public abstract double getBonificacao();
    
    public void demite(){
        
    }
    
    public double calculaGanhoAnual(){
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDatantrada() {
        return datantrada;
    }

    public void setDatantrada(String datantrada) {
        this.datantrada = datantrada;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }
    
    public static int identificador(){
        return Funcionario.identificador;
    }
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", departamento=" + departamento + ", salario=" + salario + ", datantrada=" + datantrada + ", bi=" + bi + ", estaNaEmpresa=" + estaNaEmpresa + '}';
    }
}
