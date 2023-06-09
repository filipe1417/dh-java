package Dh;

public class Cifra {
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
