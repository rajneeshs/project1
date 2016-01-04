package providers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.inject.Provider;

import interfaces.ICity;
import model.City;

public class CitiesProvider implements Provider<Set<ICity>>
{

    @Override
    public Set<ICity> get()
    {
	List<ICity> cityList = new ArrayList<ICity>();
	return new HashSet<ICity>(cityList);
    }

}
