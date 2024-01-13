package short_videos;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("Mike");
        //student1.name = "Mike";

        Student student2 = new Student("Sara",22, 'F',"U-Code Academy");

        System.out.println(student2.name);
        System.out.println(student2);


    }
}
