import java.util.*;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        System.out.print("Enter the pattern: ");
        String pattern = sc.nextLine();

        System.out.println("\nPattern found at indices:");
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            int j;
            for (j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            if (j == pattern.length())
                System.out.println(i);
        }
        sc.close();
    }
}
