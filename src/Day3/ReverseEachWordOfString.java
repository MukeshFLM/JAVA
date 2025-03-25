package Day3;

public class ReverseEachWordOfString {

    public static void main(String[] args) {
        String input = "welcome to java";
        String[] words = input.split(" ");
        String revnames = "";
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String rev = "";
            
            // Reverse each word using the correct index (j)
            for (int j = word.length() - 1; j >= 0; j--) {
                rev = rev + word.charAt(j); // Add the character to the reversed word
            }
            
            // Append the reversed word with a space in between
            revnames = revnames + rev + " ";
        }
        
        // Trim the trailing space and print the result
        System.out.println(revnames.trim());
    }
}