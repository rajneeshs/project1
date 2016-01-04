package providers;

import java.util.Set;

import com.google.inject.Inject;
import com.google.inject.Provider;

import interfaces.ICity;
import interfaces.ICityCollection;
import model.CityCollection;

public class CityCollectionProvider implements Provider<ICityCollection>
{

    private final Set<ICity> citySet;

    @Inject
    public CityCollectionProvider(Set<ICity> citySet)
    {
	super();
	this.citySet = citySet;
    }

    @Override
    public ICityCollection get()
    {
	// TODO Auto-generated method stub
	return new CityCollection(citySet);
    }

}
