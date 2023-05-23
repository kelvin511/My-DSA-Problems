public class primenum {
    public static boolean isPrime(int a){

        //corner case for 2 
        
        if(a==2){
            return true;
        }

        
        //only for n>= 2 
        for (int i = 2; i<=Math.sqrt(a); i++){
            if(a%2==0){
                return false;
              
            }
            
        }

        return true;
    }

    public static void main(String[] args) {
       System.out.println(isPrime(3));
    }
}
