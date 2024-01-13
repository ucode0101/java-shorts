package short_videos;

public class SwitchStatement {
    public static void main(String[] args) {
     // Switch statement  byte, short, char, int, and String
     // Switch statement does Not accept long, float, double, and boolean

        byte day = 7;
        String dayOfWeek ="";
        double d = 6.6;

        switch (day){

            case 1:
                //System.out.println("Monday");
                dayOfWeek = "Monday";
                break;

            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;

            default:
                System.out.println("Please make sure you have from 1 to 7");
                break;




        }
        System.out.println(dayOfWeek);

    }
}
