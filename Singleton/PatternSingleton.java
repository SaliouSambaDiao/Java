public class PatternSingleton {   

    private static PatternSingleton oneInstance;
    private static int Port = 80;

    private PatternSingleton(){}

    public static PatternSingleton getInstance()
    {
        if (oneInstance == null)
        {
            oneInstance = new PatternSingleton();
        }
        return oneInstance;
    }
    public static int getPort()
    {
        return Port;
    }

}