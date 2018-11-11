package de.moose.messenger.xmpp.jingle;

import de.moose.messenger.entities.Account;
import de.moose.messenger.xmpp.PacketReceived;
import de.moose.messenger.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	void onJinglePacketReceived(Account account, JinglePacket packet);
}
