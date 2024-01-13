package short_videos;

public class ForLoop {
    public static void main(String[] args) {

        for(int i =1; i<=10; i++){
            //System.out.println("Hello World");
        }
       String s = "javaAndSelenium";
        //System.out.println(s.charAt(0));

        for (int j =s.length()-1; j >=0; j--){
            //System.out.print(s.charAt(j));

        }

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'n'){
                break;
            }
            else {
                System.out.print(s.charAt(i));
            }

        }

        System.out.println();
        System.out.println("=================================");

        for (int i =0; i<s.length(); i++){
            if (s.charAt(i) == 'a'){
                continue;
            }
            else {
                System.out.print(s.charAt(i));
            }
        }






        // break:
        //We used break in switch statement. It is used to jump out/break of a switch statement.
        //The break statement can also be used to jump out/break of a loop.

        // continue:
        //continue statement breaks one iteration (in the loop)
        // if a specified condition occurs, and continues with the next iteration in the loop.

    }
}
