package de.moose.messenger.xmpp.jingle;

public interface OnTransportConnected {
	public void failed();

	public void established();
}
