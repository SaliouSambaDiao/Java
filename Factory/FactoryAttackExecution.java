import java.util.ArrayList;
import java.util.Scanner;

public class FactoryAttackExecution 
{
  public static void main(String[] args) 
  {
    System.out.println("Give the password !");
    try (Scanner sc2 = new Scanner(System.in)) 
    {
      String pwd = sc2.nextLine();
      System.out.println("Choose a type of attack please!\n Choose '1' if you wanna use 'BruteForce' and '2' if you wanna use 'Dictionnary'");
      try (Scanner sc = new Scanner(System.in))
      {
        int choice = sc.nextInt();
        
        long beggining = System.currentTimeMillis();
        
        Attack typeOfAttack = FactoryAttack.getTypeOfAttack(choice);
        
        ArrayList<String> myListOfPotentialPassword = typeOfAttack.passWordCracker();
        User myCurrentUser = new User(pwd);

        for(String e : myListOfPotentialPassword){
          
          myCurrentUser.connexionToUserAccount(e);
          
        }
        long end = System.currentTimeMillis();
        long executionTime = (end - beggining) / 1000;
        System.out.println("The execution time is : " + executionTime + " seconds");
      }
    }
  }

}
