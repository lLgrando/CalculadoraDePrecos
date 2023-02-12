public class FreteAniver extends Frete {

    private Double desconto = 0.850;

    public FreteAniver(Double peso, Double tamanho, Double distancia, Double valorMercadoria) {
        super(peso, tamanho, distancia, valorMercadoria);
    }
    
    @Override
    public Double valorDoFrete() {
        if(!validadorPesoTamanho()) return null;
        Double valorDoFrete = super.valorDoFrete() - this.desconto;
        System.out.printf("Seu frete de Aniver custará R$ %.2f \n", valorDoFrete);
        return valorDoFrete;
    }
}
