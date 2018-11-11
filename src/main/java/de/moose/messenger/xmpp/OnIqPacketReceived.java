package de.moose.messenger.xmpp;

import de.moose.messenger.entities.Account;
import de.moose.messenger.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	void onIqPacketReceived(Account account, IqPacket packet);
}
