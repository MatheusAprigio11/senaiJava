import java.util.Scanner;
import java.util.Random;
public class MATRIX {
    public static void main(String[] args) {

        Scanner vt = new Scanner(System.in);
        Random rand = new Random();

        int coluna = rand.nextInt(0, 5);
        int linha = rand.nextInt(0, 5);
        int tentativa = 0;
        String[][] mat = new String[5][5];
        

        while (tentativa < 10) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Digite a posição da linha: ");
            int chuteL = vt.nextInt();
            System.out.println("Digite a posição da coluna: ");
            int chuteC = vt.nextInt();
            tentativa += 1;
            System.out.println(mat[linha][coluna]);
            if ((chuteL == linha) && (chuteC == coluna)) {
                System.out.println("PARABENS, VOCÊ ADIVINHOU, O TESOURO ESTAVA EM " + mat[linha][coluna]);
                break;
            } else if (chuteC == coluna) {
                System.out.println("Voce acertou a coluna do tesouro.");
                mat[i][j] = mat[linha][coluna] = "X";
                System.out.println(mat[linha][coluna]);
            } else if (chuteL == linha) {
                System.out.println("Voce acertou a linha! ");

            } else if ((chuteL != linha) && (chuteC != coluna)) {
                System.out.println("n acertou" + mat[linha][coluna]);

            }
        }
    }
}
