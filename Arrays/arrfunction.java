public class arrfunction {
    public static void update(int marks []){
    for (int i=0;i<=marks.length-1;i++){
     marks[i]+= 1;
    }
    }
    public static void main(String[] args) {
        int marks [] = {45,67,89};
        update(marks);

        for (int j=0;j<=marks.length-1;j++){
            System.out.print(marks[j]+" ");
        }
        System.out.println();

    }
}
