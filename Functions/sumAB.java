import java.util.Scanner;

public class sumAB {
    public static void calculateSum(int num1, int num2){ //num1 and num2 are parameters or formal parameters
       
        int sum = num1+ num2;
        System.out.println("The sum is : "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a,b); //a and b are arguments actual parameters
    }
}
