package Dh;

public class main {
    public static void main(String[] args){
        Dh alice = new Dh();
        Dh bob = new Dh();

        Cifra cifra = new Cifra("Mensagem Secreta");

        alice.calculaChaveSecreta(bob.getChavePublica());
        bob.calculaChaveSecreta(alice.getChavePublica());

        System.out.println(cifra.cifrar(alice.getChaveSecreta()));
        System.out.println("Mensagem cifrada por Alice: " + cifra.cifrar(alice.getChaveSecreta()));

        System.out.println("Mensagem decifrada por Bob: " + cifra.decifrar(bob.getChaveSecreta()));

        System.out.println(alice);
        System.out.println(bob);
    }
}
