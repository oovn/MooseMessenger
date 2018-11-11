package de.moose.messenger.xmpp;

import de.moose.messenger.entities.Contact;

public interface OnContactStatusChanged {
	public void onContactStatusChanged(final Contact contact, final boolean online);
}
