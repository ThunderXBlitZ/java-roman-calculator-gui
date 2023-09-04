package com.illumina.views;

import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SwingView extends JFrame implements IView {
    private JLabel inputLabel;
    private JLabel outputLabel;
    private JTextField inputText;
    private JLabel outputText;
    private JButton calculateBtn;
    private JButton toggleModeBtn;
    private JLabel modeLabel;
    private JLabel errorLabel;


    public SwingView() {
        setTitle("Roman Calculator");

        inputLabel = new JLabel("Input:");
        inputLabel.setBounds(60,100,100,40);
        outputLabel = new JLabel("Output:");
        outputLabel.setBounds(60,200,100,40);
        add(inputLabel);
        add(outputLabel);

        inputText = new JTextField("");
        inputText.setBounds(180,100,100,40);
        outputText = new JLabel("");
        outputText.setBounds(180,200,100,40);
        add(inputText);
        add(outputText);

        calculateBtn = new JButton("Calculate!");
        calculateBtn.setBounds(360,100,100,40);
        toggleModeBtn = new JButton("Toggle!");
        toggleModeBtn.setBounds(360,200,100,40);
        add(calculateBtn);
        add(toggleModeBtn);

        modeLabel = new JLabel("Mode: Roman To Numeral", JLabel.CENTER);
        modeLabel.setBounds(0,0,500,40);
        add(modeLabel);

        errorLabel = new JLabel("Error!", JLabel.CENTER);
        errorLabel.setBounds(0,330,500,40);
        errorLabel.setForeground(Color.RED);
        hideErrorLabel();
        add(errorLabel);

        setSize(500,400);
        setLayout(null);
        setVisible(true);
    }

    public void addToggleButtonListener(ActionListener listener) {
        toggleModeBtn.addActionListener(listener);
    }

    public void addCalculateButtonListener(ActionListener listener){
        calculateBtn.addActionListener(listener);
    }

    public void setOutputText(String value){
        outputText.setText(value);
    }

    public String getInputTextValue(){
        return inputText.getText();
    }

    public void showErrorLabel(String msg){
        errorLabel.setText(msg);
        errorLabel.setVisible(true);
    }

    public void clearOutputText(){
        outputText.setText("");
    }

    public void clearInputText(){
        inputText.setText("");
    }

    public void hideErrorLabel(){
        errorLabel.setVisible(false);
    }

    public void setModeLabel(String mode){
        modeLabel.setText(mode + " MODE");
    }
}