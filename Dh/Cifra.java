package Dh;

public class Cifra {
    private String valorDeEntrada;
    private String valorCifrado;

    public Cifra(String mensagem){
        this.valorDeEntrada = mensagem;
    }

    public String cifrar(int chave){
        String mensagem = "";
        int[] ascii = new int[this.valorDeEntrada.length()];

        for(int i = 0; i < this.valorDeEntrada.length(); i++){
            ascii[i] = ((int) valorDeEntrada.charAt(i)) + chave;
        }

        for(int a : ascii){
            mensagem += Character.toString((char) a);
        }
        this.valorCifrado = mensagem;
        return mensagem;
    }

    public String decifrar(int chave){
        String mensagem = "";
        int[] ascii = new int[this.valorCifrado.length()];

        for(int i = 0; i < this.valorCifrado.length(); i++){
            ascii[i] = ((int) valorCifrado.charAt(i)) - chave;
        }

        for(int a : ascii){
            mensagem += Character.toString((char) a);
        }

        return mensagem;
    }

}
