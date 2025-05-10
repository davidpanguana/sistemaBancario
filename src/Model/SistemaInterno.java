/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author P
 */
public class SistemaInterno {
    
    void login(Autenticavel a){
        int senha = 00000; //pega senha de algum logar ou de scanner de polegar
        boolean ok = a.autentica(senha);
    }
}
