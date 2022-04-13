package OnlineStore.Helpdesk.Facades;

import OnlineStore.Helpdesk.Enteties.SupportTicket;

public interface HelpDeskFacade {

	void addNewSupportTicket(SupportTicket supportTicket);

	SupportTicket getNextSupportTicket();

	/**
	 * @return amount of tickets that are not processed
	 */
	int getNumberOfTickets();

}
