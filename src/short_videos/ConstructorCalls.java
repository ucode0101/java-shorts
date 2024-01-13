package short_videos;

public class ConstructorCalls {

    // this() -> is used for calling Constructor  from another constructor
    // We cannot call more than 1 constructor from another constructor
    /*
      .only constructor can call other constructors
      .constructor cannot be called by its name,
      .constructor call needs to be at the first step in the block
      .One constructor can only call one constructor
      .constructor cannot call itself or contains itself
      .this() is used to call constructor from another constructor within the same class
     */

    // Execution of a constructor ALWAYS depends on the object


    public ConstructorCalls(){
        this("hello");
        System.out.println("I am default Constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("I am int arg Constructor");
    }

    public ConstructorCalls(String str){
        System.out.println("I am String arg Constructor");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls(5);
    }



}
