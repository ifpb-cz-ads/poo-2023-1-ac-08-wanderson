//BMExercicio05
public class Computador extends Equipamento {
    private int memoriaRam;
    private int capacidadeHD;

    public Computador(String marca, double preco, int memoriaRam, int capacidadeHD) {
        super(marca, preco);
        this.memoriaRam = memoriaRam;
        this.capacidadeHD = capacidadeHD;
    }

    //BMExercicio06 Métodos de acesso e modificação
    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getCapacidadeHD() {
        return capacidadeHD;
    }

    public void setCapacidadeHD(int capacidadeHD) {
        this.capacidadeHD = capacidadeHD;
    }
}
