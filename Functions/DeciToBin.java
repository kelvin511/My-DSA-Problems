public class DeciToBin {
    public static void decToBin(int deci){
        int pow = 0;
        int bin = 0;
        while(deci>0){
             int rema = deci%2;
             bin = bin + rema* (int)(Math.pow(10, pow));

             pow++;
             deci = deci/2;

        }
        System.out.println(bin+ " is binary ");
    }

    public static void main(String[] args) {
        decToBin(25);
    }
}
