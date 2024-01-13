package short_videos;

public class Exceptions {
    // Exception is an unwanted or unexpected event
    //Exception is a concept that  breaks the normal flow of the program.

    /*
    In Java, there are two types of exceptions:
      Checked exception --> This type of Exception is called Compile-time Exception
                             We get Compile error / we can Not run our code unless we handle  it.
                             Two ways to handle Checked Exceptions:
                             1 try and catch block
                             2 Add Exception to method signature using throws keyword followed by exception type

     Unchecked exception --> This type of Exception is called Run-time Exception
                              Our code compiles fine, but it occurs during the execution of a program
                              There is only One way to handle Unchecked exception using
                              try and catch block

     */

    public static void main(String[] args) throws Exception {

//        System.out.println("Hello");
//
//       try{
//           Thread.sleep(3000);
//
//       }
//       catch (Exception e){
//           System.out.println("If you see me, something happened in try block");
//       }
//
//        System.out.println("Hello again");

       try {
           System.out.println(5 / 0);
           System.out.println("I am try block");

       }
       catch (Exception e){
           System.out.println("If you see me, something happened in try block :)");
       }
    }





}
