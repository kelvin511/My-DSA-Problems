public class overloadbytype{
    public static int add(int a, int b){
        return a+b;

    }
     public static float add(float a , float b){
        return a+b;
     }

     public static void main(String[] args) {
        System.out.println(add(1.2f,1.2f));
     }
}