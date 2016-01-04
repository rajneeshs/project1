package model;

import com.google.inject.Inject;

import annotations.ActualMarket;
import annotations.FutureMarket;
import interfaces.IBoardMap;
import interfaces.IPlayerOrderTrack;
import interfaces.IPlayers;
import interfaces.IPowerPlantCollection;
import interfaces.IPowerPlantMarket;
import interfaces.IResouceMarket;
import interfaces.IScoringTrack;

public class Board
{
    private final IScoringTrack scoringTrack;
    private final IPlayerOrderTrack playerOrderTrack;
    private final IPowerPlantMarket actualMarket;
    private final IPowerPlantMarket futureMarket;
    private final IPowerPlantCollection powerPlantCollection;
    private final IBoardMap map;
    private final IResouceMarket resourceMarket;
    private final IPlayers players;

    @Inject
    public Board(IScoringTrack scoringTrack, IPlayerOrderTrack playerOrderTrack,
	    @ActualMarket IPowerPlantMarket actualMarket, @FutureMarket IPowerPlantMarket futureMarket, IBoardMap map,
	    IResouceMarket resourceMarket, IPlayers players, IPowerPlantCollection powerPlantCollection)
    {
	super();
	this.scoringTrack = scoringTrack;
	this.playerOrderTrack = playerOrderTrack;
	this.actualMarket = actualMarket;
	this.futureMarket = futureMarket;
	this.map = map;
	this.resourceMarket = resourceMarket;
	this.players = players;
	this.powerPlantCollection = powerPlantCollection;
    }

}
