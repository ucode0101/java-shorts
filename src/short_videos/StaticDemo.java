package short_videos;

public class StaticDemo {
    public static void main(String[] args) {
        Statics.sayHello();

        Statics name1 = new Statics();
        name1.name ="James";
        System.out.println(name1.name);
        name1.sayHello();

        Statics name2 = new Statics();
        name2.name = "Robert";
        System.out.println(name2.name);
        System.out.println(name1.name);




    }
}
