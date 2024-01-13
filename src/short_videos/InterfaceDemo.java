package short_videos;

public interface InterfaceDemo {
    /*
     Two ways to achieve abstraction:
       1. Abstract Class
       2. Interface

       abstract class vs interface:
	   both used to achieving abstraction
	   both cannot be final
       both meant to be inherited

      abstract class:
	   can have constructor
	   instance method
	   blocks
	   instance variables
	   All access modifiers

	   interface:
	   default method We have to give body
	   abstract method
	   static method we need to give body
       public access modifier is given by default to methods and variables.
       variables are static and final by default

       To inherit class or abstract class, we need to use extends keyword
       To inherit interface we need to use implements keyword

       We can Only inherit one class/abstract class,
       but we can inherit multiple interfaces using implements keyword

     */

    void makeSound();

    default void someMethod(){
        System.out.println("Hello, I'm default method");
    }

    static void staticMethod(){
        System.out.println("Hello, I'm static method");
    }




}