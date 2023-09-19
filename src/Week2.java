import java.util.Scanner;
public class Week2 {
    public static void main(String[] args){
        String a = "Next iteration";
        String b = "Next iteration";
        System.out.println("What will this be?" +  ((a == b) ? "True" : "False") ); // ? are they the same ?

        for (int i = 0; i < 10; i++) {
            System.out.println("Next iteration"); // If the literal String weren't a reference, this would instantiate the string every single loop.
        }

    }
    public static void practice(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a value ");
        int value = Integer.parseInt(scanner.nextLine().trim());
        /* The above line takes the value given by the user while looking for the enter keystroke
        given by nextLine(), but converts the String value into an int by scanning for the int value
         given by Integer.parseInt and saving it under variable name "value" */
        System.out.println("You wrote " + value);
    }
    public static void practice2(String[] args){
        Scanner s2 = new Scanner(System.in);
        System.out.println("Write a value: ");
        double value = Double.parseDouble(s2.nextLine().trim());
        /* The above line takes the string value taken in by s2.nextLine() and searches
        for the input, parses the info and saves the double number under "value"
         */
        System.out.println("You wrote: " + value);
    }


}
