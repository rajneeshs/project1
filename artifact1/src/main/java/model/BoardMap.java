package model;

import com.google.inject.Inject;

import interfaces.IBoardMap;
import interfaces.ICityCollection;

public class BoardMap implements IBoardMap
{
    private final ICityCollection cityCollection;

    public BoardMap(ICityCollection cityCollection)
    {
	super();
	this.cityCollection = cityCollection;
    }

}
