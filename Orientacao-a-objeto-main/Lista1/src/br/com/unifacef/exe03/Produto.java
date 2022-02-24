package br.com.unifacef.exe03;
import javax.swing.JOptionPane;

public class Produto {
    // declaração das variáveis
    int id;
    String descricao;
    int qt;
    float preco;
    
    //Construtores
    Produto()
    {
        
    }
    Produto(int id, String dc, int qt, float preco)
    {
        this.id = id;
        this.descricao = dc;
        this.qt = qt;
        this.preco = preco;
    }
    
    void toBuy(int x)
    {
        this.qt += x;
    }
    void toSell(int x)
    {
        this.qt -= x;
    }
    void priceUp(float x)
    {
        this.preco += x;
    }
    void priceDown(float x)
    {
        this.preco -= x;
    }
    void toShow()
    {
        JOptionPane.showMessageDialog(null,"\nIdentificação do produto: " + id + "\nDescrição: " + descricao + "\nQuantidade em estoque: " + qt + "\nPreço: R$" + preco);
    }
    
    
    
}
