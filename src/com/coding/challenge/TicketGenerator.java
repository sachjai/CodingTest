package com.coding.challenge;

public class TicketGenerator {

	public void GenerateTicket(String source, String destination, Integer travellerCount) {
		Ticket ticket = new Ticket(source, destination, travellerCount);
		CalculateDistance(ticket);
		if (ticket.distanceInKms > 0) {
			CalculateTicketFare(ticket, Constants.BASE_KMS, Constants.BASE_FARE);
			TicketPrintable printable = new ConsoleTicketPrinter();
			printable.PrintTicket(ticket);
		}
		else {
			System.out.println( ticket.source + " to " + ticket.destination + " route distance information not available");
		}

	}

	public void CalculateDistance(Ticket ticket) {

		RoutesInfo routesInfo = new RoutesInfo();
		ticket.distanceInKms = routesInfo.getRouteDistance(ticket.getSource(), ticket.getDestination());

	}

	public void CalculateTicketFare(Ticket ticket, Integer baseKms, Integer baseFare) {
		if ((ticket.distanceInKms - baseKms) > 0) {
			Integer extraKms = ticket.distanceInKms - baseKms;
			Integer extraFare = extraKms * Constants.PER_KMS_RATE;
			ticket.setFare((baseFare + extraFare) * ticket.getTravellerCount());
		} else {
			ticket.setFare(baseFare * ticket.getTravellerCount());
		}

	}

}
