package br.com.unifacef.ex0;
public class Testa {
    
    public static void exemploPolimorfismo(Funcionario funcionario){
        System.out.println(funcionario.toString()); //funcionario é polimorfico
    }
    public static void main(String[] args) {
        Assistente as1 = new Assistente(500, " Fulano ", " 12345 ", " responto ", 2000);
        Gerente g1 = new Gerente(30, " Beltrano ", " 4545-34 ", " Comecial ", 4000);
        Diretor d1 = new Diretor(50000, " Onix ", " Ciclano ", " 789-12 ", " Venda ",6000);
        
        exemploPolimorfismo(as1); //Funcionario funcionario = as1
        exemploPolimorfismo(g1); //Funcionario funcionario = g1
        exemploPolimorfismo(d1); //Funcionario funcionario = d1
    }
    
}
