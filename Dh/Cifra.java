package Dh;

public class Cifra {

    // Recebe mensagem e de acordo com a chave avança numeros do codigo ascii
    // Depois converte para string, gerando uma mensagem diferente (cifrada)
    public String cifrar(String valorDeEntrada, int chave){
        String mensagem = "";
        int[] ascii = new int[valorDeEntrada.length()];

        for(int i = 0; i < valorDeEntrada.length(); i++){
            ascii[i] = ((int) valorDeEntrada.charAt(i)) + chave;
        }

        for(int a : ascii){
            mensagem += Character.toString((char) a);
        }
        return mensagem;
    }

    // Recebe mensagem cifrada e a chava, que retrocede numeros do código ascii
    // Depois converte para string, decifrando a mensagem caso a chave seja a correta
    public String decifrar(String valorCifrado, int chave){
        String mensagem = "";
        int[] ascii = new int[valorCifrado.length()];

        for(int i = 0; i < valorCifrado.length(); i++){
            ascii[i] = ((int) valorCifrado.charAt(i)) - chave;
        }

        for(int a : ascii){
            mensagem += Character.toString((char) a);
        }

        return mensagem;
    }

}
