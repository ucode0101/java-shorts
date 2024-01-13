package short_videos;

public class CustomMethodsReturn {

    public static void sum(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static int sum2(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public static void main(String[] args) {

        sum(5,5);

        int total = sum2(5,5);
        System.out.println(total);
        System.out.println(sum2(10,10));


    }
}
