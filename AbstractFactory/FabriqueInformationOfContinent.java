public abstract class FabriqueInformationOfContinent 
{
 
  public abstract MapOfContinent drawMap();
  
  public abstract PopulationOfContinent giveTheNumberOfPopulation();

  public abstract PhoneIndicatorOfContinent giveThePhoneIndicator();


  public static FabriqueInformationOfContinent getTheFabriqueInformationOfTheContinent(String name) 
  {
    switch (name) 
    {
      case "Africa":
        return new FabriqueInformationOfAfrica();
      case "America":
        return new FabriqueInformationOfAmerica();
      case "Asia":
        return new FabriqueInformationOfAsia();
      case "Europe":
        return new FabriqueInformationOfEurope();
      case "Oceania":
        return new FabriqueInformationOfOceania();
      default:
        return null;
    }
  }
}

class FabriqueInformationOfAfrica extends FabriqueInformationOfContinent 
{
  
  public MapOfContinent drawMap()
  {
      return new MapOfAfrica();
  }
  public PopulationOfContinent giveTheNumberOfPopulation() 
  {
    return new PopulationOfAfrica();
  }

  public PhoneIndicatorOfContinent giveThePhoneIndicator() 
  {
    return new PhoneIndicatorOfAfrica();
  }
}

class FabriqueInformationOfAmerica extends FabriqueInformationOfContinent 
{

  public MapOfContinent drawMap()
  {
      return new MapOfAmerica();
  }

  public PopulationOfContinent giveTheNumberOfPopulation() 
  {
    return new PopulationOfAmerica();
  }

  public PhoneIndicatorOfContinent giveThePhoneIndicator() 
  {
    return new PhoneIndicatorOfAmerica();
  }
}

class FabriqueInformationOfAsia extends FabriqueInformationOfContinent
{
    
  public MapOfContinent drawMap()
  {
      return new MapOfAsia();
  }

  public PopulationOfContinent giveTheNumberOfPopulation()
  {
      return new PopulationOfAsia();
  }

  public PhoneIndicatorOfContinent giveThePhoneIndicator()
  {
      return new PhoneIndicatorOfAsia();
  }
}

class FabriqueInformationOfEurope extends FabriqueInformationOfContinent
{

  public MapOfContinent drawMap()
  {
      return new MapOfEurope();
  }

  public PopulationOfContinent giveTheNumberOfPopulation()
  {
      return new PopulationOfEurope();
  }

  public PhoneIndicatorOfContinent giveThePhoneIndicator()
  {
      return new PhoneIndicatorOfEurope();
  }
}

class FabriqueInformationOfOceania extends FabriqueInformationOfContinent
{

  public MapOfContinent drawMap()
  {
      return new MapOfOceania();
  }
  
  public PopulationOfContinent giveTheNumberOfPopulation()
  {
      return new PopulationOfOceania();
  }

  public PhoneIndicatorOfContinent giveThePhoneIndicator()
  {
      return new PhoneIndicatorOfOceania();
  }
}


