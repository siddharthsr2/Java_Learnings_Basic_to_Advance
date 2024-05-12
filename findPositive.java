import java.util.Scanner;

public class findPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here :");
        int a = sc.nextInt();

        if (a>0){
            System.out.println("a is positive");
        }
        else if (a==0){
            System.out.println("a is equal to zero");
        }
        else{
            System.out.println("a is negative");
        }

    }
}
