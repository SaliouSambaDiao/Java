public abstract class MapOfContinent //The Abstract Map
{
    
    public abstract void drawingMap();
}

class MapOfAfrica extends MapOfContinent //Africa's Map
{

    public void drawingMap()
    {
        System.out.println("The Africa map is this :)");
    }
}

class MapOfAmerica extends MapOfContinent //America's Map
{
    
    public void drawingMap()
    {
        System.out.println("The America map is this :)");
    }
}

class MapOfAsia extends MapOfContinent //Asia's Map
{
    
    public void drawingMap()
    {
        System.out.println("The Asia map is this :)");
    }
}

class MapOfEurope extends MapOfContinent //Europe's Map
{

    public void drawingMap()
    {
        System.out.println("The Europe map is this :)");
    }
}

class MapOfOceania extends MapOfContinent //Oceania's Map
{

    public void drawingMap()
    {
        System.out.println("The Oceania map is this :)");
    }
}