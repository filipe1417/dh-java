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
        System.out.println("Chave privada: " + chavePrivada);
        geraChavePublica();
    }

    private void geraChavePublica(){
        this.chavePublica = (int) (Math.pow(numeroBaseG, chavePrivada) % numeroPrimoP);
        System.out.println("Chave publica: " + chavePublica);
    }
    private int geraNumeroAleatorio (){
        return rand.nextInt(numeroPrimoP);
    }

    public void calculaChaveSecreta(int chavePublicaDoOutroLado){
        this.chaveSecreta = (int) (Math.pow(chavePublicaDoOutroLado, chavePrivada) % numeroPrimoP);
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
