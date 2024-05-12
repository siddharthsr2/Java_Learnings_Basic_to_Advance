import java.util.Scanner;

class UserInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("Please enter yout first number");
        int firstnum = sc.nextInt();
        System.out.println("Enter the second number");
        int secnum = sc.nextInt();
        int sum = firstnum + secnum;
        System.out.println("the result of "+firstnum+" + "+secnum+ " = "+sum);
    }

}