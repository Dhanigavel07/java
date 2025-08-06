import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student name: ");
        String name = sc.nextLine();  // Use String for names

        System.out.print("M1: ");
        int M1 = sc.nextInt();
        System.out.print("M2: ");
        int M2 = sc.nextInt();
        System.out.print("M3: ");
        int M3 = sc.nextInt();
        System.out.print("M4: ");
        int M4 = sc.nextInt();
        System.out.print("M5: ");
        int M5 = sc.nextInt();

        System.out.println("Hi, " + name + "!");

        int total = M1 + M2 + M3 + M4 + M5;
        System.out.println("Your Total: " + total);

        double average = total / 5.0;
        System.out.println("Average: " + average);

        sc.close();
    }
}
