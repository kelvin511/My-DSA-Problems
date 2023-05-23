public class binomialfact {
    public static int factorial (int a){
        int fact= 1;
        for (int i = 1; i<=a;i++){
            fact= i*fact;

        }
        return fact;
    }

    public static int binomialCoe(int n ,int r){
        int factN= factorial(n);
        int factR = factorial(r);
        int factNR= factorial(n-r);

        int ans = factN/(factR*factNR);

        return ans;
    }
     public static void main(String[] args) {
        
        System.out.println(binomialCoe(10, 2));
     }
}
