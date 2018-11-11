package de.moose.messenger.ui;

public interface UiInformableCallback<T> extends UiCallback<T> {
    void inform(String text);
}
