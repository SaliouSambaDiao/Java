import java.lang.Math;
import java.util.ArrayList;

public class AttackBruteForce implements Attack {

  public AttackBruteForce() {}

  public ArrayList<String> passWordCracker() {
    String[] characters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1", "2","3","4", "5","6","7","8","9","0"};

    ArrayList<String> myListOfPassword = new ArrayList<>();
    
    // Les mots de pass de un caractere
    for (int i = 0; i < characters.length; i++) {
      String firstTest = (characters[i]);
      myListOfPassword.add(firstTest);

      // Les mots de pass de deux caracteres
      if (myListOfPassword.size() == (int) Math.pow(62, 1)) // on fait ce calcul por s'assurer que tous les mots de un caractere sont ajouter dans notre liste
      {
        for (int ja = 0; ja < characters.length; ja++) 
        {
          String firstLetter = characters[ja];
          for (int jb = 0; jb < characters.length; jb++) 
          {
            String secondTest = firstLetter + "" + characters[jb];
            myListOfPassword.add(secondTest);

            // Les mots de pass de trois caracteres
            if (myListOfPassword.size() == (int) Math.pow(62, 2)) //ici aussi de meme
            {
              for (int ka = 0; ka < characters.length; ka++) 
              {
                String firstLetter3 = characters[ka];
                for (int kb = 0; kb < characters.length; kb++) 
                {
                  String secondLetter3 = firstLetter3 + "" + characters[kb];
                  for (int kc = 0; kc < characters.length; kc++) 
                  {
                    String thirdTest = secondLetter3 + "" + characters[kc];
                    myListOfPassword.add(thirdTest);                    

                    // Les mots de pass de quatre caracteres
                    // if (myListOfPassword.size() == (int) Math.pow(62, 3)) 
                    // {
                    //   for (int la = 0; la < characters.length; la++) 
                    //   {
                    //     String firstLetter4 = characters[la];
                    //     for (int lb = 0; lb < characters.length; lb++) 
                    //     {
                    //       String secondLetter4 = firstLetter4 + "" + characters[lb];
                    //       for (int lc = 0; lc < characters.length; lc++) 
                    //       {
                    //         String thirdLetter4 =
                    //           secondLetter4 + "" + characters[lc];
                    //         for (int ld = 0; ld < characters.length; ld++) 
                    //         {
                    //           String fourthTest = thirdLetter4 + "" + characters[ld];
                    //             myListOfPassword.add(fourthTest);

                    //           // Les mots de pass de cinq caracteres
                    //           if (myListOfPassword.size() == (int) Math.pow(62, 4)) 
                    //           {
                    //             for (int ma = 0; ma < characters.length; ma++) 
                    //             {
                    //               String firstLetter5 = characters[ma];
                    //               for (int mb = 0; mb < characters.length; mb++) 
                    //               {
                    //                 String secondLetter5 = firstLetter5 + "" + characters[mb];
                    //                 for (int mc = 0; mc < characters.length; mc++) 
                    //                 {
                    //                   String thirdLetter5 = secondLetter5 + "" + characters[mc];
                    //                   for (int md = 0; md < characters.length; md++) 
                    //                   {
                    //                     String fourthLetter5 = thirdLetter5 + "" + characters[md];
                    //                     for (int me = 0; me < characters.length; me++) 
                    //                      {
                    //                        String fivethTest = fourthLetter5 + "" + characters[me];
                    //                        myListOfPassword.add(fivethTest);

                    //                       // Les mots de pass de six caracteres
                    //                       if (myListOfPassword.size() == (int) Math.pow(62, 5)) 
                    //                       {
                    //                         for (int na = 0; na < characters.length; na++) 
                    //                         {
                    //                           String firstLetter6 = characters[na];
                    //                           for (int nb = 0; nb < characters.length; nb++) 
                    //                           {
                    //                             String secondLetter6 = firstLetter6 + "" + characters[nb];
                    //                             for (int nc = 0; nc < characters.length; nc++) 
                    //                             {
                    //                               String thirdLetter6 = secondLetter6 + "" + characters[nc];
                    //                               for (int nd = 0; nd < characters.length; nd++) 
                    //                               {
                    //                                 String fourthLetter6 = thirdLetter6 + "" + characters[nd];
                    //                                 for (int ne = 0; ne < characters.length; ne++) 
                    //                                 {
                    //                                   String fivethLetter6 = fourthLetter6 + "" + characters[ne];
                    //                                   for (int nf = 0; nf < characters.length; nf++) 
                    //                                   {
                    //                                     String sixethTest = fivethLetter6 + "" + characters[nf];
                    //                                     myListOfPassword.add(sixethTest);

                    //                                     // Les mots de pass de sept caracteres
                    //                                     if (myListOfPassword.size() == (int) Math.pow(62, 6)) {
                    //                                       for (int oa = 0; oa < characters.length; oa++) 
                    //                                       {
                    //                                         String firstLetter7 = characters[oa];
                    //                                         for (int ob = 0; ob < characters.length; ob++) 
                    //                                         {
                    //                                           String secondLetter7 = firstLetter7 + "" + characters[ob];
                    //                                           for (int oc = 0; oc < characters.length; oc++) 
                    //                                           {
                    //                                             String thirdLetter7 = secondLetter7 + "" + characters[oc];
                    //                                             for (int od = 0; od < characters.length; od++) 
                    //                                             {
                    //                                               String fourthLetter7 = thirdLetter7 + "" + characters[od];
                    //                                               for (int oe = 0; oe < characters.length; oe++) 
                    //                                               {
                    //                                                 String fivethLetter7 = fourthLetter7 + "" + characters[oe];
                    //                                                 for (int of = 0; of < characters.length; of++) 
                    //                                                 {
                    //                                                   String sixethLetter7 = fivethLetter7 + "" + characters[of];
                    //                                                   for (int og = 0; og < characters.length; og++) 
                    //                                                   {
                    //                                                     String seventhTest = sixethLetter7 + "" + characters[og];
                    //                                                     myListOfPassword.add(seventhTest);

                    //                                                     // Les mots de pass de huit caracteres
                    //                                                     if (myListOfPassword.size() == (int) Math.pow(62,7))
                    //                                                     {
                    //                                                       for (int pa = 0; pa < characters.length; pa++) 
                    //                                                       {
                    //                                                         String firstLetter8 = characters[pa];
                    //                                                         for (int pb = 0; pb < characters.length; pb++) 
                    //                                                         {
                    //                                                           String secondLetter8 = firstLetter8 + "" + characters[pb];
                    //                                                           for (int pc = 0; pc < characters.length; pc++) 
                    //                                                           {
                    //                                                             String thirdLetter8 = secondLetter8 + "" + characters[pc];
                    //                                                             for (int pd = 0; pd < characters.length; pd++) 
                    //                                                             {
                    //                                                               String fourthLetter8 = thirdLetter8 + "" + characters[pd];
                    //                                                               for (int pe = 0; pe < characters.length; pe++) 
                    //                                                               {
                    //                                                                 String fivethLetter8 = fourthLetter8 + "" + characters[pe];
                    //                                                                 for (int pf = 0; pf < characters.length; pf++) 
                    //                                                                 {
                    //                                                                   String sixethLetter8 = fivethLetter8 + "" + characters[pf];
                    //                                                                   for (int pg = 0; pg < characters.length; pg++) 
                    //                                                                   {
                    //                                                                     String seventhLetter8 = sixethLetter8 + "" + characters[pg];
                    //                                                                     for (int ph = 0; ph < characters.length; ph++) 
                    //                                                                     {
                    //                                                                       String eightthTest = seventhLetter8 + "" + characters[ph];
                    //                                                                       myListOfPassword.add(eightthTest);
                    //                                                                     }
                    //                                                                   }
                    //                                                                 }
                    //                                                               }
                    //                                                             }
                    //                                                           }
                    //                                                         }
                    //                                                       }
                    //                                                     }
                    //                                                   }
                    //                                                 }
                    //                                               }
                    //                                             }
                    //                                           }
                    //                                         }
                    //                                       }
                    //                                     }
                    //                                   }
                    //                                 }
                    //                               }
                    //                             }
                    //                           }
                    //                         }
                    //                       }
                    //                      } //okay five
                    //                    }
                    //                  }
                    //                }
                    //              }
                    //            }
                    //          } //okay four
                    //        }
                    //      }
                    //   }
                    // }
                  } //okay three
                }
              }
            }
          } //okay two
        }
      }
    }
    
    return myListOfPassword;
  }
}
