public class SwapArr {
    public static void arrSwap(int arr[]){
        int first = 0;
        int last = arr.length-1;

        while(first<last){
            int temp = arr[last];
            arr[last]= arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,3,5,7,8,9};
        arrSwap(arr);
        for(int i=0;i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
