package model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.inject.Inject;

import interfaces.ICity;

public class City implements ICity
{

    private String name;
    private Map<ICity, Integer> linkages;
    private Map<String, Integer> playerPositionInCity;

    
    public City(String name, Map<ICity, Integer> linkages)
    {
	super();
	this.name = name;
	this.linkages = linkages;
	playerPositionInCity = new HashMap<String, Integer>();
    }

    @JsonProperty("name")
    public String getName()
    {
	return name;
    }

    @Override
    public Map<ICity, Integer> getCityLinkages()
    {
	return linkages;
    }

    @Override
    public Map<String, Integer> getPlayerPositionInCity()
    {
	return playerPositionInCity;
    }

}
