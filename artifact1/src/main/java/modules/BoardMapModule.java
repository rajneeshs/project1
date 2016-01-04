package modules;

import java.util.Set;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;

import interfaces.ICity;
import interfaces.ICityCollection;
import model.City;
import providers.CitiesProvider;
import providers.CityCollectionProvider;

public class BoardMapModule extends AbstractModule
{

    @Override
    protected void configure()
    {
	bind(ICityCollection.class).toProvider(CityCollectionProvider.class);
	bind(ICity.class).to(City.class);
	bind(new TypeLiteral<Set<ICity>>()
	{
	}).toProvider(CitiesProvider.class).in(Singleton.class);

    }

}
