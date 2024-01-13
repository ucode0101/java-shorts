package short_videos;

public class IfAndElseIfStatements {

    public static void main(String[] args) {

         // first it checks if condition  is true it will run the code. it does Not go to else if.
        // else if statement is used to specify a new condition if the first condition is false.
        // if condition is true else if block will be executed (code inside { } will run)
        // we can have as many else if statements as we want. We can Not have else if without if statement

        int score = 7;
        if (score >=90){
            System.out.println("Great");
        }
        else if (score <90 && score >=80){
            System.out.println("Verry good");
        }
        else if(score <80 && score >=70){
            System.out.println("Good");
        }
        else if(score >50 && score < 70){
            System.out.println("Not bad");
        }
        else {
            System.out.println("Your score is not in the range");
        }



    }
}
