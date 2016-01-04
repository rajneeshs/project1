package modules;

import java.util.Set;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;

import annotations.ActualMarket;
import annotations.FutureMarket;
import interfaces.IBoardMap;
import interfaces.ICity;
import interfaces.ICityCollection;
import interfaces.IPlayerOrderTrack;
import interfaces.IPlayers;
import interfaces.IPowerPlantCollection;
import interfaces.IPowerPlantMarket;
import interfaces.IResouceMarket;
import interfaces.IScoringTrack;
import model.City;
import model.CityCollection;
import model.PlayerOrderTrack;
import model.Players;
import model.PowerPlantCollection;
import model.PowerPlantMarket;
import model.ResouceMarket;
import model.ScoringTrack;
import providers.BoardMapProvider;
import providers.CitiesProvider;
import providers.CityCollectionProvider;

public class BoardModule extends AbstractModule
{

    @Override
    protected void configure()
    {
	// bind(IBoardMap.class).to(BoardMap.class);
	bind(IBoardMap.class).toProvider(BoardMapProvider.class);
	bind(ICityCollection.class).toProvider(CityCollectionProvider.class);
	bind(new TypeLiteral<Set<ICity>>()
	{
	}).toProvider(CitiesProvider.class).in(Singleton.class);
	bind(IPlayerOrderTrack.class).to(PlayerOrderTrack.class);
	bind(IPlayers.class).to(Players.class);
	bind(IPowerPlantMarket.class).annotatedWith(ActualMarket.class).to(PowerPlantMarket.class);
	bind(IPowerPlantMarket.class).annotatedWith(FutureMarket.class).to(PowerPlantMarket.class);
	bind(IPowerPlantCollection.class).to(PowerPlantCollection.class);
	bind(IResouceMarket.class).to(ResouceMarket.class);
	bind(IScoringTrack.class).to(ScoringTrack.class);

    }

    // @Provides
    // IBoardMap provideBoardMap()
    // {
    // return new BoardMap();
    // }

    // @Provides
    // IPlayerOrderTrack providePlayerOrderTrack()
    // {
    // return new PlayerOrderTrack();
    // }
    //
    // @Provides
    // IPlayers providePlayers()
    // {
    // return new Players();
    // }
    //
    // @Provides
    // IPowerPlantMarket providesPowerPlantMarket()
    // {
    // return new PowerPlantMarket();
    // }
    //
    // @Provides
    // IResouceMarket providesResouceMarket()
    // {
    // return new ResouceMarket();
    // }
    //
    // @Provides
    // IScoringTrack provideScoringTrack()
    // {
    // return new ScoringTrack();
    // }
}
