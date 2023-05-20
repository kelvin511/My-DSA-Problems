public class SubArraySum {
    public static void calcSubArrSum(int num []){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE ;
      for(int i = 0; i<num.length;i++){
        int start = i;
        for(int j =i;j<num.length;j++){
            int end = j;
            currentsum = 0;
            for(int k = start;k<=end;k++){
               //subarray sum
               currentsum += num[k];
                
            }
            System.out.println(currentsum);
            if(maxsum<currentsum){
                maxsum = currentsum;
            }
        }
     
      }
      System.out.println("max sum is : "+ maxsum);

      
    }

    public static void main(String[] args) {
        int num [] = { 2,3,4,5,6,7};
        calcSubArrSum(num);
    }
}
