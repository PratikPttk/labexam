import java.util.Scanner;

public class NumberSum{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
	System.out.println("Enter 2 Numbers to be added");
        System.out.println("Enter First Number");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        num2 = sc.nextInt();

        int result = num1+num2;
        System.out.printf("Sum of %d & %d is : %d",num1 , num2, result);
    }
}