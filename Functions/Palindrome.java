import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n ){
        boolean b1 = false;
        int number = n;
        int reverse = 0;
        int pow = 0;
        while(n>0){
            int remainder = n%10;
            reverse =(int) (reverse*10 + remainder);
            n = n/10;
            pow++;

            
            
        }
        if (number==reverse){
            b1 = true;
        }
        else {
            b1 = false;
        }
        
        return b1;

        
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();

      
       System.out.println( isPalindrome(input));
    }
}
