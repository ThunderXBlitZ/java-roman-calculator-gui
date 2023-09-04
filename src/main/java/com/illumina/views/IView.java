package com.illumina.views;

import java.awt.event.ActionListener;


public interface IView {
    void addToggleButtonListener(ActionListener listener);

    void addCalculateButtonListener(ActionListener listener);

    void showErrorLabel(String msg);

    void clearOutputText();

    void clearInputText();

    void hideErrorLabel();

    void setOutputText(String value);

    void setModeLabel(String mode);

    String getInputTextValue();
}
