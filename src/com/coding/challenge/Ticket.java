package com.coding.challenge;

public class Ticket {
	
	public String source;
	public String destination;
	public Integer travellerCount;
	public Integer fare;
	public Integer distanceInKms;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getTravellerCount() {
		return travellerCount;
	}
	public void setTravellerCount(Integer travellerCount) {
		this.travellerCount = travellerCount;
	}
	public Integer getFare() {
		return fare;
	}
	public void setFare(Integer fare) {
		this.fare = fare;
	}
	public Integer getDistanceInKms() {
		return distanceInKms;
	}
	public void setDistanceInKms(Integer distanceInKms) {
		this.distanceInKms = distanceInKms;
	}

	
	public Ticket(String source, String destination, int travellerCount) {
		this.source = source;
		this.destination = destination;
		this.travellerCount = travellerCount;
	}
}
