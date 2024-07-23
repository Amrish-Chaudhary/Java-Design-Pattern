package behavioural.iterator;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		Country india = new Country("INDIA");
		Country pakistan = new Country("PAKISTAN");
		Country china = new Country("CHINA");
		Country iran = new Country("IRAN");
		Country iraq = new Country("IRAQ");
		
		CountryCollecction countryCollecction = new CountryCollecction(india, pakistan, china, iran, iraq);
		Iterator<Country> iterator = countryCollecction.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next().getName());
	}
}
