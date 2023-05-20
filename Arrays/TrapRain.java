public class TrapRain {     
    public static int trappedRain(int bars[]){
        // calculate leftmax boudary
        int n = bars.length;
        int leftMax [] = new int [n];
        leftMax[0] = bars[0];
        for(int i = 1 ; i<n;i++){
            leftMax[i] = Math.max(bars[i], leftMax[i-1]);
        }
        //calculate rightmax boudary
        int rightMax [] = new int [n];
        rightMax[n-1] = bars[n-1];
        for(int i=n-2; i>=0;i--){
            rightMax[i] = Math.max(bars[i],rightMax[i+1]);
        }


        int trappedWater =0;

        //loop
        for(int i = 0; i<n;i++){
        //water level = min(leftmax,rightmax)
           int waterLevel = Math.min(leftMax[i], rightMax[i]);
        
        //traped water = water level - bars[i]
        trappedWater += waterLevel - bars[i];

        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int bars[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRain(bars));
    }
}
