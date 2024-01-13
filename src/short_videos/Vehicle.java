package short_videos;

public class Vehicle {

    protected String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }
    public void showBrand(){
        System.out.println("Brand: "+ brand);
    }

    /*

       this: refers to the instances of the current class
       this(): is used for calling constructor from another constructor in the same class/from current class

      super: refers to the instance of the Super class from subclass
      super(): is used for calling super class's constructor from subclass


             constructor calls:
      at least one parent class' constructor MUST be called in subclass
      if the constructor in parent class is default, it's called automatically in subclass
      if the parent class' constructor is not default, it MUST be called manually in subclass
      by using super() keyword through subclass' constructor
     */


}
