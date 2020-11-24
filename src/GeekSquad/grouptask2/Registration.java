package GeekSquad.grouptask2;

public class Registration {
    String email;
    String userName;
    private String password;

   public void userEmail(String email){
        if(!email.contains("@yahoo.com")){
            System.out.println("Invalid email type");
        }else{
            System.out.println("Your email "+email+" is set");
        }
    }
    public void setUserParameters(String userName,String password){
        this.password=password;

        if (!userName.isEmpty()){
            if(userName.length()>6){
                System.out.println(userName+" is valid user name");
            }else{
                System.out.println("User name should have more than 6 characters");
            }
        }else{
            System.out.println("User name can not be empty");
        }
        if(!password.isEmpty()){
            if(password.length()>6){
                System.out.println("Your password is valid");
            }else{
                System.out.println("Password should have more than 6 characters");
            }
            if(password.equals(userName)){
                System.out.println("Password can not contain user name");
            }
        }else{
            System.out.println("Password con not be empty");
        }
    }
}

class RegistrationTest{
    public static void main(String[] args) {
        Registration user1=new Registration();
        user1.userEmail("user1@yahoo.com");
        user1.setUserParameters("user_one","1234abcd");
        System.out.println("-----------");
        Registration user2=new Registration();
        user2.userEmail("user2@gmail.com");
        user2.setUserParameters("user2","user2");
    }
}
