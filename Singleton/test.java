import java.util.Scanner;

public class test 
{
    public static void main(String[] args) 
    {     
        try (Scanner Clavier = new Scanner(System.in)) 
        {
            int numberOfPort=0;

            System.out.println("Entrer le numero de port: ");
            numberOfPort = Clavier.nextInt();
            System.out.println("Le numero de port entré est " + numberOfPort);
        }
        
        ServeurService serveur = ServeurService.getServeur();
    }
}