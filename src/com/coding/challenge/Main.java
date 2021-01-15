package com.coding.challenge;

public class Main {

	public static void main(String[] args) {		
		
		String source = "Pune";
		String destination ="Nasik";
		Integer travellerCount = 2;		
		
		TicketGenerator ticketGenerator = new TicketGenerator();
		ticketGenerator.GenerateTicket(source, destination, travellerCount);

	}

}
