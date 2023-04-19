import java.util.ArrayList;
import java.util.Scanner;

public class contactList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String answer = "";
        int opt = 0;
        String nameBye = "";
        String sName = "";

        System.out.println("Input your name: ");
        names.add(sc.nextLine().toUpperCase());

            do {

                System.out.println("Select: ");
                System.out.println("1 - Do you want to remove a contact?");
                System.out.println("2 - Do you want to search a contact?");
                System.out.println("3 - Do you want to add a new contact?");
                System.out.println("4 - Show the contacts");

                opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println(names);
                        System.out.println("Write the name that you want to remove");
                        sc.nextLine();
                        nameBye = sc.nextLine().toUpperCase();
                        names.remove(nameBye);
                        System.out.println("The name: "+nameBye+" has been removed.");
                        break;

                    case 2:
                        System.out.println("What name do you want to search?");
                        sName = sc.next().toUpperCase();
                        if (names.contains(sName)) {
                            System.out.println(sName + " is in the list");
                        } else {
                            System.out.println("The name "+sName+" is not in the list");
                        }
                        break;

                    case 3:
                        System.out.println("Insert the name of your new contact: ");
                        names.add(sc.next().toUpperCase());
                        break;

                    case 4:
                        System.out.println("Your contacts: "+ names);
                        break;

                    default:
                        System.out.println("Invalid code");
                }
                System.out.println("Wish you continue? [Y/N]");
                answer = sc.next().toUpperCase();
            }
            while (answer.equals("Y"));
        }
    }
