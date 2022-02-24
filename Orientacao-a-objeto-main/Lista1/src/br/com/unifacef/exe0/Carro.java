package br.com.unifacef.exe0;

import javax.swing.JOptionPane;

public class Carro {
    // declaração das vriáveis
    String modelo;
    int ano;
    float velocidade;
    boolean motor; // true (ligado) ou false (desligado)
    
    // método construtor
    Carro(){
        
    }
    Carro(String modelo, int ano, float velocidade, boolean motor){
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.motor = motor;
    }
    // métodos
    void ligar(){
        motor = true;
    }
    void desligar(){
        motor = false;
        velocidade = 0;
    }
    void acelerar(float x){
        velocidade += x;
    }
    void frear(float x){
        velocidade -=x;
    }
    void mostrar(){
        JOptionPane.showMessageDialog(null, "Modelo: " + modelo + 
        " Ano: " + ano + " Vel " + velocidade +
        " Motor: " + motor);
    }
}
