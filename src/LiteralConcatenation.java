import java.util.Scanner;
public class LiteralConcatenation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String m1 = scanner.nextLine();
        System.out.println("What's your last name? ");
        String m2 = scanner.nextLine();
        System.out.println("Your full name is " + m1 + " " + m2);
    }

}
