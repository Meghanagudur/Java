package vanadana;
public class Alphabets {
	    public static void main(String[] args) {
	        String input = "The quick brown fox jumps over the lazy dog";
	        boolean isPangram = checkIfPangram(input);
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }
	    public static boolean checkIfPangram(String input) {
	        boolean[] alphabetPresent = new boolean[26];
	        int lettersFound = 0;
	        for (char ch : input.toLowerCase().toCharArray()) {
	            if (ch >= 'a' && ch <= 'z' && !alphabetPresent[ch - 'a']) {
	                alphabetPresent[ch - 'a'] = true;
	                lettersFound++;
	            }
	        }
	        return lettersFound == 26;
	    }
}
