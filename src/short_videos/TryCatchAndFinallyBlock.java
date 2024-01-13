package short_videos;

import java.io.File;
import java.io.IOException;

public class TryCatchAndFinallyBlock {
    // try and catch and final block
    // try block/statement is used to handle errors/exception while executing our code
    // catch block/statement Only gets executed when an error/exception occurs in the try block
    // we can use multiple catch blocks as well

    // finally block always gets executed no matter what

    // Thread.sleep() -> is used to stop the execution of our code for given time

    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
        }
        finally {
            System.out.println("I always get executed no matter what");
        }

    }





}
