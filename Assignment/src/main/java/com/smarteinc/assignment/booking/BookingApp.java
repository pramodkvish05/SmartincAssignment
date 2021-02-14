package com.smarteinc.assignment.booking;

import java.util.Objects;

public class BookingApp {
	
public int bookingProcess(Ticket x) {
	if(x.getType() == 1) {
		validateAllFieldsPresent(x);
		bookBusTicket(x);
		sendTicketBookedMail(x);
	} else if(x.getType() == 2){
		validateAllFieldsPresent(x);
		bookCarTicket(x);
		sendTicketBookedMail(x);
	} else if (x.getType() != 1 && x.getType() != 2) {
		throw new IllegalArgumentException("Only type 1 and 2 tickets are supported");
	}
	
	//method should return the type of ticket booked
	return x.getType();
}

private void bookCarTicket(Ticket x) {
	//assume Car is booked by making some entries in db
}

private void bookBusTicket(Ticket x) {
	//assume Bus is booked by making some entries in db
}


private void sendTicketBookedMail(Ticket x) {
	//Assume email is sent to passenger that his/her ticket is booked
}

//Ensure all input data is present
void validateAllFieldsPresent(Ticket ticket) {
	Objects.requireNonNull(ticket);
	Objects.requireNonNull(ticket.getStartDate());
	Objects.requireNonNull(ticket.getEndDate());
	
	Objects.requireNonNull(ticket.getFrom());
	Objects.requireNonNull(ticket.getDestination());
	Objects.requireNonNull(ticket.getPassenger());
	
}
}


