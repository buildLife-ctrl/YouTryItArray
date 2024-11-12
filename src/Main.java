import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputAmount;

        //user input
        System.out.println("How many words will you put in?");
        inputAmount = scan.nextInt();
        scan.nextLine();

        //takes into account the words the user want us to print
        String [] words = new String[inputAmount];
        System.out.println("Enter " + inputAmount + " word(s):");
        for (int i = 0; i < words.length; i++) {
            words[i] = scan.nextLine();
        }

        //finds the shortest word in the inputted section
        String shortestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }
        System.out.println("The shortest word is: " + shortestWord);
    }
}
