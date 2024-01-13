package short_videos;

public class WhileAndDoWhileLoops {
    public static void main(String[] args) {

        int num =1;

        while (num <=20){
            if (num == 10){
                break;
            }
            System.out.print(num+" ");
            num++;
        }

        System.out.println();
        System.out.println("=================");

        int i =1;

        do {
            if (i == 10){
                break;
            }
            System.out.print(i+" ");
            i++;
        } while (i <=20);


        // break:
        //We used break in switch statement and for loop. It is used to jump out/break of a switch statement/for loop.
        //The break statement can also be used to jump out/break of a while loop or do while loop.

        // continue:
        //continue statement breaks one iteration (in the loop)
        // if a specified condition occurs, and continues with the next iteration in the loop.



    }
}
