package com.unknwndev;
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
    }

}
