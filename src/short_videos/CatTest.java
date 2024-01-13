package short_videos;

public class CatTest extends Animals{
    public void makeSound(){
        System.out.println("Mew mew");
    }

    public static void main(String[] args) {
        CatTest cat = new CatTest();
        cat.makeSound();
    }
}
