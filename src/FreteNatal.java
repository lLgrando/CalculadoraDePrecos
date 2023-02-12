
public class FreteNatal extends Frete {

    private Double desconto = 0.90;

    public FreteNatal(Double peso, Double tamanho, Double distancia, Double valorMercadoria) {
        super(peso, tamanho, distancia, valorMercadoria);
    }
    
    @Override
    public Double valorDoFrete() {
        if(!validadorPesoTamanho()) return null;
        Double valorDoFrete = super.valorDoFrete() - this.desconto;
        System.out.printf("Seu frete de Natal custará R$ %.2f \n", valorDoFrete);
        return valorDoFrete;
    }
}
