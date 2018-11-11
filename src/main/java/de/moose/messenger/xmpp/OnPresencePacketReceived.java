package de.moose.messenger.xmpp;

import de.moose.messenger.entities.Account;
import de.moose.messenger.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
