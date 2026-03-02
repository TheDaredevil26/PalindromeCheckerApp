import java.util.Scanner;

public class PalindromeCheckerApp{
    public static boolean isPalindrome(String s1) {
        int i = 0;
        int j = s1.length() - 1;

        while (i < j) {
            if (s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        if (isPalindrome(s)) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }
        input.close();
    }
}