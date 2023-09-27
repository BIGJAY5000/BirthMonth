import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birth = 0;
        System.out.println("Please enter your birth month:");
        birth = scan.nextInt();
        if (1 <= birth && birth <= 12) {
            System.out.println("Your birth month is: " + birth);
        }
        else if (1 > birth || birth > 12) {
            System.out.println("You have entered an invalid birth month");
            System.exit(0);
        }


    }
}