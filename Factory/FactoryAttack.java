public class FactoryAttack 
{
  public FactoryAttack() {}

  public static Attack getTypeOfAttack(int choice)
  {  Attack myAttack = null;
    
      if (choice == 1) 
      {
         myAttack = new AttackBruteForce();

      } 
      else if (choice == 2) 
      {
        myAttack = new AttackDictionnaire();
        
      }
    
    return myAttack;
  }
}
