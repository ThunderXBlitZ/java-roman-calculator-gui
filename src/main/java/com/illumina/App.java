package com.illumina;

import com.illumina.models.IConfig;

import javax.swing.SwingUtilities;

import com.illumina.models.AppConfig;
import com.illumina.presenters.IPresenter;
import com.illumina.presenters.AppPresenter;
import com.illumina.views.IView;
import com.illumina.views.SwingView;


public class App
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                IConfig appConfig = new AppConfig();
                IView swingView = new SwingView();
                IPresenter appPresenter = new AppPresenter(appConfig, swingView);
            }
        });
    }
}
