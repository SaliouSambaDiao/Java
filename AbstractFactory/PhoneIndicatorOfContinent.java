public abstract class PhoneIndicatorOfContinent //Abstact PhoneIndicator
{
  public abstract void displayInformation();

}

class PhoneIndicatorOfAfrica extends PhoneIndicatorOfContinent
{
  int myValue = 2;
  public void displayInformation() 
  {
    System.out.println("The Africa indicator number is : " + myValue);
  }
}

class PhoneIndicatorOfAmerica extends PhoneIndicatorOfContinent 
{
  int myValue = 1;
  public void displayInformation() 
  {
    System.out.println("The America indicator number is : " + myValue);
  }
}

class PhoneIndicatorOfAsia extends PhoneIndicatorOfContinent 
{
  int myValue = 4;
  public void displayInformation() 
  {
    System.out.println("The Asia indicator number is : " + myValue);
  }
}

class PhoneIndicatorOfEurope extends PhoneIndicatorOfContinent 
{
  int myValue = 3;
  public void displayInformation() 
  {
    System.out.println("The Europe indicator number is : " + myValue);
  }
}

class PhoneIndicatorOfOceania extends PhoneIndicatorOfContinent 
{
  int myValue = 5;
  public void displayInformation() 
  {
    System.out.println("The Oceania indicator number is : " + myValue);
  }
}
