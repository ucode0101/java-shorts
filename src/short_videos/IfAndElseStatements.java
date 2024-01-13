package short_videos;

public class IfAndElseStatements {
    public static void main(String[] args) {
        // else if statement is used to specify a new condition if the first condition is false.
        // if the (if) condition is true the else statement/condition will not be executed/checked
        // else statement/block must be after if statement/block.
        // You can Not have else statement by itself. You can have only one else statement
        int score = 10;

        if (score > 5){
            System.out.println("You won");
        }
        else{
            System.out.println("Sorry you lost");

        }

    }
}
