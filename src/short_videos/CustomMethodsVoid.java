package short_videos;

public class CustomMethodsVoid {

    public static void sayHello(){
        System.out.println("Hello");
    }
    public static void printOneToTen(){
        for (int i=1; i<=10; i++){
            System.out.print(i+" ");
        }
    }

    public static void sayHello2(int num){
        for (int i=0; i<num; i++){
            System.out.println("Hello");
        }
    }
    public static void printOneToNum(int num){
        for (int i=1; i<=num; i++){
            System.out.println(i);
        }
    }

    public static void showSum(double num1, double num2){
        double sum = num1+ num2;
        System.out.println("Sum of numbers: "+ sum);
    }




    public static void main(String[] args) {
        // Methods are used to perform certain actions
        // A method is a block of code which only runs when it is called.
        // A method must be declared within a class


        sayHello2(5);
        System.out.println("=================");
        printOneToNum(10);
        System.out.println("===================");
        showSum(900,10);


    }
}
