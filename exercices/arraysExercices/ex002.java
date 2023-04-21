package exercices;
import java.util.HashSet;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        HashSet<String> followers = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int opt;
        String newUser = "";
        String userBye = "";
        String sUser = "";
        String answer = "";

        do {

            System.out.println("Select>> ");
            System.out.println("1 - Do you want to add new followers?");
            System.out.println("2 - Do you want to remove a follower?");
            System.out.println("3 - Do you want to search a follow?");
            System.out.println("4 - Show the followers");
            System.out.println("5 - EXIT");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Input the user @>>");
                    sc.nextLine();
                    newUser = sc.nextLine().toLowerCase();
                    followers.add(newUser);
                    break;

                case 2:
                    System.out.println(followers);
                    System.out.println("Write the @user that you want to remove>> ");
                    userBye = sc.next().toLowerCase();
                        if (followers.contains(userBye)) {
                            followers.remove(userBye);
                            System.out.println("The name: " + userBye + " has been removed.");
                        } else {
                            System.out.println("This user is not your follower.");
                        }
                    break;

                case 3:
                    System.out.println("What name do you want to search?");
                    sUser = sc.next().toLowerCase();
                    if (followers.contains(sUser)) {
                        System.out.println(sUser + " is in the list");
                    } else {
                        System.out.println("The name "+sUser+" is not in the list");
                    }
                    break;

                case 4:
                    System.out.println("Your followers: "+ followers);
                    break;

                case 5:
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
