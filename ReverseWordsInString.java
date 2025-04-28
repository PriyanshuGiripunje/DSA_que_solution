import java.util.Scanner;
public class ReverseWordsInString {
    public static String reverseWords(String sentence) {
        // Write your code here
        String [] ans = sentence.split("\\s+");
        String answer = "";
        for(int i = ans.length-1;i>=0 ;i--){
            answer = answer.concat(ans[i]);
            if(i == 0)
                break;
            answer = answer.concat(" ");
        }
        return answer;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.println("Enter a sentence:");

        // Read the full line (sentence) from the user
        String sentence1 = scanner.nextLine();

        String answer = reverseWords(sentence1);
        // Output the sentence
        System.out.println("You entered: " + answer);

        // Close the scanner (good practice)
        scanner.close();
    }

}
