//BMexercicio07
public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("Samsung", 1000.0);
        Computador computador = new Computador("Dell", 2000.0, 8, 512);

        System.out.println("Equipamento:");
        System.out.println("Marca: " + equipamento.getMarca());
        System.out.println("Preço: " + equipamento.getPreco());

        System.out.println("Computador:");
        System.out.println("Marca: " + computador.getMarca());
        System.out.println("Preço: " + computador.getPreco());
        System.out.println("Memória RAM: " + computador.getMemoriaRam());
        System.out.println("Capacidade do HD: " + computador.getCapacidadeHD());
    }
}
