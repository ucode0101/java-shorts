package short_videos;

public  class FinalKeyword {
    /*
    final keyword is  used for classes,
    methods, and variables which makes them non-changeable

    When a variable is declared as final, its value cannot be changed once it has been initialized
    variable that has final keyword is called constant variable

    When a method is declared as final, it cannot be overridden by a subclass

    When a class is declared as final, it cannot be extended by a subclass

     */
    public final void iAmFinal(){
        System.out.println("Hello");
    }
    final String DATE_OF_BIRTH = "December 1, 1990";


//    public static void main(String[] args) {
//
//
//        String dateOfBirth = "Aug 5, 1989";
//
//        dateOfBirth = "May 6, 1999";
//
//        //DATE_OF_BIRTH = "January 2, 1991";
//
//        final int NUM = 10;
//       // NUM = 20;
//
//    }



}
