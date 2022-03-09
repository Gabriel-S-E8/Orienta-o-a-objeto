package br.com.unifacef.ex0;
public class Teste {

    public static void main(String[] args) {
        // Variaveis encapsuladas
        
        Niver obj1 = new Niver();
        obj1.setDia(9);
        obj1.setMes("Outubro");
        
        Niver obj2 = new Niver();
        obj2.setDia(51);
        obj2.setMes("outono");
        
        System.out.println("Dia: " + obj1.getDia() + "\nmés: " + obj1.getMes());
        System.out.println("Dia: " + obj2.getDia() + "\nmés: " + obj2.getMes());
    }
    
    Niver obj3 = new Niver(-7, "inverno");
    
}
