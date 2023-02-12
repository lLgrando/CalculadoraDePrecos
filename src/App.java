public class App {
    public static void main(String[] args) throws Exception {
        
        FreteAniver aniversario = new FreteAniver(8.0, 10.0, 11.0, 100.0);
        FreteNatal natal = new FreteNatal(5.0, 22.0, 18.0, 190.0);
        FreteNormal normal = new FreteNormal(4.0, 4.0, 4.0, 40.0);
        FretePascoa pascoa = new FretePascoa(9.0, 15.0, 9.0, 90.0);

        //acima do peso máximo
        FreteNormal pesado = new FreteNormal(20.0, 10.0, 11.0, 90.0);

        //acima do tamanho
        FreteNatal tamanhoMaior = new FreteNatal(5.0, 55.0, 11.0, 90.0);


        aniversario.valorDoFrete();
        natal.valorDoFrete();
        normal.valorDoFrete();
        pascoa.valorDoFrete();

        pesado.valorDoFrete();
        tamanhoMaior.valorDoFrete();
    }
}
