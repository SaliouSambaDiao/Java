import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AttackDictionnaire implements Attack 
{

  public AttackDictionnaire() {}

  public ArrayList<String> passWordCracker() 
  {
    File dictionnary = new File("/home/cheeks/Bureau/DIC1/Programmation/Programmes Vs Code/Java/dictionnaire.txt");

    ArrayList<String> myListOfPassword = new ArrayList<>();
    try (Scanner word = new Scanner(dictionnary))
    {
      
      while (word.hasNext()) 
      {
        String currentWord = word.next();
        myListOfPassword.add(currentWord);
        
      }
      return myListOfPassword;
    }
    catch (FileNotFoundException e) 
    {
      System.out.println("The file is not found");
      e.printStackTrace();
    }
    return myListOfPassword;
  }
}
