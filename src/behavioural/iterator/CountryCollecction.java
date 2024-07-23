package behavioural.iterator;

import java.util.Iterator;

public class CountryCollecction implements Iterable<Country>{

	private final Country[] countryCollection;
	
	public CountryCollecction(Country...countries) {
		this.countryCollection = countries;
	}
	public Country[] getCountryCollection() {
		return countryCollection;
	}
	
	@Override
	public Iterator<Country> iterator() {
		return new CountryIterator(this);
	}

}
