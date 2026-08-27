package business;

public class Moto extends Veiculo {

    private boolean descansoAcionado;

    public Moto(String modelo, String fabricante, int ano) {
        super(modelo, fabricante, ano);
        this.descansoAcionado = true;
    }

    public boolean isDescansoAcionado() {
        return descansoAcionado;
    }

 

    @Override
    public void acelerar() {
        setVelocidadeAtual(getVelocidadeAtual() + 5);
        atualizarDescanso();
    }

    @Override
    public void desacelerar() {
        setVelocidadeAtual(getVelocidadeAtual() - 5);
        atualizarDescanso();
    }

    @Override
    public void parar() {
        setVelocidadeAtual(0);
        atualizarDescanso();
    }

    private void atualizarDescanso() {
        this.descansoAcionado = (getVelocidadeAtual() == 0);
    }

    @Override
    public String toString() {
        return super.toString() + " | Descanso acionado: " + (descansoAcionado ? "Sim" : "Não");
    }
}