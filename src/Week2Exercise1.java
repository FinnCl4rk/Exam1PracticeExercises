import java.util.Scanner;
public class Week2Exercise1 {
        public static void main(String[] args){
            int chicken = 3;
            double bacon = 5.5;
            String tractor = "None!";
            String summary = """
        \t Summary:
        \t\t Chicken: %d
        \t\t Bacon: %f
        \t\t Tractor: %s
        """;
            Scanner s = new Scanner(System.in);
            try {
                System.out.printf("Chicken: %d%n", chicken);
                String input = s.nextLine().trim();
                chicken = (input.isEmpty()) ? chicken : Integer.parseInt(input);
                /* These lines of code reference the integer value using %d and make a new
                line with %n saving it under the variable name chicken. The scanner then saves
                the input under the variable name input. The chicken = part is looking to see if the
                input is empty, while stating that if it is not empty then it will parse the input
                and save it as an integer back under variable name chicken
                 */
                System.out.printf("Bacon: %f%n", bacon);
                input = s.nextLine().trim();
                bacon = (input.isEmpty()) ? bacon : Double.parseDouble(input);
                /* Same thing here, code references the double value using %f and saves this value under
                bacon. The scanner saves the input under variable name input. The third line takes this
                input and looks to see if it is empty, and if not parses the info using parseDouble and
                saves this under input for bacon.
                 */
                System.out.printf("Tractor: %s%n", tractor);
                input = s.nextLine().trim();
                tractor = (input.isEmpty()) ? tractor : input;
                System.out.printf(summary, chicken, bacon, tractor);
            } catch (NumberFormatException nfe) {
                System.out.println("Error parsing number.");
            }

        }
    }