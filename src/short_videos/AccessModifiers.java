package short_videos;

public class AccessModifiers {

    public String publicAccess ="I am public"; // Accessible from anywhere within the project
    protected String protectedAccess = "I am protected"; // Accessible withing the same package, and can be inherited from any package
    String defaultAccess = "I am default"; // Accessible within the same package
    private String privateAccess = "I am private";
    // Accessible within the same class, we can read and write using public getter and setter outside of class

    public void setPrivateAccess(String str){
        privateAccess = str;
    }

    public String getPrivateAccess() {
        return privateAccess;
    }
}


