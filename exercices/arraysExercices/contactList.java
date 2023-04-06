import java.util.ArrayList;
import java.util.Scanner;

public class contactList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> number = new ArrayList<Integer>();
        String answer = "";

        while(answer == "Y"){
            System.out.println("Input your name: ");
            names.add(sc.next());
            System.out.println("Input the number of contact: ");
            number.add(sc.nextInt());
            System.out.println("Wish you insert a new contact? [Y/N]");

        }

    }
}
