/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unifacef.exe01;

import javax.swing.JOptionPane;

/**
 *
 * @author abarb
 */
public class Aluno 
{
    // declaração das variáveis
    int numeroAluno, idade;
    String nome;
    float prova1, prova2;

    
    //método construtor Sem parametros
    
    Aluno()
    {
        
    }
    //Metodo construtor com parametros
    Aluno(int numeroAluno, String nome, int idade, float p1, float p2)
    {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.prova1 = p1;
        this.prova2 = p2;              
    }
    
    float notaFinal()
    {
        return (this.prova1 + this.prova2) / 2;
    }
    void dadosAluno()
    {
        JOptionPane.showMessageDialog(null,"\nNúmero do aluno " + this.numeroAluno + "\nNome: " + this.nome + "\nIdade: " + this.idade);
    }
    /*
    void passou()
    {
        if (((prova1 + prova2)/2)>= 6)
        {
            JOptionPane.showMessageDialog(null,"Você passou! :D");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Você não passou! :c");
        }
    }
    */
    String passou(){
        return (this.notaFinal() >= 6)?"Aprovado" : "Reprovado";
    }

    
            
}
