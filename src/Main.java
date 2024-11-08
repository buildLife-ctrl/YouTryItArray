import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputAmount;
        String word;

        System.out.println("How many words will you put in?");
        inputAmount = scan.nextInt();

        String [] words = new String[inputAmount];
        System.out.println("Enter " + inputAmount + " word(s):");
        for (int i = 0; i < words.length; i++) {
            System.out.println(i);
            words[i] = scan.nextLine();
        }

        String shortestWord = words[0];
        for (int i = 1; i <= words.length; i++) {
            System.out.println("line 21 "+i);
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }
    }
}
