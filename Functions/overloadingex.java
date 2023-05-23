public class overloadingex {
    //function to add two numbers
    public static int sum(int a, int b){
        return a+b;
    }

    //function to add three numbers 
    public static int sum(int a , int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,4,4));
    }
}
