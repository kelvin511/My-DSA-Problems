public class linearsearch {
    public static int linersrc(int num[], int key){
     for (int i =0;i<=num.length-1;i++){
        if(num[i]==key){
            return i;
        }
    }
    return -1;
}

public static void main(String[] args) {
    int num []= {1,1,2,4,10,6,7,8};
    int key = 10;
   int search= linersrc(num, key);

   if(key==-1){
    System.out.println("Error");
   }
   else{
    System.out.println(search);
   }
}
}