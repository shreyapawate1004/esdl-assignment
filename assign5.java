import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;

        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double average = sum / 5.0;
        System.out.println("\nAverage Marks: " + average);

        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Amit");
        students.put(2, "Neha");
        students.put(3, "Ravi");
        students.put(4, "Sneha");
        students.put(5, "Karan");

        System.out.println("\nRoll Number : Name");
        System.out.println("------------------");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        sc.close();
    }
}
