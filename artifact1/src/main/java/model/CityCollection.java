package model;

import java.util.Set;

import interfaces.ICity;
import interfaces.ICityCollection;

public class CityCollection implements ICityCollection
{

    private Set<ICity> citySet;

    public CityCollection(Set<ICity> citySet)
    {
	this.citySet = citySet;
    }

}
