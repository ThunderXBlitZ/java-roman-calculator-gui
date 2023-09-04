package com.illumina.presenters;

import com.illumina.models.Mode;

public interface IPresenter {
    String runConfigCompute(String input);

    Mode getConfigMode();

    void toggleConfigMode();

    void setViewModeLabel();
}
