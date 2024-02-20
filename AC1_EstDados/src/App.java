public class App extends CalculadoraMedia{
    public static void main(String[] args) throws Exception {
        double media = CalculadoraMedia.calculaMedia(5.5, 6.0, 5.3, 4.3);
        System.out.println("A média é" + media);
    }

    int numero1 = 7;
    int numero2 = 12;

    System.out.println(numero1 + "é" + Paridade.verificaParidade(numero1));
    System.out.println(numero2 + "é" + Paridade.verificaParidade(numero2));
}
