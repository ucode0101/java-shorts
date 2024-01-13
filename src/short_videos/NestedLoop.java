package short_videos;

public class NestedLoop {
    public static void main(String[] args) {
        //Nested loop is a loop inside another loop
        //The outer loop controls the number of iterations,
        // while the inner loop executes its statements repeatedly for each iteration of the outer loop.

//        for (int i = 1; i <= 5; i++) { // i == 1; i<=5 is true
//            for (int j = 1; j <= 5; j++) {
//                System.out.println(j);
//            }
//            System.out.println("==================");
//        }

        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        for (int i=0; i<twoDArray.length; i++){

            for (int j=0; j <twoDArray[i].length; j++){ // twoDArray[2].length

                System.out.print(twoDArray[i][j]+" "); // twoDArray[2][2]

            }
            System.out.println();

        }





    }
}
