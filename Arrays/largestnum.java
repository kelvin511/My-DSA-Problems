import java.util.*;
public class largestnum {
    public static int calcLarge(int num[]){
        int largest = Integer.MIN_VALUE; //- infinity
        for (int i = 0 ; i<num.length;i++){
            if(largest<num[i]){
                largest = num[i];
            }
        }

        return largest;


    }

    public static void main(String[] args) {
        int num [] = {1,4,7,2,4};

        int largestNum = calcLarge(num);

        System.out.println("Largest Value is " + largestNum);
    }
}
