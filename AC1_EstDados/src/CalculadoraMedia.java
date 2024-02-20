public class CalculadoraMedia extends Paridade{
    public static double calculaMedia(double... valores) {
        double soma = 0.0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }
}
