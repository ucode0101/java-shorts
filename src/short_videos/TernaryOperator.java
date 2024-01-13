package short_videos;

public class TernaryOperator {
    public static void main(String[] args) {
        // Ternary Operator (It's also called "Java Short Hand If...Else")
        //It can be used to replace multiple lines of code with a single line,
        // and it can be used to replace simple if else statements:

        int score = 6;
        String result;

//        if (score > 90){
//            result = "Great";
//        }
//        else if (score > 70 && score < 90){
//            result = "Very good";
//        }
//        else if (score > 60 && score < 70){
//            result = "Good";
//        }
//        else {
//            result = "Not bad";
//        }
//        System.out.println(result);

        result = (score > 90) ? "Great" : (score > 70 && score < 90) ? "Very good" : (score > 60 && score < 70 ) ? "Good" : "Not bad";

        System.out.println(result);



    }
}
