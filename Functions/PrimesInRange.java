public class PrimesInRange {

    public static boolean isPrime(int a){

        //corner case for 2 
        
        if(a==2){
            return true;
        }

        
        //only for n>= 2 
        for (int i = 2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
              
            }
            
        }

        return true;
    }
    public static void primesRange(int n ){
       for(int i = 2; i<=n ; i++){
        if(isPrime(i)==true){
            System.out.print(i+" ");
        }
    }
    }

    public static void main(String[] args) {
        primesRange(100);
    }
}
