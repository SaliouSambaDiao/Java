public class ServeurService {

  private static ServeurService serveur;
  private static int numberOfPort;
  private static ServeurService S;

  private ServeurService() {
    System.out.println("Le port 80 est utilise par " + S);
  }

  public static ServeurService getServeur() {
    if (numberOfPort == 80) {
      if (serveur == null) {
        ServeurService serveur = new ServeurService();
      }
      return serveur;
    } else {
      return null;
    }
  }
}
