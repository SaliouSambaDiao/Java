public abstract class PopulationOfContinent
{    
    public abstract void showInformationPopulation();
    
}

class PopulationOfAfrica extends PopulationOfContinent
{
    
    int myValue = 1216000000;
    public void showInformationPopulation()
    {
        System.out.println("The Africa population is : " + myValue);
    }
}

class PopulationOfAmerica extends PopulationOfContinent
{

    int myValue = 331900000;
    public void showInformationPopulation()
    {
        System.out.println("The America population is : " + myValue);
    }
}

class PopulationOfAsia extends PopulationOfContinent
{

    long myValue =  4679661000L;
    public void showInformationPopulation()
    {
        System.out.println("The Asia population is : " + myValue);
    }
}

class PopulationOfEurope extends PopulationOfContinent
{

    int myValue = 447000000;
    public void showInformationPopulation()
    {
        System.out.println("The Europe population is : " + myValue);
    }
}

class PopulationOfOceania extends PopulationOfContinent
{

    int myValue = 12340000;
    public void showInformationPopulation()
    {
        System.out.println("The Oceania population is : " + myValue);
    }
}