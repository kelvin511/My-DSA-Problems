import java.util.Scanner;

public class AvgOfThree {
    public static float averageThree(float a, float b, float c){
return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        float f3 = sc.nextFloat();

          System.out.println(averageThree(f1, f2, f3)); 
    }
}
