// import java.util.ArrayList;

public class User {

    private String userPassword;

    public User(String p)
    {
        this.userPassword=p;

    }

    public boolean connexionToUserAccount(String myPotentialPassword)
    {
        if(myPotentialPassword.equals(userPassword))
        {
            System.out.println("Connexion successifully done !");
            System.out.println("The password is :" + myPotentialPassword);
            
            return true;
        
        }
        else
        {
            
            return false;
        }        
    }
}
