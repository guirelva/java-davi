package business;

public abstract class Veiculo {

    private String modelo;
    private String fabricante;
    private int ano;
    private int velocidadeAtual;

    private static final int VELOCIDADE_MINIMA = 0;
    private static final int VELOCIDADE_MAXIMA = 180;

    public Veiculo(String modelo, String fabricante, int ano) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.velocidadeAtual = VELOCIDADE_MINIMA;
    }

    public void acelerar() {
        setVelocidadeAtual(this.velocidadeAtual + 5);
    }

    public void desacelerar() {
        setVelocidadeAtual(this.velocidadeAtual - 5);
    }

    public void parar() {
        setVelocidadeAtual(0);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    protected void setVelocidadeAtual(int novaVelocidade) {
        if (novaVelocidade < VELOCIDADE_MINIMA) {
            novaVelocidade = VELOCIDADE_MINIMA;
        } else if (novaVelocidade > VELOCIDADE_MAXIMA) {
            novaVelocidade = VELOCIDADE_MAXIMA;
        }
        this.velocidadeAtual = novaVelocidade;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo
                + " | Fabricante: " + fabricante
                + " | Ano: " + ano
                + " | Velocidade atual: " + velocidadeAtual + " km/h";
    }
}