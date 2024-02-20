public class Paridade {
    public static String verificaParidade(int numero){
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }
}