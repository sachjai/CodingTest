package com.coding.challenge;

import java.util.HashMap;

public class RoutesInfo {
	
	private HashMap<String, Integer> routesDistance ;
	
	public RoutesInfo()
	{
		routesDistance = new HashMap<String, Integer>();
		routesDistance.put("PUNE_MUMBAI", 120);
		routesDistance.put("PUNE_NASIK", 200);
		routesDistance.put("MUMBAI_GOA", 350);
		routesDistance.put("MUMBAI_NASIK", 180);
	}
	
	public Integer getRouteDistance(String source, String destination) 
	{
		String key = source.toUpperCase() + "_" + destination.toUpperCase();
		if(routesDistance.containsKey(key))
		{
			return routesDistance.get(key);
		}
		else
		{
			return 0;
		}
		
	}
	
}
