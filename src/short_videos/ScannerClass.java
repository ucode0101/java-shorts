package short_videos;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        // nextByte() Returns input as a byte / Reads a byte value from the user

        // nextShort() Returns input as a short / Reads a short value from the user

        // nextInt() Returns input as an int / Reads an int value from the user

        // nextLong() Returns input as a long / Reads a long value from the user

        // nextBoolean() Returns input as a boolean / Reads a boolean value from the user

        // nextFloat() Returns input as a float / Reads a float value from the user

        // nextDouble() Returns input as a double / Reads a double value from the user

        // next() Returns input(single word) as a String / Reads a String value from the user
        //nextLine() Returns input as String


        // next() vs nextLine()

        //next() can read the input only till the space. It can't read two words separated by a space.
        //Also, next() places the cursor in the same line after reading the input.

        //nextLine() reads input including space between the words (it reads till the end of line \n).
        // Once the input is read, nextLine() positions the cursor in the next line

        // if you use next() followed by nextLine() the behavior can affected.

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter your first name");
//
//        String firstName = input.next();
//
//        System.out.println("Enter your last name");
//
//        String lastName = input.next();
//        input.nextLine();
//
//        System.out.println("Enter your date of birth");
//
//        String birthData = input.nextLine();
//
//        System.out.println(firstName);
//        System.out.println(lastName);
//        System.out.println(birthData);


        System.out.println("Enter your first name");

        String firstName = input.nextLine();

        System.out.println("Enter your last name");

        String lastName = input.nextLine();


        System.out.println("Enter your date of birth");

        String birthData = input.nextLine();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(birthData);

        input.close();








    }
}
