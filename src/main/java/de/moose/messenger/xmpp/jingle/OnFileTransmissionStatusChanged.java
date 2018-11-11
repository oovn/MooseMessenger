package de.moose.messenger.xmpp.jingle;

import de.moose.messenger.entities.DownloadableFile;

public interface OnFileTransmissionStatusChanged {
	void onFileTransmitted(DownloadableFile file);

	void onFileTransferAborted();
}
