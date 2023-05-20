public class Kadanes {
    public static void kadanesCalc(int number[]){
      int ms= Integer.MIN_VALUE;
      int cs = 0;
      int maxVal=Integer.MIN_VALUE;
      for(int i=0; i<number.length;i++){
        for(int k : number){
            if(k<0){
            maxVal= Math.max(maxVal, number[i]);
            }
            else{

            }
        }
           
      }
      System.out.println(ms+ " is max subarray sum  ");
      System.out.println(maxVal+ " is max sub array sum");

    }

    public static void main(String[] args) {
        int number []= {-2,-3,-4,-1,-2,-1,-5,-3};
        kadanesCalc(number);
    }
}
