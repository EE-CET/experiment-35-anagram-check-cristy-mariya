import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // Convert to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // If lengths differ → not anagram
        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        // Convert to char arrays
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}
