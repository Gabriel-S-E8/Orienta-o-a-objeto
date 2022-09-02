package br.com.unifacef.ex1;
public class Naomotorizado extends Veiculo{
    private String meiodeLocomocao;

    public Naomotorizado() {
    }

    public Naomotorizado(String meiodeLocomocao, String nome, String modelo) {
        super(nome, modelo);
        this.meiodeLocomocao = meiodeLocomocao;
    }

    public String getMeiodeLocomocao() {
        return meiodeLocomocao;
    }

    public void setMeiodeLocomocao(String meiodeLocomocao) {
        this.meiodeLocomocao = meiodeLocomocao;
    }

    @Override
    public String toString() {
        return "Naomotorizado{" + "meiodeLocomocao=" + meiodeLocomocao + '}';
    }

    @Override
    public String comoLocomovo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
