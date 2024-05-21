package com.unknwndev.gui;

import java.awt.*;

import javax.swing.*;


public class ProductivityAppGui extends JFrame {

    public ProductivityAppGui(){
        // Setup gui and a title
        super("Productivity App");
        
        // End the program when window is terminated
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Set gui size (in pixels)
        setSize(450, 650);
        
        // Load gui at the center of screen
        setLocationRelativeTo(null);
        
        // Manager set to null for manual posiitioning of components
        setLayout(null);
        
        // Prevent any resize
        setResizable(false);
        
        // Background of Gui
        getContentPane().setBackground(Color.darkGray);
        
        addGuiComponents();
        
        setVisible(true);
        
    }

    private void addGuiComponents(){
        // List Title
        GuiTitleBar guiTitleBar = new GuiTitleBar();
        // titleBar.setBackground(Color.red);
        
        add(guiTitleBar);
    }
    
}
