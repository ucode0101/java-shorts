package short_videos;

public class Encapsulation {
    // OOP Object-oriented Programming (OOP)
    // Encapsulation is one of the OOP Principles
    // Encapsulation means hiding the data by giving private access modifier
    // to instance variables and providing public access by getter and setter

   private String dateOfBirth;
   private long ssn;

   public void setSsn(long ssn){
       this.ssn = ssn;
   }
   public long getSsn(){
       return ssn;
   }
   public void setDateOfBirth(String dateOfBirth){
       this.dateOfBirth = dateOfBirth;
   }

   public String getDateOfBirth(){
       return dateOfBirth;
   }
}
