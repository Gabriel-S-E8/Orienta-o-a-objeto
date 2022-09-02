package br.com.unifacef.ex1;
public class Motorizado extends Veiculo{
    private float potencia; 
    private float String;

    public Motorizado() {
    }

    public Motorizado(float potencia, float String, String nome, String modelo) {
        this.potencia = potencia;
        this.String = String;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getString() {
        return String;
    }

    public void setString(float String) {
        this.String = String;
    }

    @Override
    public String toString() {
        return "Motorizado{" + "potencia=" + potencia + ", String=" + String + '}';
    }

    @Override
    public String comoLocomovo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
