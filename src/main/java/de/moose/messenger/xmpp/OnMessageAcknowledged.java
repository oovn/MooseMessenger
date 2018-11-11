package de.moose.messenger.xmpp;

import de.moose.messenger.entities.Account;

public interface OnMessageAcknowledged {
	boolean onMessageAcknowledged(Account account, String id);
}
