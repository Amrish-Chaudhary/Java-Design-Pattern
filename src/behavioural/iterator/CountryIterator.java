package behavioural.iterator;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {
    private CountryCollecction countryCollecction;
    int index;
    
    public CountryIterator(CountryCollecction countryCollecction) {
    	this.countryCollecction = countryCollecction;
    	this.index = 0;
	}
    
	@Override
	public boolean hasNext() {
		return index < countryCollecction.getCountryCollection().length;
	}


	public Country next() {
		if(hasNext()) {
			return countryCollecction.getCountryCollection()[index++];
		}
		return null;
	}
	

}
