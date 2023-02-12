public class FreteNormal extends Frete{
    
    private Double desconto = 1.0;

    public FreteNormal(Double peso, Double tamanho, Double distancia, Double valorMercadoria) {
        super(peso, tamanho, distancia, valorMercadoria);
    }
    
    @Override
    public Double valorDoFrete() {
        if(!validadorPesoTamanho()) return null;
        Double valorDoFrete = super.valorDoFrete() - this.desconto;
        System.out.printf("Seu frete custará R$ %.2f \n", valorDoFrete);
        return valorDoFrete;
    }
}
