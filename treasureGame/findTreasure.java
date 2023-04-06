import java.util.Scanner;
import java.util.Random;

public class findTreasure {
    static String[][] mat = new String[6][6];
    static void mostrarMatriz(){
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner vt = new Scanner(System.in);
        Random rand = new Random();

        int coluna = rand.nextInt(1, 6);
        int linha = rand.nextInt(1, 6);
        int tentativa = 0;


        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                mat[i][j] = "_";
            }
        }
        System.out.println("\nBem vindo ao jogo CAÇA TESOURO!");
        System.out.println("Cuidado, você só possui três tentativas para achar o tesouro.....\n");
        mostrarMatriz();
        while (tentativa < 3) {
            System.out.println("\nDigite a posição da linha: ");
            int chuteL = vt.nextInt();
            System.out.println("Digite a posição da coluna: ");
            int chuteC = vt.nextInt();
            tentativa += 1;
            if ((chuteL == linha) && (chuteC == coluna)) {
                System.out.println("PARABENS VOCÊ ADIVINHOU!!!, O TESOURO ESTAVA NA LINHA " +  linha + " E COLUNA " + coluna);
                mat[linha][coluna] = "*";
                mostrarMatriz();
                break;

            } else if (chuteC == coluna) {
                System.out.println("Você acertou a coluna do tesouro!");
            } else if (chuteL == linha) {
                System.out.println("Você acertou a linha do tesouro!");
            } else {
                System.out.println("Poxa! Você não acertou a linha e nem a coluna");
            }
            mat[chuteL][chuteC] = "X";
            mostrarMatriz();
        }
    }
}
