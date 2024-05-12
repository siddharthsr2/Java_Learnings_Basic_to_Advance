import java.util.Scanner;
public class swapnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sweping number");
        System.out.println("Enter first number as a");
        int a = sc.nextInt();
        System.out.println("Enter Second number as b");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Sweeping done");
        System.out.println("value of a ="+a);
        System.out.println("value of b ="+b);

    }
}
