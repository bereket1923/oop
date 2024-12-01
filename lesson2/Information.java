package oop.lesson2;

public class Information {
    private String email;
    private String name;

    public void setEmail(String email){
        this.email = email;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public String getName(){
       return name;
    }
    public Information(String email, String name){
        email=email;//without keyword this the output null b/c this calls current object
        // in the main class
        this.name =name;
    }
    public static void main(String[] args){
        Information s =new Information("ma@edu", "Abebe");
        Information as =new Information("yes@123","kebede");

        s.getEmail();
        s.getName();
        System.out.println(s.name);
        System.out.println(s.email);






    }
}
