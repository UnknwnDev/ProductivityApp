package com.unknwndev;

import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                // Display Productivity App gui
                new ProductivityAppGui().setVisible(true);
            }
        });
    }
}