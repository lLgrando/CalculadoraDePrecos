abstract class Frete implements IFrete {

    private Double peso;
    private Double tamanho;
    private Double distancia;
    private Double desconto = 0.0;

    protected Frete(Double peso, Double tamanho, Double distancia, Double valorMercadoria) {
        this.peso = peso;
        this.tamanho = tamanho;
        this.distancia = distancia;
    }

    @Override
    public Boolean tamanhoMaximo() {
        if (tamanho > 40) {
            System.out.println("Tamanho máximo de 40cm.");
            return false;
        }
        return true;
    }

    @Override
    public Boolean pesoMaximo() {
        if (peso > 10.0) {
            System.out.println("Peso máximo é 10kg.");
            return false;
        }
        return true;
    }

    protected Boolean validadorPesoTamanho() {
        if (pesoMaximo() && tamanhoMaximo()) {
            return true;
        }
        return false;
    }

    @Override
    public Double precoPelaDistancia() {
        return distancia * 1.10;
    }

    @Override
    public Double precoPeloPeso() {
        return peso * 0.30;
    }

    public Double valorDoFrete() {
        return precoPelaDistancia() + precoPeloPeso() - desconto;
    }

}
