package short_videos;

public class WrapperClass {
    public static void main(String[] args) {

     int n = 10;

     Integer n2 = n;
     int n3 = n2;
     int max = Integer.MAX_VALUE;
     int min = Integer.MIN_VALUE;
//        System.out.println(max);
//        System.out.println(min);
        char ch = 's';
        Character ch2 =ch;
//        System.out.println(Character.isDigit(ch));
//        System.out.println(Character.isLetter(ch));
//
        String str = "j12ava12";

        // this will print only digits/number
        for (int i=0;i<str.length(); i++){
            char c = str.charAt(i);

            if (Character.isDigit(c)){
                System.out.print(c);
            }
        }
        System.out.println();

        // this will print only letters/characters
        for (int i=0; i< str.length(); i++){
            char c2 = str.charAt(i);

            if(Character.isLetter(c2)){
                System.out.print(c2);
            }
        }

    }
}
