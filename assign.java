import java.util.*;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNumber = sc.nextInt();

        int temp = originalNumber;
        int reversedNumber = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            temp = temp / 10;
        }

        if (originalNumber == reversedNumber)
            System.out.println(originalNumber + " is a Palindrome Number.");
        else
            System.out.println(originalNumber + " is NOT a Palindrome Number.");

        sc.close();
    }
}
