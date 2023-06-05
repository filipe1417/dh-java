package Dh;

public class main {
    public static void main(String[] args){
        Dh alice = new Dh();
        Dh bob = new Dh();

        alice.calculaChaveSecreta(bob.getChavePublica());
        bob.calculaChaveSecreta(alice.getChavePublica());
        System.out.println(alice);
        System.out.println(bob);
    }
}
