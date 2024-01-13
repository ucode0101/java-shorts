package short_videos;

public class StringClass {
    public static void main(String[] args) {


        String str = "java";

        // charAt() takes an index/number, and returns the character at the specified index(position) as char

        // indexOf() takes a character, and returns the position of the first found occurrence of specified characters in a string as int
        //System.out.println(str.indexOf('a'));


        // lastIndexOf() Returns the position of the last found occurrence of specified characters in a string as int
       // System.out.println(str.lastIndexOf('a'));


        // length()   Returns the length of string as int

        System.out.println(str.length());


        // concat()  Appends a string to the end of another string
//        str = str.concat(" and selenium");
//        str +=" and selenium";
        //System.out.println(str.concat(" and"));
        //System.out.println(str);

        // toLowerCase()  Converts a string to lower case letters

        String str2 = "JAVA";
        str2 = str2.toLowerCase();
       // System.out.println(str2);

        // toUpperCase() Converts a string to upper case letters

        str2 = str2.toUpperCase();
        //System.out.println(str2);

        // trim()  Removes whitespace from both ends of a string
        //System.out.println(str2.trim());

        // substring()  Returns a new string which is the substring of a specified string

        String s1 = str2.substring(0,2);
        //System.out.println(s1);

        // replace()  Searches a string for a specified value, and returns a new string where the specified values are replaced
//        String s2 = str2.replace("J","P");
        //System.out.println(str2.replace("A","O"));

        // replaceFirst() Replaces the first occurrence of a substring that matches the given regular expression with the given replacement
        //System.out.println(str2.replaceFirst("A","O"));

        // replaceAll() Replaces each substring of this string that matches the given regular expression with the given replacement
        //System.out.println(str2.replaceAll("A","O"));

        // isEmpty() Checks whether a string is empty or not
        String s2 = "";
       // System.out.println(s2.isEmpty());


        // equals()  Compares two strings. Returns true if the strings are equal, and false if not
        String s3 ="Java";
        String s4 = "java";

        //System.out.println(s3.equals(s4));

        // equalsIgnoreCase() Compares two strings, ignoring case considerations
        //System.out.println(s3.equalsIgnoreCase(s4));



        // contains()  Checks whether a string contains a sequence of characters
        //System.out.println(s4.contains("ava"));


        // startsWith()  Checks whether a string starts with specified characters
        //System.out.println(s4.startsWith("jav"));

        // ends With() Checks whether a string ends with the specified character(s)
        System.out.println(s4.endsWith("va"));







    }
}
