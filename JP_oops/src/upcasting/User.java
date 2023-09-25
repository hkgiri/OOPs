package upcasting;
class Webdriver
{
}
class Chromedriver extends Webdriver
{
	Chromedriver()
	{
		System.out.println("Chrome Driver is Lunched");
	}
}
class Gecodriver extends Webdriver
{
	Gecodriver()
	{
		System.out.println("Geco Driver is Lunched");
	}
}
class Moziladriver extends Webdriver
{
	Moziladriver()
    {
		System.out.println("Mozila Driver is Lunched ");
	}
}
class IEdriver extends Webdriver
{
	IEdriver()
	{
		System.out.println("IE Driver is Lunched");
	}
}
public class User {
	public static void main(String[] args) {
		Webdriver driver;
		driver =new Chromedriver();
		driver =new Gecodriver();
		driver =new Moziladriver();
		driver =new IEdriver();
		
	}
}
