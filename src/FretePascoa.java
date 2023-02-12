public class FretePascoa extends Frete {

    private Double desconto = 0.95;

    public FretePascoa(Double peso, Double tamanho, Double distancia, Double valorMercadoria) {
        super(peso, tamanho, distancia, valorMercadoria);
    }
    
    @Override
    public Double valorDoFrete() {
        if(!validadorPesoTamanho()) return null;
        Double valorDoFrete = super.valorDoFrete() - this.desconto;
        System.out.printf("Seu frete de Pascoa custará R$ %.2f \n", valorDoFrete);
        return valorDoFrete;
    }
}