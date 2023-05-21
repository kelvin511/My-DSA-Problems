public class numbersn {
    public static void main(String[] args) {
        int n = 5;
        char outp= 'a';
        for (int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(outp+" ");
                outp++;
            }
            System.out.println();
        }
    }
}
