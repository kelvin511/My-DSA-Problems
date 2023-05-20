public class PrefixSum {
    public static void calcPrefix(int number[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixArr[] = new int [number.length];

        prefixArr[0]=number[0];

        for(int i =1;i<prefixArr.length;i++){
            prefixArr[i]= prefixArr[i-1]-number[i];
        }
        for(int i =0;i<number.length;i++){
            int start = i;
            for(int j = i; j<number.length;j++){
                int end = j;
                currentSum = start==0? prefixArr[end]:   prefixArr[end]-prefixArr[start-1];
                if(maxSum<currentSum){
                    maxSum = currentSum;
                }
            }
        }

    }

    public static void main(String[] args) {
        int number[] = { 1, 3, 5, 7, 8 };
    }
}
