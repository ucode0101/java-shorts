package short_videos;

public class MethodOverloading {

    public static int sum(int n1, int n2){
        return  n1 + n2;
    }
    public static  int sum(int n1, int n2, int n3){
        return  n1 + n2+ n3;
    }
    public static int sum(int n1, int n2, int n3, int n4){
        return n1+n2+n3+n4;
    }

    public static void main(String[] args) {
        // Method over loading means we can create multiple method with the same name
        // We can overload all methods in Java
        // Method overloading  Parameters Must be different
        // Method over loading type can be Return or Void type with the same name
        // The benefit  of overload method  is 1 method can do different action
        int num = sum(2,2,2,2);
        System.out.println(num);


    }
}
