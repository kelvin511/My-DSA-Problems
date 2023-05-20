public class ArrPairs {
    public static void clacPairs(int arr[]){
        int tp = 0;
    for(int i = 0; i<=arr.length-1;i++){ 
        
        int num = arr[i];
        for(int j = i+1; j<=arr.length-1;j++){
         System.out.print("("+num+","+ arr[j]+")");
         tp++;
        }
        System.out.println();
        
    }
    System.out.print(tp + " is total pairs ");
      

    }
    public static void main(String[] args) {
        int arr [] ={2,4,6,8,10};

        clacPairs(arr);

    }
}
