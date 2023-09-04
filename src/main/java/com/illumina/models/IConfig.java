package com.illumina.models;

public interface IConfig {
    Mode getMode();

    String getRoman();

    int getNumeral();

    void toggleMode();

    String compute(String input);

    void clearValues();
}
