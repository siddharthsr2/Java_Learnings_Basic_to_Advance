import java.util.Scanner;
public class bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Learn Bitwise operator");
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        //int result = a & b;
        //System.out.println(result);
        //int result = a | b;
        //System.out.println(result);
        int result = a ^ b;
        System.out.println(result);
    }
}
