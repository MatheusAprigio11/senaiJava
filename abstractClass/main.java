package math;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        qualq q = new qualq();

        System.out.println("Escolha a operação matematica que deseja executar: ");
        System.out.println("1 | AREA DO TRIANGULO |");
        System.out.println("2 | AREA DO CIRCULO |");
        System.out.println("3 | CALCULAR IMC |");
        System.out.println("4 | CALCULAR VELOCIDADE MEDIA |");
        System.out.println("5 | CALCULAR DISTANCIA |");
        System.out.println("6 | CALCULAR FORÇA |");
        int op = sc.nextInt();

        switch (op){
            case 1:
                System.out.println("Digite a base do triangulo>> ");
                double base = sc.nextDouble();
                System.out.println("Digite a altura do triangulo>> ");
                double h = sc.nextDouble();
                q.areaTriang(base,h);
                System.out.println("A Area do triangulo eh: "+q.areaTriang(base,h));

            case 2:
                System.out.println("Digite o valor de PI>> ");
                double pi = sc.nextDouble();
                System.out.println("Digite o raio>> ");
                double r = sc.nextDouble();
                q.areaCirc(pi,r);
                System.out.println("A Area do circulo eh: "+q.areaCirc(pi,r));

            case 3:
                System.out.println("Digite seu peso>> ");
                double p = sc.nextDouble();

                System.out.println("Digite sua altura>> ");
                double alt = sc.nextDouble();
                q.imc(p, alt);
                System.out.println("Seu imc eh: "+q.imc(p, alt));

            case 4:
                System.out.println("Digite o deslocamento>> ");
                double desl = sc.nextDouble();

                System.out.println("Digite o tempo>> ");
                double tempo = sc.nextDouble();
                q.vm(desl, tempo);
                System.out.println("A velocidade media eh: "+q.vm(desl, tempo));

            case 5:
                System.out.println("Digite a velocidade>> ");
                double vel = sc.nextDouble();

                System.out.println("Digite o tempo>> ");
                double tempoD = sc.nextDouble();
                q.distan(vel, tempoD);
                System.out.println("A distancia eh: "+q.distan(vel, tempoD));

            case 6:
                System.out.println("Digite a massa>> ");
                double massa = sc.nextDouble();

                System.out.println("Digite a aceleração>> ");
                double acel = sc.nextDouble();
                q.forc(massa, acel);
                System.out.println("A velocidade media eh: "+q.vm(massa, acel));


        }
    }
}