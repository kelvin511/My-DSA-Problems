import java.util.Scanner;

public class arrinput {
    public static void main(String[] args) {
        int marks [] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();


        
        System.out.println("Physics marks : "+marks[0]);
        System.out.println("Chemistry marks : "+marks[1]);
        System.out.println("Maths marks : "+marks[2]);

        double  sum = marks[0]+marks[1]+marks[2];
        double percent = (sum/300)*100;
        System.out.println("The percent is : "+percent);

    }
}
