package Dh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Dh alice = new Dh();
        Dh bob = new Dh();

        Cifra cifra = new Cifra();

        System.out.println("PASSO 4: Calcula chave publica (Z^X mod P) --------");
        passo4(alice.getChavePublica(), bob.getChavePublica());

        System.out.println("PASSO 5: Troca de chaves -------------------------");

        alice.calculaChaveSecreta(bob.getChavePublica());
        bob.calculaChaveSecreta(alice.getChavePublica());

        passo5(); // Visual

        System.out.println("PASSO 6: Calcular a chave secreta (Y’^X mod P) ----");
        passo6(alice, bob);
        System.out.println("FIM DA TROCA DE CHAVES ----------------------------");
        Thread.sleep(10000);

        // Teste com mensagem cifrada
        System.out.println("");
        System.out.println("Após calcular a chave é possivel decifrar as mensagens.\nExemplo a seguir:");
        System.out.println("");

        System.out.print("Alice, informe uma mensagem: ");

        // Recebimento de mensagem
        String mensagem = sc.nextLine();

        // Cifra de acordo com a chave secreta
        mensagem  = cifra.cifrar(mensagem, alice.getChaveSecreta());

        // Visual
        gMensagem(mensagem);

        // Decifra de acordo com a chave secreta
        System.out.println("Mensagem decifrada por Bob: " + cifra.decifrar(mensagem, bob.getChaveSecreta()));
    }

    private static void gMensagem(String mensagem) throws InterruptedException{
        System.out.println("");

        System.out.println("Mensagem enviada por Alice: " + mensagem);

        System.out.println("Alice:                    |                    Bob:");
        System.out.println(mensagem + "         ->         " + mensagem);
        System.out.println("");

        Thread.sleep(5000);
    }

    private static void passo4(int chaveAlice, int chaveBob) throws InterruptedException  {
        System.out.println("");

        System.out.println("Alice:                    |                    Bob:");
        System.out.println("Chave Publica: "+chaveAlice+"                  " + "Chave Publica: "+chaveBob);
        System.out.println("");

        Thread.sleep(10000);
    }

    private static void passo5() throws InterruptedException  {
        // Gráfico
        System.out.println("");

        System.out.println("                   TROCA DE CHAVES                ");
        System.out.println("Alice                    <-                    Bob");
        System.out.println("Alice                    ->                    Bob");
        System.out.println("");
        Thread.sleep(10000);
    }

    private static void passo6(Dh alice, Dh bob) throws InterruptedException  {
        System.out.println("Alice:                    |                    Bob:");
        System.out.println(alice+"          "+bob);
        System.out.println("");
    }
}

