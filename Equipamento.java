//BMExercicio04
public class Equipamento {
    private String marca;
    private double preco;

    public Equipamento(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    // Métodos de acesso e modificação
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
