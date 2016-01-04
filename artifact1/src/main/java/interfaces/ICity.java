package interfaces;

import java.util.Map;

public interface ICity
{
    public final int MAX_NO_OF_PLAYERS = 3;

    public String getName();

    public Map<ICity, Integer> getCityLinkages();

    public Map<String, Integer> getPlayerPositionInCity();

    public default int getNoOfPlayersAllowed()
    {
	return MAX_NO_OF_PLAYERS;
    }
}
