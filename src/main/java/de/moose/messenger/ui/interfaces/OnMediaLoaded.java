package de.moose.messenger.ui.interfaces;

import java.util.List;

import de.moose.messenger.ui.util.Attachment;

public interface OnMediaLoaded {

    void onMediaLoaded(List<Attachment> attachments);
}
