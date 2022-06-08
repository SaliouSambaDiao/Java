import java.util.Scanner;

public class NameManager 
{  
    public static String getCurrentName()
    {   
        System.out.println("Choose a continent");
        System.out.println("'1' for Africa ");
        System.out.println("'2' for America ");
        System.out.println("'3' for Asia ");
        System.out.println("'4' for Europe ");
        System.out.println("'5' for Oceania ");
        try (Scanner sc = new Scanner(System.in)) 
        {
            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    return "Africa";
                case 2:
                    return "America";
                case 3:
                    return "Asia";
                case 4:
                    return "Europe";
                case 5:
                    return "Oceania";
                default:
                    return null;
            }
        }
        
    }
}
