import java.util.*;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int n = s.length();
        String[] suffixes = new String[n];
        for (int i = 0; i < n; i++) {
            suffixes[i] = s.substring(i);
        }

        Arrays.sort(suffixes);

        System.out.println("\nSuffix Array:");
        for (String suf : suffixes) {
            System.out.println(suf);
        }
        sc.close();
    }
}
