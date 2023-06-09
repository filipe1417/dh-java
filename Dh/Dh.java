package Dh;

import java.util.Random;

public class Dh {
    private Random rand = new Random();
    private int numeroPrimoP = 23;
    private int numeroBaseG = 5;
    private int chavePrivada;
    private int chavePublica;

    private int chaveSecreta;

    public Dh(){
        this.chavePrivada = geraNumeroAleatorio();
        geraChavePublica();
    }

    // Gera chave publica (Z^X mod P)
    private void geraChavePublica(){
        this.chavePublica = (int) (Math.pow(numeroBaseG, chavePrivada) % numeroPrimoP);
    }

    // Numero aleatório (X) independente entre as partes
    private int geraNumeroAleatorio (){
        return rand.nextInt(numeroPrimoP);
    }

    // Calcula chave secreta com base na chave recebida durante a troca
    // Equivalente a (Y'^X mod P)
    public void calculaChaveSecreta(int chavePublicaDoOutroLado){
        int resultado = 1;
        for (int i = 0; i < chavePrivada; i++) {
            resultado = (resultado * chavePublicaDoOutroLado) % numeroPrimoP;
        }
        this.chaveSecreta = resultado;
    }

    public int getChavePublica(){
        return chavePublica;
    }

    public int getChaveSecreta(){
        return chaveSecreta;
    }

    @Override
    public String toString() {
        return "A chave secreta é: " + chaveSecreta;
    }
}
