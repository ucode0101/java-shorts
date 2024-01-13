package short_videos;

public class Cat extends Animal{

    public void sound(){
        System.out.println("Hello Cat");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}
