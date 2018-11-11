package de.moose.messenger.xmpp;

import de.moose.messenger.entities.Account;

public interface OnStatusChanged {
	public void onStatusChanged(Account account);
}
