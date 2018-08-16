package com.arith;

// Txr module
//-------------------------------------------------------------------------
class TxrService {
	public boolean txr(double amount, String fromAccNum, String toAccNum) throws AccountBalanceException {
		// load accounts
		double fromAccountBalance = 5000.00;
		if (fromAccountBalance < amount)
			throw new AccountBalanceException();
		return true;
	}
}
//-------------------------------------------------------------------------
//Ticket booking module
//-------------------------------------------------------------------------

class BookingModule {

	private TxrService txrService = new TxrService();

	public void bookTicket() {
		double ticketAmount = 8000.00;
		String fromAccNum = "1";
		String toAccNum = "2";
		try {
			boolean b=txrService.txr(ticketAmount, fromAccNum, toAccNum);
			System.out.println("Ticket confirmed...");
		} catch (AccountBalanceException e) {
			e.printStackTrace();
			System.out.println("ticket not confirmed.." + e.getMessage());
		}
	}
}

//-------------------------------------------------------------------------

public class Simple_App {

	public static void main(String[] args) {

		BookingModule bookingModule = new BookingModule();
		bookingModule.bookTicket();

	}

}
