package providers;

import java.util.Set;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;

import interfaces.IBoardMap;
import interfaces.ICityCollection;
import model.BoardMap;
import modules.BoardMapModule;

public class BoardMapProvider implements Provider<IBoardMap>
{

    private Injector injector;

    private ICityCollection cityCollection;

    @Inject
    public BoardMapProvider(ICityCollection cityCollection)
    {

	//injector = Guice.createInjector(new BoardMapModule());	 
	this.cityCollection = cityCollection;

    }

    @Override
    public IBoardMap get()
    {
	return new BoardMap(cityCollection);
    }

}
