package business;

public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String modelo, String fabricante, int ano, int quantidadePortas) {
        super(modelo, fabricante, ano);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }


    @Override
    public void acelerar() {
        setVelocidadeAtual(getVelocidadeAtual() + 10);
    }

    @Override
    public String toString() {
        return super.toString() + " | Quantidade de portas: " + quantidadePortas;
    }
}