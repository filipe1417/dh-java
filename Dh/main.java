package Dh;

public class main {
    public static void main(String[] args){
        Dh alice = new Dh();
        Dh bob = new Dh();

        Cifra cifra = new Cifra();

        String mensagem = "";

        alice.calculaChaveSecreta(bob.getChavePublica());
        bob.calculaChaveSecreta(alice.getChavePublica());

        mensagem  = cifra.cifrar("Mensagem Secreta", alice.getChaveSecreta());
        System.out.println("Mensagem cifrada por Alice: " + mensagem);

        System.out.println("Mensagem decifrada por Bob: " + cifra.decifrar(mensagem, bob.getChaveSecreta()));

        System.out.println(alice);
        System.out.println(bob);
    }
}
