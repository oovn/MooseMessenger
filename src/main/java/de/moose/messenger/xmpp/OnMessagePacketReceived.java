package de.moose.messenger.xmpp;

import de.moose.messenger.entities.Account;
import de.moose.messenger.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
