package com.coding.challenge;

public class ConsoleTicketPrinter implements TicketPrintable {

	@Override
	public void PrintTicket(Ticket ticket) {
		System.out.println("Taxi Ticket");
		System.out.println("-----------");
		System.out.println("Source : " + ticket.source.toUpperCase());
		System.out.println("Destination : " + ticket.destination.toUpperCase());
		System.out.println("Kms : " + ticket.getDistanceInKms());
		System.out.println("No. of Travellers = " + ticket.getTravellerCount());
		System.out.println("Total = " + ticket.getFare());	

	}

}
