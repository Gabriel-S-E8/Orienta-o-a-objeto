package br.com.unifacef.exe04;
import javax.swing.JOptionPane;

public class Rio {
    // declaração de variáveis
    String nome;
    float nivel;
    boolean poluido;
    
    Rio()
    {
        
    }
    Rio(String nome, float Lv, boolean pd)
    {
        this.nome = nome;
        this.nivel = Lv;
        this.poluido = pd;
    }
    void chover(float x)
    {
        nivel += x;
    }
    void sunny(float x)
    {
        nivel -= x;
    }
    void limpar()
    {
        poluido = false;
    }
    void sujar()
    {
        poluido = true;
    }
    void mostrar()
    {
        JOptionPane.showMessageDialog(null,"\nNome do rio: " + nome + "\nNível: " + nivel + "\nPoluído: " + poluido + (this.poluido ? "Sim": "não"));
    }
}
