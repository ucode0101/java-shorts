package short_videos;

public class ArraysDemo {
    public static void main(String[] args) {

        // Arrays are used to store multiple values in a single variable,
        // instead of declaring separate variables for each value.
        // You can access an array element by referring to the index number.

        int score1 = 10;

//        int [] scores = new int[5];
//
//        scores[0] = 10;
//        scores[1] = 15;
//        scores[2] = 23;
//        scores[3] = 55;
//        scores[4] = 19;

        int [] scores = {10, 15, 23, 55,19};

        //System.out.println(scores[1]);


//        int a = scores[3];
//        System.out.println(scores[1]);
//        System.out.println(scores[3]);
//        System.out.println(a);

//        String [] str = new String[5];
//        str[0] = "java";
//        str[1] = "selenium";
//        str[2] = "JUnit";
//        str[3] = "python";
//        str[4] = "maven";
//
//        System.out.println(str[2]);
//        String s = str[0];
//        System.out.println(s);
        String str [] ={"java","selenium","JUnit","python","maven"};
//        System.out.println(str[4]);
//        String s = str[4];
//        System.out.println(s);

        for (int i =0; i<str.length; i++){
            System.out.println(str[i]);
        }

        for (int i =0; i< scores.length; i++){
            System.out.println(scores[i]);
        }




    }
}
