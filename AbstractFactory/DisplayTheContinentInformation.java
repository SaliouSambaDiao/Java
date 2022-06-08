public class DisplayTheContinentInformation 
{
  PopulationOfContinent populationOfContinent;
  PhoneIndicatorOfContinent phoneIndicatorOfContinent;
  MapOfContinent mapOfContinent;

	public void display()
	{
		System.out.println("------- Display The Informations --------");

    String currentName = NameManager.getCurrentName();
		FabriqueInformationOfContinent fabriqueInformationOfContinent = FabriqueInformationOfContinent.getTheFabriqueInformationOfTheContinent(currentName);
    
    populationOfContinent = fabriqueInformationOfContinent.giveTheNumberOfPopulation();
    phoneIndicatorOfContinent = fabriqueInformationOfContinent.giveThePhoneIndicator();
    mapOfContinent = fabriqueInformationOfContinent.drawMap();

    populationOfContinent.showInformationPopulation();
    phoneIndicatorOfContinent.displayInformation();
    mapOfContinent.drawingMap();

		System.out.println("--------- Informations successfully displayed ---------");
	}
}
