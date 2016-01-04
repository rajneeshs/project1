package model;
/*******************************************************************************
 * 2015, All rights reserved.
 *******************************************************************************/

import java.util.HashMap;
import java.util.Map;

/**
 * Description of MarketBucket.
 * 
 * @author Rajneesh
 */
public class MarketBucket implements MarketBucketInterface
{

    private int price = 0;
    private Map<Resources, Integer> resourceToMaxQuantityMap = null;
    private Map<Resources, Integer> resourceToCountMap = null;

    public MarketBucket(int price, Map<Resources, Integer> resourceToMaxQuantityMap,
	    Map<Resources, Integer> resourceToCountMap)
    {
	super();
	if (price <= 0)
	{
	    throw (new IllegalArgumentException("non-positive  price"));
	}
	this.price = price;
	this.resourceToMaxQuantityMap = new HashMap<>(resourceToMaxQuantityMap);
	if (resourceToMaxQuantityMap == null || resourceToMaxQuantityMap.isEmpty())
	{
	    throw (new IllegalArgumentException("Invalid resourceToMaxQuantityMap"));
	}
	this.resourceToCountMap = new HashMap<>();
    }

    public int getPrice()
    {
	return price;
    }

    public int getMaxQuantityOfResource(Resources resource)
    {
	return this.resourceToMaxQuantityMap.get(resource);
    }

    public int getCountOf(Resources resource)
    {
	return this.resourceToCountMap.get(resource);
    }

}
