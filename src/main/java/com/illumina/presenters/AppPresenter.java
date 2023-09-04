package com.illumina.presenters;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.illumina.models.IConfig;
import com.illumina.models.Mode;
import com.illumina.views.IView;


public class AppPresenter implements IPresenter{
    private final IConfig model;
    private final IView view;

    public AppPresenter(IConfig config, IView view){
        this.model = config;
        this.view = view;

        view.addToggleButtonListener(new ToggleButtonListener());
        view.addCalculateButtonListener(new CalculateButtonListener());

        setViewModeLabel();
    }

    class ToggleButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            toggleConfigMode();
            setViewModeLabel();
        }
    }

    class CalculateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String inputValue = view.getInputTextValue();
            try {
                String outputValue = runConfigCompute(inputValue);
                view.setOutputText(outputValue);
                view.hideErrorLabel();
            } catch (IllegalArgumentException error) {
                view.showErrorLabel(error.getMessage());
                view.clearOutputText();
            }
        }
    }

    public String runConfigCompute(String input) throws IllegalArgumentException{
        return model.compute(input);
    }

    public Mode getConfigMode(){
        return model.getMode();
    }

    public void toggleConfigMode(){
        model.toggleMode();
        view.hideErrorLabel();
        view.clearInputText();
        view.clearOutputText();
        model.clearValues();
    }

    public void setViewModeLabel(){
        String mode = getConfigMode().name();
        view.setModeLabel(mode);
    }
}
