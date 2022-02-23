package br.com.unifacef.exe03;

import javax.swing.JOptionPane;

public class TestaProduto {
    public static void main(String[] args)
    {
        // criando o primeiro objeto
        int auxId = Integer.parseInt(JOptionPane.showInputDialog("Informe a identificação do produto: "));
        String auxDescricao = JOptionPane.showInputDialog("Informe a descrição: ");
        int auxQtde = Integer.parseInt(JOptionPane.showInputDialog("Infome a quantidade em estoque: "));
        float auxPreco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: "));
        
    Produto obj1 = new Produto(auxId, auxDescricao, auxQtde, auxPreco);
    
    //chamar os métodos
    obj1.toShow();
    
    obj1.toBuy(5);
    obj1.toShow();
    
    obj1.toSell(10);
    obj1.toShow();
    
    obj1.priceUp(20);
    obj1.toShow();
    
    obj1.priceDown(40);
    obj1.toShow();
    
    
    // criando o segundo objeto
    auxId = Integer.parseInt(JOptionPane.showInputDialog("Informe a identificação do produto: "));
    auxDescricao = JOptionPane.showInputDialog("Informe a descrição: ");
    auxQtde = Integer.parseInt(JOptionPane.showInputDialog("Infome a quantidade em estoque: "));
    auxPreco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: "));
        
    Produto obj2 = new Produto(auxId, auxDescricao, auxQtde, auxPreco);
    
    obj2.toShow();
            
    obj2.toBuy(10);
    obj2.toShow();
    
    obj2.toSell(20);
    obj2.toShow();
    
    obj2.priceUp(500);
    obj2.toShow();
    
    obj2.priceDown(70);
    obj2.toShow();
            
    }
}
